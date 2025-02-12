package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private List<Client> clients;

	
	
	public Bank(String name) {
		this.name = name;
		this.clients = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClients() {
		return clients;
	}
	
	public void printClients() {
		getClients().stream().forEach(client -> System.out.println(client));
	}

	public void addClient(Client client) {
		clients.add(client);
	}
	
}
