package com.javaee.php.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSONNE")
public class Personne {
	@Id
    @GeneratedValue
    private Long id;
	
	@Column(name="nom")
	private String nom;

	public Personne()
	{
		System.out.println("Appel du constructeur");
	}
	public String afficherPersonne()
	{
		return "Bonjour "+this.id+" "+this.nom;	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	

}
