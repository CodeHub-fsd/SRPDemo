package dependencyprincipleinversion.starter;

import dependencyprincipleinversion.starter.Bulb;

public class Switch {
    private Bulb bulb;
    private boolean on;

    public Switch(Bulb bulb) {
        this.bulb = bulb;
        this.on=false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        boolean checkOn=isOn();
        if(checkOn){
            bulb.turnOff();
            this.on=false;
        }
        else {
            bulb.turnOn();
            this.on=true;
        }
    }
}
