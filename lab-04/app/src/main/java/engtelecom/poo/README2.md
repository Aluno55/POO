```mermaid
classDiagram
    class Filme{
        - String titulo
        - lançamento
        - genero
        - diretor
        - atores list
        - avaliações list
    }
    class Ator{
        - nome
        - nascimento
    }
    class Avaliacao{
        - comentario
        - nota
    }
    Ator "1..*"--o"1" Filme
    Avaliacao "1..*"--*"1" Filme
    Avaliacao "1"--o"1" Usuario
    class Usuario{
        - nome
        - email
        - senha
        +avaliar()
    }
```