```mermaid
classDiagram
class Forma{
    - String corLinha
    - Ponto inicial
    + desenhar () String
}
Forma "1"*--"1" Ponto
Forma <|-- Area
Forma <|-- Linha
Linha "1"*--"2" Ponto
Area <|-- Circulo
Area <|-- Retangulo
class Ponto{
    - double X
    - double Y
}
class Linha{
    - Ponto final
}
class Area {
    - String corArea
    + calcArea () double
    + calcPer () double
}
class Circulo{
    - double raio
}
class Retangulo{
    - Ponto final
}
```