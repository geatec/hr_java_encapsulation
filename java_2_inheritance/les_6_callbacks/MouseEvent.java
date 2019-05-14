// Copyright: GEATEC engineering
// License: Apache 2

public class MouseEvent extends Event {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public MouseEvent (String kind, int x, int y) {
        super (kind);
        this.x = x;
        this.y = y;
    }
    
    // --- Fields ---
    
    public int x;
    public int y;
}
