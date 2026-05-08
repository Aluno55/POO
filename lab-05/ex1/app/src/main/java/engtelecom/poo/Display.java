package engtelecom.poo;
import java.util.HashMap;

public class Display {
    private HashMap<String, Segmento> segs;

    public Display(){ 
        segs.put("A", new Segmento(false));
        segs.put("B", new Segmento(false));
        segs.put("C", new Segmento(false));
        segs.put("D", new Segmento(false));
        segs.put("E", new Segmento(false));
        segs.put("F", new Segmento(false));
        segs.put("G", new Segmento(false));
    }

    public void setSegmento(String segmento){
        segs.get(segmento).onSwitch();
    }

    public void setSegmento(int valor){
        segs.get("A").desligar();
        segs.get("B").desligar();
        segs.get("C").desligar();
        segs.get("D").desligar();
        segs.get("E").desligar();
        segs.get("F").desligar();
        segs.get("G").desligar();
        switch (valor) {
            case 1:
                segs.get("C").onSwitch();
                segs.get("B").onSwitch();
                break;
            case 2:
                segs.get("A").onSwitch();
                segs.get("B").onSwitch();
                segs.get("D").onSwitch();
                segs.get("E").onSwitch();
                segs.get("G").onSwitch();
                break;
            case 3:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("B").onSwitch();
                segs.get("G").onSwitch();
                segs.get("C").onSwitch();
                break;
            case 4:
                segs.get("B").onSwitch();
                segs.get("G").onSwitch();
                segs.get("F").onSwitch();
                segs.get("C").onSwitch();
                break;
            case 5:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("G").onSwitch();
                segs.get("C").onSwitch();
                segs.get("F").onSwitch();
                break;
            case 6:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("E").onSwitch();
                segs.get("C").onSwitch();
                segs.get("G").onSwitch();
                segs.get("F").onSwitch();
                break;
            case 7:
                segs.get("C").onSwitch();
                segs.get("B").onSwitch();
                segs.get("A").onSwitch();
                break;
            case 8:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("E").onSwitch();
                segs.get("C").onSwitch();
                segs.get("G").onSwitch();
                segs.get("F").onSwitch();
                segs.get("B").onSwitch();
                break;
            case 9:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("C").onSwitch();
                segs.get("G").onSwitch();
                segs.get("F").onSwitch();
                segs.get("B").onSwitch();
                break;
            case 0:
                segs.get("A").onSwitch();
                segs.get("D").onSwitch();
                segs.get("E").onSwitch();
                segs.get("C").onSwitch();
                segs.get("F").onSwitch();
                segs.get("B").onSwitch();
                break;
            default:
                break;
        }
    }
    // posicionar os segmentos no canvas
}