// Copyright: GEATEC engineering
// License: Apache 2

import java.util.List;
import java.util.LinkedList;

public class Canvas {   // Central origin, horizontal x, vertical y

    // ====== Public part ======
    
    // --- Methods ---
    
    public Canvas (int width, int height) {
        this.width = width;
        this.height = height;
        xCenter = width / 2;
        yCenter = height / 2;
        deviceContext = new Boolean [this.width][this.height];  // Use fields rather than params, since in general they may be transformed
        console = new Console ();
        clear ();
    }
    
    public void clear () {
        shapeList = new LinkedList <Shape> ();
    }
    
    public Canvas add (Shape shape) {
        shapeList.add (shape);
        shape.canvas = this;
        return this;
    }
    
    public void render (char pixelOnChar, char pixelOffChar) {
        // Set all pixels of device context to off
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                deviceContext [row][column] = false;
            }
        }
        
        // Allow all shapes that are on the canvas to switch their pixels on
        for (Shape shape: shapeList) {
            shape.draw ();
        }
        
        // Project contents of device context onto the console, translated to chars
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                console.print (deviceContext [row][column] ? pixelOnChar : pixelOffChar, false);
                console.print (' ', false);    // Approximately normalize coordinate system
            }
            console.print (""); // Go to next line
        }
    }
    
    public void drawPoint (float x, float y) {
        deviceContext [Math.round (yCenter - y)][Math.round (xCenter + x)] = true;
    }
    
    // ====== Protected part ======
    
    // --- Fields ---
    
    protected int width;
    protected int height;
    protected float xCenter;
    protected float yCenter;
    protected List <Shape> shapeList;
    protected Boolean deviceContext [][];
    protected Console console;
}