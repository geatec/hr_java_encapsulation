// Copyright: GEATEC engineering
// License: Apache 2

import java.util.Random;

public class Main {
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
        Conio conio = new Conio ();
        Random random = new Random ();
        for (int attemptIndex = 0; attemptIndex < 2; attemptIndex++) {
            for (CoinInput coinInput: coinInputs) {
                try {
                    float euros = coinInput.ask (prompts [random.nextInt (3)]);
                    conio.print ("That's " + euros + " euros");
                }
                catch (CoinInputException coinInputException) {
                    conio.print (coinInputException.getMessage ());
                }
                catch (Exception exception) {
                    conio.print ("Something really, really wrong here:");
                    conio.print (exception.getMessage ());
                }
            }
        }
    }
}
