// Copyright: GEATEC engineering
// License: Apache 2

public class KeyboardEvent extends Event{
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public KeyboardEvent (String kind, String key) {
        super (kind);
        this.key = key;
    }
    
    // --- Fields ---
    
    public String key; 
}
