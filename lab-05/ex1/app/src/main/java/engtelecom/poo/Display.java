package engtelecom.poo;
import java.util.ArrayList;

public class Display {
    ArrayList<Segmento> segs = new ArrayList<>();
    public Display() {
        for (int i = 0; i < 7; i++) {
            segs.add(Segmento(false));
        }
    }

    public boolean seteSegmentos(int val){
        switch (val) {
            case 1:
                segs.get(1).onSwitch();
                segs.get(2).onSwitch();
            break;
            default:return false;
        }
        return true;
    }
}