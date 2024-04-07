package net.robertorodriguez.jdbc.entities;

public class Medida {

	private int id;
	private String description;
	private String abbreviation;
	
	public Medida() {
		this.id = 0;
		this.description = "";
		this.abbreviation = "";
	}
	
	public Medida(int id, String description, String abbreviation) {
		this.id = id;
		this.description = description;
		this.abbreviation = abbreviation;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String toString() {
		return String.format("%4s %-4s %s", id, abbreviation, description);
	}
	
	
}
