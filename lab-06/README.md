```mermaid
classDiagram
    class _Relogio_{
        <<abstract>>
        - int hora
        - int minuto
        - int segundo
        - Draw clock
        - var cor
        + contar () void
    }
    class Cronometro {
        <<interface>>
        + cronometrar (diminuir: boolean) void
    }
    Cronometro <|.. DigitalSeg
    Cronometro <|.. DigitalTxt
    class DigitalSeg{
        - Display[] display
        + DigitalSeg ()
        + contar () void
        + cronometrar (diminuir: boolean) void
    }
    class Display{
        - Segmentos[] segs
        - int num
        + Display ()
        + ligarSegmentos () boolean
    }
    class Segmento{
        - boolean onoff
        - Cor cor
        - double[] x
        - double[] y
        + Segmento ()
    }
    class Analogico{
        - corFundo
        - corRelogio
        - corPonteiro
        - corSegundo
        - double centroX
        - double centroY
        - double raio
        - double sizeSeg
        - double sizeHora
        - double raioEnd
        - double raioStart
        - double espessuraHora
        - double espessuraSeg
        - int ponteiroHora
        - double angulo
        + Analogico ()
        + contar () void
    }
    class DigitalTxt{
        + DigitalTxt ()
        + contar () void
        + cronometrar (diminuir: boolean) void
    }

    _Relogio_ <|-- DigitalSeg
    _Relogio_ <|-- DigitalTxt
    _Relogio_ <|-- Analogico
    Display "1"*--"7"Segmento
    DigitalSeg "1"*--"6" Display

```