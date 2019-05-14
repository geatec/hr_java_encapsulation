// Copyright: GEATEC engineering
// License: Apache 2

public abstract class Event {   // Abstract because we don't want it instantiated
    protected Event (String kind) {
        this.kind = kind;
    }
    
    public String kind;
}
