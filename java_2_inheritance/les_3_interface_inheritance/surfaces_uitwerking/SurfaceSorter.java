// Copyright: GEATEC engineering
// License: Apache 2

import java.util.ArrayList;

public class SurfaceSorter {    // Everything public, since the SurfaceSorter itself is meant to be encapsulated.
    
    // ====== Public part ======
    
    // --- Fields ---
    
    public ArrayList <Surface> surfaceList;

    // --- Methods ---
    
    public void clear () {
        surfaceList = new ArrayList <Surface> ();
    }
    
    public SurfaceSorter add (Surface surface) {
        surfaceList.add (surface);
        return this;
    }
    
    public void sort (Boolean descending) { // Bubblesort
        Boolean swapMade = false;
        do {
            swapMade = false;
            if (descending) { // Moved out of inner loop for speed sake, at the expense of some code duplication
                for (int indexOfFirstSurface = 0; indexOfFirstSurface < surfaceList.size () - 1; indexOfFirstSurface++) {
                    if (surfaceList.get (indexOfFirstSurface) .getArea () < surfaceList.get (indexOfFirstSurface + 1) .getArea ()) {
                        Surface temporarySurface = surfaceList.get (indexOfFirstSurface);
                        surfaceList.set (indexOfFirstSurface, surfaceList.get (indexOfFirstSurface + 1));
                        surfaceList.set (indexOfFirstSurface + 1, temporarySurface);
                        swapMade = true;
                    }
                }
            }
            else {
                for (int indexOfFirstSurface = 0; indexOfFirstSurface < surfaceList.size () - 1; indexOfFirstSurface++) {
                    if (surfaceList.get (indexOfFirstSurface) .getArea () > surfaceList.get (indexOfFirstSurface + 1) .getArea ()) {
                        Surface temporarySurface = surfaceList.get (indexOfFirstSurface);
                        surfaceList.set (indexOfFirstSurface, surfaceList.get (indexOfFirstSurface + 1));
                        surfaceList.set (indexOfFirstSurface + 1, temporarySurface);
                        swapMade = true;
                    }
                }
            }
        }
        while (swapMade);
    }
}
