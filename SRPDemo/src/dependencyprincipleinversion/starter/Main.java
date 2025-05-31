package dependencyprincipleinversion.starter;

public class Main {
    public static void main(String[] args){
        Bulb bulb=new Bulb();
        Switch switch1=new Switch(bulb);
        switch1.press();
        switch1.press();
        switch1.press();

        Fan fan1=new Fan();
       // Switch switch2=new Switch(fan1);
       /* switch2.press();
        switch2.press();
        switch2.press();*/
    }
}
