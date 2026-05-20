```mermaid
classDiagram
    class _Relogio_{
        <<abstract>>
        - int hora
        - int minuto
        - int segundo
        - Cor cor
        - Draw clock
        + contar () void
    }
    class Cronometro {
        <<interface>>
        + cronometrar (crescer: boolean) void
    }
    Cronometro <|.. DigitalSeg
    Cronometro <|.. DigitalTxt
    class DigitalSeg{
        - Display[] display
        + contar () void
    }
    class Display{
        - Segmentos[] segs
    }
    class Segmento{
        - boolean onoff
        - Cor cor
        - double[] x
        - double[] y
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
        + contar () void
    }

    _Relogio_ <|-- DigitalSeg
    _Relogio_ <|-- DigitalTxt
    _Relogio_ <|-- Analogico
    Display "1"*--"7"Segmento
    DigitalSeg "1"*--"6" Display

```