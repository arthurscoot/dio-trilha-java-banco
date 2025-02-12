package model;

import repository.IAccount;

public abstract class Account implements IAccount{

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int branch;
	protected int number;
	protected double balance;
	protected Client client;

	
	public Account(Client client) {
		this.branch = Account.AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.client = client;
		client.addAccount(this);
	}

	@Override
	public void withdraw(double amount) {
	    if (balance >= amount) {
	        balance -= amount;
	    } else {
	        System.out.println("Saque falhou: saldo insuficiente.");
	    }
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	public void transfer(double amount, IAccount destinationAccount) {
	    if (this.balance >= amount) {
	        this.withdraw(amount);
	        destinationAccount.deposit(amount);
	    } else {
	        System.out.println("Transferência falhou: saldo insuficiente.");
	    }
	}

	protected void printInfo() {
		System.out.println(String.format("Titular: %s", this.client.getName()));
		System.out.println(String.format("Agencia: %d", this.branch));
		System.out.println(String.format("Numero: %d", this.number));
		System.out.println(String.format("Saldo: %.2f\n", this.balance));
	}

	@Override
	public String toString() {
	    return String.format(
	        "Titular: %s\nAgência: %d\nNúmero: %d\nSaldo: %.2f\n",
	        this.client.getName(), this.branch, this.number, this.balance
	    );
	}



}
