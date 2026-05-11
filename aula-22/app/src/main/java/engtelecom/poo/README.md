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
```mermaid
classDiagram
    Animal <|-- Gato
    Animal <|-- Cachorro
    Animal <|-- Arara
    Animal <|-- Galinha
    Animal <|-- Tubarao
    Animal <|-- Baleia
    class Gato {
    }
    class Cachorro {
        
    }
    class Arara {
        
    }
    class Galinha {
        
    }
    class Tubarao {
        
    }
    class Baleia {
        
    }
    class Animal {
        - String alimentacao
        - String habitat
    }
```

Animais tem filo, classe, ordem, familia, as heranças definiriam genero e especie, imagino eu.