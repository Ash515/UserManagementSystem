package net.javaguide.usermanagement.model;

public class User {
	private int id;
	private String name;
	private String country;
	private String email;
	
	public User(int id, String name, String country, String email) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.email = email;
	}
	
	public User(String name, String country, String email) {
		super();
		this.name = name;
		this.country = country;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
