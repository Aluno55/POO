```mermaid
classDiagram
    class Relogio{
        + Relogio ()
        + counter (val: int) void 
        - int segundos
        - int minutos
        - int horas
        - ArrayList ~Display~ displays
    }
    class Display{
        + Display ()
        - ArrayList ~Segmento~ segs
        + setSegmento 
    }
    class Segmento{
        - Draw seg
        - boolean onoff
        + Segmento ()
        + onSwitch () boolean
        + desligar () void
        + segmentoHorizontal () void
        + segmentoVertical () void
    }
    Display "6"--*"1" Relogio
    Segmento "7"--*"1" Display
```