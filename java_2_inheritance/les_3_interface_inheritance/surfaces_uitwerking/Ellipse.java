// Copyright: GEATEC engineering
// License: Apache 2

public class Ellipse extends Circle {

    // ====== Public part ======
    
    // --- Methods ---
    
    public Ellipse (float x, float y, float radius, float otherRadius) {
        super (x, y, radius);
        this.otherRadius = otherRadius;
    }
        
    public void draw () {
        for (float angleInDegrees = 0; angleInDegrees < 360; angleInDegrees += angleStepsizeInDegrees) {
            float angleInRadians = (float) Math.toRadians (angleInDegrees);
            float radiusAtCurrentAngle = otherRadius * radius / (float) Math.sqrt (Math.pow (otherRadius * Math.cos (angleInRadians), 2) + Math.pow (radius * Math.sin (angleInRadians), 2));
           drawPointRelative (radiusAtCurrentAngle * (float) Math.cos (angleInRadians), radiusAtCurrentAngle * (float) Math.sin (angleInRadians));
        }
    }
    
    public float getArea () {
        return (float) Math.PI * radius * otherRadius;
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected float otherRadius;
}