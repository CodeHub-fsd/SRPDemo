package practice.openclosedprinciple;

public class OpenClosedImpl {
    public static void main(String[] args){
        DigitalPiano dp=new DigitalPiano();
        MusicBand mo=new MusicBand( dp);
        mo.startShow();
    }
}
