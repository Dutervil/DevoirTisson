package com.devoir.classes;

public  class Personne {

	protected String nif;
	protected String nom;
	protected String prenom;
	protected String adresse;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nif, String nom, String prenom, String adresse) {
		super();
		this.nif = nif;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	 
	
	
}
