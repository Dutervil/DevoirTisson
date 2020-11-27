package com.devoir.classes;

public class Professeur  extends Personne{
	private String code;
	private String cours;
	private int Nh;
	private double taux; 
	
	
	
	 


	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Professeur(String nif, String nom, String prenom, String adresse) {
		super(nif, nom, prenom, adresse);
		// TODO Auto-generated constructor stub
	}


	public Professeur(String nif, String nom, String prenom, String adresse, String code, String cours, int nh,
			double taux) {
		super(nif, nom, prenom, adresse);
		this.code = code;
		this.cours = cours;
		Nh = nh;
		this.taux = taux;
	}


	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getCours() {
		return cours;
	}



	public void setCours(String cours) {
		this.cours = cours;
	}



	public int getNh() {
		return Nh;
	}



	public void setNh(int nh) {
		Nh = nh;
	}



	public double getTaux() {
		return taux;
	}



	public void setTaux(double taux) {
		this.taux = taux;
	}



	public double salaire() {
		//calcul du salaire brut
		 
		return this.taux*this.Nh;
	}
	
	public double getDeduction() {
		// Calcul de la deduction
		 double deduction_ona=this.salaire()*10/100;
		 double deduction_IRI=this.salaire()*7/100;
		 return deduction_IRI+deduction_ona;
		
	}
	public double salaireNet() {
		
		return this.salaire()-this.getDeduction();
	}



	
}
