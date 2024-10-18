# Padrões de Projeto: Facade e Strategy
Este projeto explora dois dos padrões de projeto mais utilizados: Facade e Strategy. A implementação é feita em um domínio de carrinho de compras e pagamentos.
## Padrões Implementados
1. ***Strategy***
O padrão Strategy permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Nesse exemplo, criei várias maneiras de realizar o pagamento em um carrinho de compras.

### Classes envolvidas:
- PagamentoStrategy: Interface que define o comportamento de pagamento.
- PagamentoCartaoCredito: Implementação da estratégia de pagamento via Cartão de Crédito.
- PagamentoPaypal: Implementação da estratégia de pagamento via PayPal.
- CarrinhoDeCompras: Classe que utiliza a estratégia de pagamento e permite ao usuário escolher a forma de pagamento.

2. ***Facade***
O padrão Facade oferece uma interface simplificada para interagir com um sistema complexo. Nesse exemplo, usei o facade para abstrair a complexidade de uma compra online.

### Classes envolvidas:
- EstoqueService: Verifica o estoque de um produto.
- FreteService: Calcula o frete para um produto.
- PagamentoService: Processa o pagamento do produto.
- LojaFacade: Classe que simplifica a interação com os três serviços acima, oferecendo uma interface simples para comprar um produto.

## Estrutura do Projeto
O projeto contém as seguintes classes principais:
```uml
src/
├── strategy/
│   ├── PagamentoStrategy.java
│   ├── PagamentoCartaoCredito.java
│   ├── PagamentoPaypal.java
│   └── CarrinhoDeCompras.java
└── facade/
    ├── EstoqueService.java
    ├── FreteService.java
    ├── PagamentoService.java
    └── LojaFacade.java

```

## Como Funciona
### Strategy
O padrão Strategy foi aplicado ao sistema de carrinho de compras. O cliente pode escolher entre diferentes estratégias de pagamento (Cartão de Crédito ou PayPal), que são facilmente intercambiáveis sem modificar a estrutura do carrinho.

### Facade
O padrão Facade simplifica o processo de compra de um produto. O LojaFacade encapsula a lógica de verificação de estoque, cálculo de frete e pagamento, tornando o processo de compra mais simples para o cliente.

## Como Executar
1. Clone o repositório
```bash
git clone git@github.com:Will-Andrade/design-patterns-challenge-dio.git
```

2. Execute a Main.

## Exemplo de Saída
```bash
Pagamento de R$500 realizado com Cartão de Crédito.
Pagamento de R$250 realizado com PayPal.
Estoque verificado para o produto: Smartphone
Frete calculado para o produto: Smartphone
Pagamento processado para o produto: Smartphone
Compra finalizada para o produto: Smartphone

```
