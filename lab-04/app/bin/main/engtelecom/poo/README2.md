Um filme tem um título, um ano de lançamento, um gênero, um diretor e um ou mais atores. Um ator tem um nome e uma data de nascimento. Um filme pode ter uma ou mais avaliações, e cada avaliação está associada a um único filme e a um único usuário. Um usuário tem um nome, um e-mail e uma senha. Um usuário pode avaliar um ou mais filmes. Uma avaliação tem uma nota (de 1 a 5) e um comentário.

```mermaid
classDiagram
    class Filme{
        - String titulo
        - LocalDate launch
        - String genero
        - String diretor
        - ArrayList ~Ator~ atores
        - ArrayList ~Avaliacao~ avaliacoes
        + Filme(titulo: String, launch: LocalDate, genero: String, diretor: String)
        + addAvaliar(nota: int, comment: String) void
        + MediarAvaliacoes () void
    }
    class Ator{
        - String nome
        - LocalDate birthday
        + Ator (nome: String, birthday: LocalDate)
    }
    class Avaliacao{
        - String comment
        - Filme movie
        - int nota
        - Usuario user
        + Avaliacao (movie: Filme, comment: String, nota: int)
    }
    Ator "1..*" --o "0..*" Filme
    Avaliacao "0..*" o--* "1" Filme
    Avaliacao "0..*" o-- "1" Usuario

    class Usuario{
        - String nome
        - String email
        - String senha
        - ArrayList ~Avaliacao~
        + avaliar(nota: int, comment: String) void
    }
```