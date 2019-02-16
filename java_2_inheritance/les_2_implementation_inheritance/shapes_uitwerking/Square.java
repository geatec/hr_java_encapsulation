// Copyright: GEATEC engineering
// License: Apache 2

public class Square extends Shape {
    
    // ====== Public part ======
    
    // --- Methods ---
    
    public Square (float x, float y, float side) {
        super (x, y);
        this.side = side;
    }
        
    public void draw () {
        drawSide (side, side, false);
        drawSide (side, side, true);
        drawSide (-side, side, false);
        drawSide (-side, side, true);        
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float side;
    
    // --- Methods ---
    
    protected void drawSide (float doubleOffset, float length, Boolean vertical) {
        int offset = getHalfOfEven (doubleOffset);
        int halfLength = getHalfOfEven (length);
        if (vertical) { // Move out of inner loop for speed
            for (int deltaLength = -halfLength; deltaLength <= halfLength; deltaLength++) {
                drawPointRelative (offset, deltaLength);
            }
        }
        else {
            for (int deltaLength = -halfLength; deltaLength <= halfLength; deltaLength++) {
                drawPointRelative (deltaLength, offset);
            }
        }
    }
    
    protected int getHalfOfEven (float aFloat) {
        return (int) (aFloat - aFloat % 2) / 2;
    }
}