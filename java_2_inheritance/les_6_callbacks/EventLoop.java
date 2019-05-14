// Copyright: GEATEC engineering
// License: Apache 2

import java.util.function.Consumer;
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

public class EventLoop {
      
    // ====== Public part ======
    
    // --- Methods ---
    
    public EventLoop (int maxNrOfPendingEvents) {
        this.eventQueue = new Queue (maxNrOfPendingEvents);
    }
    
    public void simulate (Event event) throws Exception {
        this.eventQueue.put (event);
    }
    
    public void setKeyboardHandler (Consumer <KeyboardEvent> keyboardHandler) {
        this.keyboardHandler = keyboardHandler;
    }
    public void setMouseHandler (Consumer <MouseEvent> mouseHandler) {
        this.mouseHandler = mouseHandler;
    }
        
    public void runForever () throws Exception {
        while (true) {
            if (eventQueue.getSize () > 0) {
                Event event = (Event) eventQueue.get ();
                if (event instanceof KeyboardEvent) {
                    keyboardHandler.accept ((KeyboardEvent) event);
                }
                else if (event instanceof MouseEvent) {
                    mouseHandler.accept ((MouseEvent) event);
                } 
            }
        }
    }
     
    // ====== Private part ======
    
    // --- Fields ---
    
    private Queue eventQueue;
    private Consumer <KeyboardEvent> keyboardHandler;
    private Consumer <MouseEvent> mouseHandler;    
}
