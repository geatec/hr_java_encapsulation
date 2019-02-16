// Copyright: GEATEC engineering
// License: Apache 2

import java.util.Scanner;

class Console {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public static void print (Object anObject, Boolean endl) {
        System.out.print (anObject.toString () + (endl ? "\n" : ""));
    }
    
    public static void print (Object anObject) {
        print (anObject, true);
    }
    
    public static String input (Object anObject) {
        print (anObject, false);
        return System.console () .readLine ();
    }    
}