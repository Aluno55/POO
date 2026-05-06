```mermaid
classDiagram
    class Relogio{
        + Relogio ()
        - ArrayList ~Display~ dHora
        - ArrayList ~Display~ dMinuto
        - ArrayList ~Display~ dSegundo
    }
    class Display{
        + Display ()
        - ArrayList ~Segmento~ segs
        + segmentoHorizontal () void
        + segmentoVertical () void
    }
    class Segmento{
        - Draw seg
        - boolean onoff
        + Segmento ()
        + onSwitch () boolean
    }
    Display "6"--*"1" Relogio
    Segmento "7"--*"1" Display
```