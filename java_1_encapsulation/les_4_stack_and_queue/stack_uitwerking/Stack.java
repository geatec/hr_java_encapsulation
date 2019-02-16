// Copyright: GEATEC engineering
// License: Apache 2

public class Stack {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public Stack (int maximumSize) {
        clear (maximumSize);
    }

    public void clear (int maximumSize) {   // Local variable will hide field by the same name, use 'this' to distinguish
        this.maximumSize = maximumSize;     // Don't use contorted names to solve non-existing name conflicts
        clear ();
    }

    public void clear () {
        elements = new Object [maximumSize];
        size = 0;
    }

    public Object push (Object element) throws Exception {
        if (size < maximumSize) {
            elements [size++] = element;
            return element;
        }
        else {
            throw (new Exception ("Stack overflow"));
        } 
    }

    public Object pop () throws Exception {
        if (size > 0) {
            Object result = elements [--size];
            elements [size] = null;         // Release element for garbage collection
            return result;
        }
        else {
            throw (new Exception ("Can't pop from empty stack"));
        }
    }
        
    // ====== Private part ======
    
    // --- Fields ---
    
    private Object [] elements;
    private int size = 0;
    private int maximumSize = 0;
}
