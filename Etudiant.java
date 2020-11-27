package com.devoir.classes;

public class Etudiant extends Personne {

	
	private String code;
	private String option;
	private String niveau;
	private int notes[];
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	public Etudiant(String nif, String nom, String prenom, String adresse, String code, String option, String niveau,
			int[] notes) {
		super(nif, nom, prenom, adresse);
		this.code = code;
		this.option = option;
		this.niveau = niveau;
		this.notes = notes;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public int[] getNotes() {
		return notes;
	}
	public void setNotes(int[] notes) {
		this.notes = notes;
	}

 
	public float CalculMy() {
		int somme=0;
		 
		for(int i=0;i<notes.length;i++) {
			somme+=notes[i];
		}
		return somme;
	}
	
	public String getMention() {
		return CalculMy() >=25 ? "Admis": "Echec";
	}
	
}

