Um produto tem uma descrição, um preço e uma quantidade em estoque. Um cliente tem um nome, um e-mail e um ou mais endereços de entrega. Um cliente pode fazer um ou mais pedidos. Um pedido tem uma data, uma situação (pendente, pago, entregue, cancelado), um ou mais produtos, sendo que cada produto tem uma quantidade e um preço unitário.

```mermaid
classDiagram
    class Produto{
        - String nome
        - int qntStock
        - double cost
        + Produto(nome: String, cost: double, qntStock: int)
    }
    Produto "1..*"--*"1" Pedido
    Pedido "1..*"--o"1" Cliente
    class Cliente{
        - String nome
        - String email
        - HarshMap ~String, String~ endereco
        - ArrayList ~Pedido~ pedidos
        + CLiente (nome: String, email: String)
        + addAddress (pais: String, correio: String)
        + pedirProduto (quantity: int, produto: Produto) boolean
        + removerProduto (quantity: int, produto: Produto) boolean
        + addToPedido (id: int; produto: Produto, qnt: int) boolean
        + removeToPedido (id: int; produto: Produto, qnt: int) boolean
    }
    class Pedido{
        - Int id
        - LocalDate data
        - String status
        - HarshMap ~Produto, int~ lista
        + Pedido (data: LocalDate, status: String)
        + pedirProduto (quantity: int, produto: Produto) boolean
        + removerProduto (quantity: int, produto: Produto) boolean
    }
```