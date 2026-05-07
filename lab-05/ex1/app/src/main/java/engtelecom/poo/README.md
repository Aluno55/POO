```mermaid
classDiagram
    class Relogio{
        + Relogio ()
        + counter (val: int) void 
        - ArrayList ~Display~ dHora
        - ArrayList ~Display~ dMinuto
        - ArrayList ~Display~ dSegundo
    }
    class Display{
        + Display ()
        - ArrayList ~Segmento~ segs
    }
    class Segmento{
        - Draw seg
        - boolean onoff
        + Segmento ()
        + onSwitch () boolean
        + segmentoHorizontal () void
        + segmentoVertical () void
    }
    Display "6"--*"1" Relogio
    Segmento "7"--*"1" Display
```