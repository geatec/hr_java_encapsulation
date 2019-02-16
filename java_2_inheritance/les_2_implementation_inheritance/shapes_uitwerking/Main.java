// Copyright: GEATEC engineering
// License: Apache 2

import java.util.Random;

public class Main {
    
    // ====== Public part ======
    
    // --- Methods ---    
    
    public static void main (String [] args) {
        for (int groupIndex = 0; groupIndex < 2; groupIndex++) {
            if (debug) {
                canvas
                    .add (new Circle    (-5, -10, 20))
                    .add (new Ellipse   (0, 0, 30, 15))
                    .add (new Square    (5, 10, 40))
                    .add (new Rectangle (0, 0, 60, 30));
            }
            else {
                canvas
                    .add (new Circle    (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./16, 1./8)))
                    .add (new Ellipse   (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./16, 1./8), randomDelta (1./32, 1./16)))
                    .add (new Square    (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./8, 1./4)))
                    .add (new Rectangle (randomDelta (-3./8, 3./8), randomDelta (-3./8, 3./8), randomDelta (1./8, 1./4), randomDelta (1./16, 1./8)));
            }
        }
        
        for (char [] pixelCharPair: pixelCharPairs) {
           console.input ("Press [Enter] to render with " + pixelCharPair [0] + " and " + pixelCharPair [1] + "\n");
           canvas.render (pixelCharPair [0], pixelCharPair [1]);
           console.print ("");
        }
    }
    
    // ====== Private part ======
    
    // --- Fields ---
    
    private static final Boolean debug = false;
    private static final int canvasSide = 64;
    private static final char [][] pixelCharPairs = {{'*', '.'}, {'M', '-'}};
    private static final Random random = new Random ();
    private static final Canvas canvas = new Canvas (canvasSide, canvasSide);
    private static final Console console = new Console ();
    
    // --- Methods ----
    
    private static float randomDelta (double lowerBound, double upperBound) {
        return (float) (lowerBound * canvasSide + random.nextInt ((int) Math.max (1., (upperBound - lowerBound) * canvasSide)));
    }
}
