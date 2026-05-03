Uma companhia aérea oferece voos para diversos destinos. Cada voo tem um número de voo, um destino, uma data e uma hora de partida, e uma capacidade máxima de passageiros. Os passageiros podem reservar assentos em um voo, e cada reserva está associada a um único passageiro e a um único voo. Um passageiro tem um nome, um e-mail e um número de telefone.

<!--Os passageiros podem reservar assentos em um voo.-->

```mermaid
classDiagram
    Voo --o Reserva
    Reserva o-- Passageiro
    class Voo{
        - LocalDate data
        - double horaPartida
        - int maxPassageiros
        - int numVoos
        - String destino
        - ArrayList ~Passageiro~
        + Voo (data: LocalDate, horaPartida: double, maxPassageiros: int, numVoos: int, destino: String)
    }
    class Reserva{
        - ArrayList ~Voo~
        - ArrayList ~Passageiro~
        + Reserva ()
        + reservar (qualVoo: Voo) boolean
    }
    class Passageiro{
        - String nome
        - String email
        - String telefone
        + Passageiro ()
        + reservar (qualVoo: Voo) boolean
    }

```