package practice.openclosedprinciple;

public class MusicBand {
    DigitalPiano digitalPiano;
    MusicBand(DigitalPiano digitalPiano){
        this.digitalPiano=digitalPiano;
    }
    public void startShow(){
        digitalPiano.play();
    }
}
