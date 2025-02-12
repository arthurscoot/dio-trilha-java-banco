package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String name;
	private List<Account> accounts;
	
	public Client() {
	this.accounts = new ArrayList<>();
	}

	public Client(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}
	
	 public List<Account> getAccounts() {
	        return accounts;
	    }
	 
	 public void printAccounts() {
		 getAccounts().stream().forEach(client -> System.out.println(client));
	 }
	 
	  public void addAccount(Account account) {
	        accounts.add(account);
	    }

	  @Override
	  public String toString() {
	      StringBuilder builder = new StringBuilder();
	      builder.append("Client: ").append(this.name).append("\n");
	      builder.append("Accounts:\n\n");
	      for (Account account : accounts) {
	          builder.append(account.toString()).append("\n\n");  
	      }
	      return builder.toString();  
	  }
	  

}
