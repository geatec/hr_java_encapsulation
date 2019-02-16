// Copyright: GEATEC engineering
// License: Apache 2

public abstract class Shape {

    // ====== Public part ======
    
    // --- Methods ---
    
    public Shape (float x, float y) {
        this.x = x;
        this.y = y;
    }
        
    public abstract void draw ();
   
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected Canvas canvas;
    protected float x;
    protected float y;
    
    // --- Methods ---
    
    protected void drawPointRelative (float deltaX, float deltaY) {
        canvas.drawPoint (x + deltaX, y + deltaY);
    }
}
