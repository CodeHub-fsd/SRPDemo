package openclosedprinciple;

public class MusicBand {
    private String bandName;
    private DigitalPiano digitalPiano;
    public MusicBand(DigitalPiano digitalPiano){
        this.bandName=bandName;
        this.digitalPiano=digitalPiano;
    }
    public void startShow(){

      digitalPiano.play();
    }
}
