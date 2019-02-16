// Copyright: GEATEC engineering
// License: Apache 2

import java.lang.System;

public class Main {    
    public static void main (String [] args) {
        Obfuscator obfuscator = new Obfuscator (256);
        
        try {
            obfuscator.put ("Time");
            obfuscator.put ("flies");
            obfuscator.put ("like");
            print (obfuscator.get ());
            print (obfuscator.get ());
            obfuscator.put ("an");
            obfuscator.put ("arrow");

            obfuscator.put ("");

            obfuscator.put ("Fruit");
            print (obfuscator.get ());
            obfuscator.put ("flies");
            obfuscator.put ("like");
            obfuscator.put ("a");
            obfuscator.put ("banana");

            while (!obfuscator.empty ()) {
                print (obfuscator.get ());
            }
        }
        catch (Exception exception) {
            print (exception.toString ());
        }
    }
    
    private static void print (Object anObject) {
        System.out.print (anObject.toString () + "\n");
    }
}
