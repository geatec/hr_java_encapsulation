// Copyright: GEATEC engineering
// License: Apache 2

public class Queue {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public Queue (int maximumSize) {
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

    public Object put (Object element) throws Exception {
        if (size < maximumSize) {
            size++;
            putIndex = getNextIndex (putIndex);
            elements [putIndex] = element;
            return element;
        }
        else {
            throw (new Exception ("Queue overflow"));
        } 
    }

    public Object get () throws Exception {
        if (size > 0) {
            size--;
            getIndex = getNextIndex (getIndex);
            Object result = elements [getIndex];
            elements [getIndex] = null;         // Release element for garbage collection
            return result;
        }
        else {
            throw (new Exception ("Can't get from empty queue"));
        }
    }

    public int getSize () {
        return size;
    }
        
    // ====== Private part ======
    
    // --- Fields ---
    
    private Object [] elements;
    private int size = 0;
    private int getIndex = 0;
    private int putIndex = 0;
    private int maximumSize = 0;
    
    // --- Methods ---

    private int getNextIndex (int index) {
        return (index + 1) % maximumSize;
    }    
}
