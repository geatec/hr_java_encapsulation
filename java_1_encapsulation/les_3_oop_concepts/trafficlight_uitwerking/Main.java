// Copyright: GEATEC engineering
// License: Apache 2

import java.util.*;

class Main {    // Needed by repl.it
    public static TrafficLight trafficLights [] = {new TrafficLight ("Coolsingel"), new TrafficLight ("Weena")};
        
    public static void main (String [] args) {
        print ("");
        showStates ();
        while (true) {
            int answer = Integer.parseInt (input ("\nAdvance state of light nr: (0 to quit): "));

            if (0 < answer && answer < 3) {
                trafficLights [answer - 1] .goToNextState ();
                showStates ();
            }
            else {
                print ("Program terminated");
                break;
            }
        }
    };

    private static void showStates () {
        for (int index = 0; index < trafficLights.length; index++) {
                print (
                    "Light nr " + Integer.toString (index + 1) +
                    ": " + trafficLights [index] .location +
                    ", color: " + trafficLights [index] .getColor ()
                );
        }
    }

    private static void print (Object anything) {
        System.out.print (anything.toString () + "\n");
    };   
    
    private static String input (String prompt) {
        System.out.print (prompt.toString () + " ");
        return System.console () .readLine ();
    };
}
