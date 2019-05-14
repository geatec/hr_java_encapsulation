// Copyright: GEATEC engineering
// License: Apache 2

public class Tree {

    // ====== Public part ======
    
    // --- Methods ---
    
    public Tree () {
        this (rootPayload);
    }  

    public Tree store (String payload) {    // We choose not to allow duplicates
        int comparisonResult = payload.compareTo (this.payload);
        if (comparisonResult < 0) {
            if (left != null) {
                left.store (payload);
            }
            else {
                left = new Tree (payload);
            }
        }
        else if (comparisonResult > 0) {
            if (right != null) {
                right.store (payload);
            }
            else {
                right = new Tree (payload);
            }
        }
        return this;
    }
    
    public void dump () {    // Produces a tree
        dump (0);
    }
    
    public void print () {   // Produces a sorted list, ignoring the root
        if (left != null) {
            left.print ();
        }
        if (!payload.equals (rootPayload)) {
            System.out.println (payload);
        }
        if (right != null) {
            right.print ();
        }
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected String payload;
    protected static final String rootPayload = "ROOT";
    protected static final String tab = "    ";
    protected static final String none = "(null)";
    
    protected Tree left;
    protected Tree right;
    
    // --- Methods ---
    
    protected Tree (String payload) {
        this.payload = payload;
        left = null;
        right = null;
    }
    
    protected void indent (int tabLevel) {
        for (int tabIndex = 0; tabIndex < tabLevel; tabIndex++) {
            System.out.print (tab);
        }
    }
    
    protected void dump (int tabLevel) {
        indent (tabLevel);
        System.out.println (payload);
        
        if (left != null) {
            left.dump (tabLevel + 1);
        }
        else {
            indent (tabLevel + 1);
            System.out.println (none);
        }
        if (right != null) {
            right.dump (tabLevel + 1);
        }
        else {
            indent (tabLevel + 1);
            System.out.println (none);
        }
    }     
}