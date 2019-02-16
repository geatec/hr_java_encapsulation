// Copyright: GEATEC engineering
// License: Apache 2

import java.util.Random;

public class Main {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public static void main (String [] args) {
        String [] prompts = {
            "How much money do you want to withdraw? ",
            "Want coins aye? How many? ",
            "Enter amount of coins you need: "
        };
        CoinInput [] coinInputs = {
            new CoinInput (2),
            new CheckedInput (3, 1, 100),
            new RepeatedInput (4, 10, 1000, 3)
        };
        Console console = new Console ();
        Random random = new Random ();
        for (int attemptIndex = 0; attemptIndex < 2; attemptIndex++) {
            for (CoinInput coinInput: coinInputs) {
                try {
                    float euros = coinInput.ask (prompts [random.nextInt (3)]);
                    console.print ("That's " + euros + " euros");
                }
                catch (CoinInputException coinInputException) {
                    console.print (coinInputException.getMessage ());
                }
                catch (Exception exception) {
                    console.print ("Something really, really wrong here:");
                    console.print (exception.getMessage ());
                }
            }
        }
    }
}
