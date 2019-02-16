// Copyright: GEATEC engineering
// License: Apache 2

class TrafficLight {
    public String location = "";   //No pressing need to encapsulate

    public TrafficLight (String location) {
        this.location = location;
    }
        
    public void goToNextState () {
        state = (state + 1) % 3;
    }

    public String getColor () {
        return colors [state];

    }
    
    private int state = 0;          // Encapsulate for safety
    private static final String [] colors = {"green", "yellow", "red"};
}
