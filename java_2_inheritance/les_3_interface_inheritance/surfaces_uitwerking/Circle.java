// Copyright: GEATEC engineering
// License: Apache 2

import java.lang.Math;

public class Circle extends Shape implements Surface {

    // ====== Public part ======
    
    // --- Methods ---
    
    public Circle (float x, float y, float radius) {
        super (x, y);
        this.radius = radius;
    }
        
    public void draw () {
        for (float angleInDegrees = 0; angleInDegrees < 360; angleInDegrees += angleStepsizeInDegrees) {
            float angleInRadians = (float) Math.toRadians (angleInDegrees);
            drawPointRelative (radius * (float) Math.cos (angleInRadians), radius * (float) Math.sin (angleInRadians));
        }
    }
    
    public float getArea () {
        return (float) Math.PI * radius * radius;
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float radius;
    protected static final float angleStepsizeInDegrees = 0.01f;
}