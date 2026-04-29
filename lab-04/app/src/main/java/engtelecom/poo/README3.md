Uma empresa possui uma frota de veículos. Cada veículo tem um modelo, uma placa e um ano de fabricação. A empresa tem vários motoristas, e cada motorista pode dirigir um ou mais veículos. A empresa registra o uso de cada veículo, incluindo a data, o motorista e a distância percorrida

```mermaid
classDiagram
    Empresa "1"*--"1..*" Registro
    Veiculo "1..*"--o"1" Empresa
    Motorista "1..*"--o"1" Empresa
    class Empresa{
        - ArrayList ~Veiculo~ frota
        - ArrayList ~Motorista~ motorista
        + Empresa ()
        - ArrayList ~Registro~ registro
        + registrar (distancia: double, movel: Veiculo, responsavel: Motorista, diaUsado: LocalDate)
    }
    class Registro{
        - double distancia
        - Veiculo movel
        - Motorista responsavel
        - LocalDate diaUsado
        + Registro (distancia: double, movel: Veiculo, responsavel: Motorista, diaUsado: LocalDate)
    }
    class Veiculo{
        - String model
        - String placa
        - int ano
        + Veiculo (ano: int, place: String, model: String)
    }
    class Motorista{
        - String nome
        - ArrayList ~Veiculo~ movel
        + Motorista (nome: String)
        + dirigir (movel: Veiculo) boolean
    }
```