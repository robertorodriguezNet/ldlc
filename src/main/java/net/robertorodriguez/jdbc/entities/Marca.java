package net.robertorodriguez.jdbc.entities;

public class Marca {

	private int id;
	private String name;
	
	public Marca() {
		this.id = 0;
		this.name = "";
	}
	
	public Marca(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("%4s %-25s", id, name);
	}
	
	
}
