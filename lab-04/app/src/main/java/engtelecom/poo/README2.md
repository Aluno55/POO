```mermaid
classDiagram
    class Filme{
        - String titulo
        - LocalDate lançamento
        - String genero
        - String diretor
        - ArrayList <Ator> atores
        - ArrayList <Avaliacao> avaliacoes
    }
    class Ator{
        - String nome
        - LocalDate nascimento
    }
    class Avaliacao{
        - String comentario
        - int nota

    }
    Ator "1..*"--o"1" Filme
    Avaliacao "1..*"--*"1" Filme
    Avaliacao "1"o--"1" Usuario
    class Usuario{
        - String nome
        - String email
        - String senha
        + avaliar(nota: int, commentary: String) void
    }
```

Um filme tem um título, um ano de lançamento, um gênero, um diretor e um ou mais atores. Um ator tem um nome e uma data de nascimento. Um filme pode ter uma ou mais avaliações, e cada avaliação está associada a um único filme e a um único usuário. Um usuário tem um nome, um e-mail e uma senha. Um usuário pode avaliar um ou mais filmes. Uma avaliação tem uma nota (de 1 a 5) e um comentário.