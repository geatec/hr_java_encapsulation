// Copyright: GEATEC engineering
// License: Apache 2

public class Rectangle extends Square {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public Rectangle (float x, float y, float side, float otherSide) {
        super (x, y, side);
        this.otherSide = otherSide;
    }
        
    public void draw () {
        drawSide (otherSide, side, false);
        drawSide (side, otherSide, true);
        drawSide (-otherSide, side, false);
        drawSide (-side, otherSide, true);        
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float otherSide;
}