package openclosedprinciple;

public class Main {
    public static void main(String[] args){
        DigitalPiano digitalPiano=new DigitalPiano();
        MusicBand musicBand=new MusicBand(digitalPiano);
        musicBand.startShow();
    }
}
