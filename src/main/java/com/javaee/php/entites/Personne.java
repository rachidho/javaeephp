package com.javaee.php.entites;

public class Personne {
	private int id;
	private String nom;

	public Personne()
	{
		System.out.println("Appel du constructeur");
	}
	public String afficherPersonne()
	{
		return "Bonjour "+this.id+" "+this.nom;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}
