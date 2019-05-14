// Copyright: GEATEC engineering
// License: Apache 2

public class Main {

    // ====== Public part ======
    
    // --- Methods ---
    
    public static void main (String [] args) throws Exception {
        
        // Create event loop
        eventLoop = new EventLoop (256);
        
        // Set event handlers for keyboard and mouse
        eventLoop.setKeyboardHandler (event -> handleKeyboard (event));
        eventLoop.setMouseHandler (event -> handleMouse (event));
        
        // Simulate some keyboard input
        eventLoop.simulate (new KeyboardEvent ("press", "A"));
        eventLoop.simulate (new KeyboardEvent ("release", "A"));
        eventLoop.simulate (new KeyboardEvent ("press", "B"));
        eventLoop.simulate (new KeyboardEvent ("release", "B"));
        eventLoop.simulate (new KeyboardEvent ("press", "C"));
        eventLoop.simulate (new KeyboardEvent ("release", "C"));
        
        // Simulate some mouse input
        eventLoop.simulate (new MouseEvent ("click", 100, 200));
        eventLoop.simulate (new MouseEvent ("double_click", 300, 400));
        
        // Start event loop
        eventLoop.runForever ();
    }
    
    // ====== Private part ======
    
    // --- Fields ---
        
    private static EventLoop eventLoop;

    // --- Methods ---    
    
    private static void handleKeyboard (KeyboardEvent event) {
        System.out.print ("Handled keyboard " + event.kind + " event, key =" + event.key + "\n");
    }
    
    private static void handleMouse (MouseEvent event) {
        System.out.print ("Handled mouse " + event.kind + " event at x = " + event.x + ", y = " + event.y + "\n");
    }        
}
