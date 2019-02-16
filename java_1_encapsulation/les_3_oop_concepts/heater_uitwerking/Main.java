// Copyright: GEATEC engineering
// License: Apache 2

import java.lang.System;

class Main {    // Needed by repl.it
    public static void main (String [] args) {
        Heater roomHeater = new Heater ();
        Heater hallHeater = new Heater ();
        Heater greenhouseHeater = new Heater ();
        print ("");
        
        roomHeater.setTemperature (20f, 'C');
        print ("Room heater:");
        print (roomHeater.getTemperatureString ('K'));
        print (roomHeater.getTemperatureString ('C'));
        print (roomHeater.getTemperatureString ('F'));
        print ("");
        
        print ("Hall heater:");
        hallHeater.setTemperature (60.8f, 'F');
        print (hallHeater.getTemperatureString ('K'));
        print (hallHeater.getTemperatureString ('C'));
        print (hallHeater.getTemperatureString ('F'));
        print ("");
        
        print ("Greenhouse heater:");
        greenhouseHeater.setTemperature (300f, 'K');
        print (greenhouseHeater.getTemperatureString ('K'));
        print (greenhouseHeater.getTemperatureString ('C'));
        print (greenhouseHeater.getTemperatureString ('F'));
        print ("");        
    };

    private static void print (Object anything) {
        System.out.print (anything.toString () + "\n");
    };   
}
