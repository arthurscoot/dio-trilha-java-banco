# Banco - Sistema de Contas e Clientes

Este projeto foi desenvolvido exclusivamente para fins de estudo e aprendizado. Ele não é um sistema bancário real e não deve ser utilizado em ambientes de produção. Seu objetivo é demonstrar conceitos básicos de programação orientada a objetos e operações bancárias simples em Java.
Este projeto implementa um sistema bancário simples com suporte a **contas correntes** e **contas poupança**. O sistema permite que **clientes** do banco realizem operações como **depósitos**, **saques**, **transferências** entre contas e imprimam extratos de suas contas.

## Funcionalidades

O sistema oferece as seguintes funcionalidades principais:

- **Criação de clientes**: Clientes podem ser criados e adicionados ao banco.
- **Criação de contas**: Clientes podem possuir diferentes tipos de contas, como **contas correntes** e **contas poupança**.
- **Operações financeiras**:
  - **Depósitos**: É possível depositar um valor em uma conta.
  - **Saques**: É possível realizar um saque, desde que o saldo seja suficiente.
  - **Transferências**: Clientes podem transferir dinheiro entre contas.
- **Impressão de extratos**: O sistema imprime o extrato de cada conta, exibindo o saldo atual.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes principais:

- **Bank**: Representa o banco, que contém uma lista de **clientes**.
- **Client**: Representa um cliente, que pode possuir uma ou mais contas bancárias.
- **Account**: Classe abstrata que representa uma conta bancária, com métodos de depósito, saque e transferência.
- **CheckingAccount**: Classe que herda de `Account` e representa uma conta corrente.
- **SavingsAccount**: Classe que herda de `Account` e representa uma conta poupança.

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:

    ```bash
    git clone https://github.com/seu-usuario/banco-sistema.git
    ```

2. Abra o projeto em seu IDE preferida (ex: IntelliJ IDEA, Eclipse). Eu utilizei o Eclipse.

3. Execute a classe `Program.java` para simular as operações bancárias.

## Testes Realizados

O sistema possui diversos testes que validam as operações de depósito, saque, transferência e impressão de extratos. Os testes incluem:

- **Depósito e Transferência**: Verificação se o saldo das contas está correto após as operações.
- **Transferências com saldo insuficiente**: Verificação se o sistema impede transferências quando não há saldo suficiente.
- **Saque com saldo insuficiente**: Verificação se o sistema impede saques quando o saldo é insuficiente.

### Exemplo de Execução

Ao executar o programa, você verá os seguintes resultados:

1. **TESTE 1**: Depósito e transferência de Arthur.
2. **TESTE 2**: Tentativa de transferência com saldo insuficiente.
3. **TESTE 3**: Tentativa de saque com saldo insuficiente.
4. **TESTE 4**: Imprimir os clientes e as contas associadas a eles.
5. **TESTE 5**: Imprimir as contas de Arthur.
6. **TESTE 6**: Depósito e transferência de Beatriz.
7. **TESTE 7**: Tentativa de transferência com saldo insuficiente de Beatriz.
8. **TESTE 8**: Tentativa de saque com saldo insuficiente de Beatriz.
9. **TESTE 9**: Imprimir as contas de Beatriz.
10. **TESTE 10**: Transferência de Beatriz para Arthur.
11. **TESTE 11**: Saque e transferência de Beatriz.

FFique à vontade para criar novos testes ou alterar os já existentes para novas finalidades.

