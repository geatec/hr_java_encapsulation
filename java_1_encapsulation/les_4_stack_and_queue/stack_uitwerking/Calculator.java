// Copyright: GEATEC engineering
// License: Apache 2

import java.lang.System;

public class Calculator {
    /*
    Question: What's the outcome of 2[enter] 5[enter] 3[enter] +[enter] *[enter]? Why?

    Just for fun, you may turn this thing into a useable scientific RPN calculator by adding:
    s(in), c(os), t(an), (arc)S(in), (arc)C(os), (arc)T(an), e(xp), l(n), r(oot) and p(ow).
    */
    
    // ======= Public part ======
    
    // --- Methods ---
    
    public Calculator () {
        print ("This calculator uses Reverse Polish Notation,");
        print ("just like the one that helped put man on the moon:\n");
        print ("<operand 1>[enter] <operand 2>[enter] <operator>[enter]\n");
        print ("Operators: +-*/");
        print ("To clear, enter c, to quit, enter q\n");


        String anInput = "";    // In case of a name conflict, consistently prefix a or an, best things get best names
        do {
            try {
                anInput = input ();
                
                switch (anInput.charAt (0)) {
                    case '+': {
                        print (stack.push ((float) stack.pop () + (float) stack.pop ()));
                        break;
                    }
                    case '-': {
                        print (stack.push (-(float) stack.pop () + (float) stack.pop ()));
                        break;
                    }
                    case '*': {
                        print (stack.push ((float) stack.pop () * (float) stack.pop ()));
                        break;
                    }
                    case '/': {
                        print (stack.push ((1 / (float) stack.pop ()) * (float) stack.pop ()));
                        break;
                    }
                    case 'c': {
                        stack.clear ();
                        break;
                    }
                    case 'q': {
                        break;
                    }
                    default: {
                        try {
                            stack.push (Float.parseFloat (anInput));
                        }
                        catch (Exception exception) {
                            print (exception);  
                        }
                    }
                }
            }
            catch (Exception exception) {
                print (exception);
            }
        }
        while (anInput.charAt (0) != 'q');
    }
    
    // ====== Private part ======
    
    // --- Fields ---
    
    private final int stackSize = 4;
    private Stack stack = new Stack (stackSize);
    
    // --- Methods ---
    
    private void print (Object anObject) {
        System.out.print (" " + anObject.toString () + "\n");
    }
    
    private String input () {
        return System.console () .readLine ();
    }
}
