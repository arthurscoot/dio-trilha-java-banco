package application;

import model.Account;
import model.Bank;
import model.CheckingAccount;
import model.Client;
import model.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		// Instanciação do banco
		Bank bank = new Bank("TheBank");

		// Instanciação do cliente Arthur
		Client arthur = new Client();
		arthur.setNome("Arthur");

		// Adicionando o cliente Arthur ao banco. (Banco possui o cliente, cliente não possui o banco)
		bank.addClient(arthur);

		// Instanciação do cliente Beatriz
		Client beatriz = new Client();
		beatriz.setNome("Beatriz");

		// Adicionando o cliente Beatriz ao banco
		bank.addClient(beatriz);

		// Criação de contas para o cliente Arthur
		Account a = new CheckingAccount(arthur);
		Account b = new SavingsAccount(arthur);

		// Criação de contas para o cliente Beatriz
		Account c = new CheckingAccount(beatriz);
		Account d = new SavingsAccount(beatriz);
		Account e = new SavingsAccount(beatriz);

		// TESTE 1: Conta 'a' (Arthur) deposita 200 e transfere 100 para a conta 'b' (Arthur).
		// Resultado esperado: 100 de saldo na conta 'a' e 100 de saldo na conta 'b'.
		a.deposit(200);
		a.transfer(100, b);

		// Imprimindo os extratos das contas de Arthur.
		System.out.println("TESTE 1");
		a.printStatement();
		b.printStatement();

		System.out.println("\n\n\n\n");

		// TESTE 2: Tentando transferir mais do que o saldo disponível na conta 'a' (Arthur).
		System.out.println("TESTE 2: Transferência com saldo insuficiente");
		a.transfer(300, b);  // Deve falhar, pois o saldo é 200.

		System.out.println("\n\n\n\n");

		// TESTE 3: Tentando sacar mais do que o saldo disponível na conta 'a' (Arthur).
		System.out.println("TESTE 3: Saque com saldo insuficiente");
		a.withdraw(300);  // Deve falhar, pois o saldo é 100 após a transferência.

		System.out.println("\n\n\n\n");

		// TESTE 4: Banco imprimir seus clientes e as contas associadas a eles (com informações de cada conta).
		System.out.println("TESTE 4");
		bank.printClients();

		System.out.println("\n\n\n\n");

		// TESTE 5: Cliente Arthur imprimir as contas que possui, com as contas imprimindo a quem pertencem.
		System.out.println("TESTE 5");
		arthur.printAccounts();

		System.out.println("\n\n\n\n");

		// TESTE 6: Conta 'c' (Beatriz) deposita 500 e transfere 200 para a conta 'd' (Beatriz).
		// Resultado esperado: 300 de saldo na conta 'c' e 200 de saldo na conta 'd'.
		c.deposit(500);
		c.transfer(200, d);

		// Imprimindo os extratos das contas de Beatriz.
		System.out.println("TESTE 6");
		c.printStatement();
		d.printStatement();

		System.out.println("\n\n\n\n");

		// TESTE 7: Tentando transferir mais do que o saldo disponível na conta 'c' (Beatriz).
		System.out.println("TESTE 7: Transferência com saldo insuficiente");
		c.transfer(600, d);  // Deve falhar, pois o saldo é 300.

		System.out.println("\n\n\n\n");

		// TESTE 8: Tentando sacar mais do que o saldo disponível na conta 'c' (Beatriz).
		System.out.println("TESTE 8: Saque com saldo insuficiente");
		c.withdraw(400);  // Deve falhar, pois o saldo é 300 após a transferência.

		System.out.println("\n\n\n\n");

		// TESTE 9: Cliente Beatriz imprimir as contas que possui, com as contas imprimindo a quem pertencem.
		System.out.println("TESTE 9");
		beatriz.printAccounts();

		// TESTE 10: Transferência bem-sucedida de Beatriz para Arthur (transação entre contas de clientes diferentes)
		// Resultado esperado: 200 de saldo na conta 'a' e 200 de saldo na conta 'c'.
        System.out.println("TESTE 10: Transferência de Beatriz para Arthur");
        c.transfer(100, a);  

        // Imprimindo os extratos das contas após a transferência
        System.out.println("\nApós a transferência de Beatriz para Arthur:");
        c.printStatement();
        a.printStatement();

        System.out.println("\n\n\n\n");

        // TESTE 11: Beatriz realiza um saque de 50 na conta "c" e transfere 50 para a conta 'e' (Beatriz)
        // Resultado esperado: 100 de saldo na conta 'c' e 50 de saldo na conta 'e'.
        System.out.println("TESTE 11: Beatriz realiza um saque e transfere para outra conta");
        c.withdraw(50);  
        c.transfer(50, e);  

        // Imprimindo os extratos das contas de Beatriz após as operações
        System.out.println("\nApós saque e transferência de Beatriz:");
        c.printStatement();
        e.printStatement();
        
}}
