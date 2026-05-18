```mermaid
classDiagram
    Animal <|-- Gato
    Animal <|-- Cachorro
    Animal <|-- Ave
    Ave <|-- Arara
    Ave <|-- Galinha
    Animal <|-- Marinho
    Marinho <|-- Tubarao
    Marinho <|-- Baleia
    class Marinho {
        - double altitudeMarinha
    }
    class Gato {
        - int vidas
        + garras () boolean
    }
    class Cachorro {
        + fetchBall () boolean
    }
    class Ave{
        - int ovos
    }
    class Arara {
        - int altitute
    }
    class Galinha {
        - boolean head
    }
    class Tubarao {
        + bloodRadar ()
    }
    class Baleia {
        + travel ()
    }
    class Animal {
        - String alimentacao
        - String habitat
    }
```

Animais tem filo, classe, ordem, familia, as heranças definiriam genero e especie, imagino eu.

```mermaid
classDiagram
    Obra <|--Revista
    Obra <|-- Livro
    Revista <|-- Jornal
    Revista <|-- Gibi
        class Livro {
        - String isbn
    }
    class Obra {
        - double cost
    }
    class Revista{
        - String issn
    }
    Carro --|> Veiculo
    Aviao --|> Veiculo
    Barco --|> Veiculo
    Caminhao --|> Carro
    class Veiculo{
        - double velocidade
        - Acerelar(a: double) boolean
    }
    class Aviao{
        - double altitude
    }

```
```mermaid
classDiagram
    class Humano{
        - int id;
    }
    class Aluno{
        - int matricula;
    }
    class Professor{
        - String disciplinas
    }
    Aluno --|> Humano
    Professor --|> Humano
    Coordenador --|> Professor
    Diretor --|> Humano
```