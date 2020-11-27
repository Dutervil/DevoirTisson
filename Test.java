package com.devoir.classes;

public class Test {

	
	public static void objectEtudiant1() {

      int notes[]= {7,8,9,5,6};
		
		Etudiant et1=  new Etudiant("2-8373-332", "Nom Et", "Prenom Et", "Adresse Et", "code-13", "Informatique", "3eme", notes);
		float moy=et1.CalculMy();
		String me=et1.getMention();
		
		System.out.println("NIF     :"+et1.getNif());
		System.out.println("NOM     :"+et1.getNif());
		System.out.println("PRENOM  :"+et1.getNif());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("CODE    :"+et1.getCode());
		System.out.println("OPTION  :"+et1.getOption());
		System.out.println("NIVEAU  :"+et1.getNiveau());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("_____________________________________");
		System.out.println("Voici les notes de l'Etudiant:");
		for (int i = 0; i < et1.getNotes().length; i++) {
		
			System.out.println(" Notes "+i+" ="+notes[i]);
		}
		
		System.out.println("Moyenne : "+moy+" / "+et1.getNotes().length*10);
		System.out.println("Mention : "+me);
	}
	

	public static void objectEtudiant2() {

      int notes[]= {4,5,6,1,3};
		
		Etudiant et1=  new Etudiant("2-8373-332", "Nom Et", "Prenom Et", "Adresse Et", "code-13", "Informatique", "3eme", notes);
		float moy=et1.CalculMy();
		String me=et1.getMention();
		
		System.out.println("NIF     :"+et1.getNif());
		System.out.println("NOM     :"+et1.getNif());
		System.out.println("PRENOM  :"+et1.getNif());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("CODE    :"+et1.getCode());
		System.out.println("OPTION  :"+et1.getOption());
		System.out.println("NIVEAU  :"+et1.getNiveau());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("_____________________________________");
		System.out.println("Voici les notes de l'Etudiant:");
		for (int i = 0; i < et1.getNotes().length; i++) {
		
			System.out.println(" Notes "+i+" ="+notes[i]);
		}
		
		System.out.println("Moyenne : "+moy+" / "+et1.getNotes().length*10);
		System.out.println("Mention : "+me);
	}
	
	

	public static void objectEtudiant3() {

      int notes[]= {10,8,10,9,6};
		
		Etudiant et1=  new Etudiant("2-8373-332", "Nom Et", "Prenom Et", "Adresse Et", "code-13", "Informatique", "3eme", notes);
		float moy=et1.CalculMy();
		String me=et1.getMention();
		
		System.out.println("NIF     :"+et1.getNif());
		System.out.println("NOM     :"+et1.getNif());
		System.out.println("PRENOM  :"+et1.getNif());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("CODE    :"+et1.getCode());
		System.out.println("OPTION  :"+et1.getOption());
		System.out.println("NIVEAU  :"+et1.getNiveau());
		System.out.println("ADRESSE :"+et1.getNif());
		System.out.println("_____________________________________");
		System.out.println("Voici les notes de l'Etudiant:");
		for (int i = 0; i < et1.getNotes().length; i++) {
		
			System.out.println(" Notes "+i+" ="+notes[i]);
		}
		
		System.out.println("Moyenne : "+moy+" / "+et1.getNotes().length*10);
		System.out.println("Mention : "+me);
	}
	
 
	public static void objetProfesseur1() {
		
		Professeur p1=new Professeur("789-233-1", "Jean", "Thomas", "Verrettes", "jean-3939", "Informatique", 13, 1000);
		System.out.println("NIF       :"+p1.getNif());
		System.out.println("NOM       :"+p1.getNom());
		System.out.println("PRENOM    :"+p1.getPrenom());
		System.out.println("ADRESSE   :"+p1.getAdresse());
		System.out.println("CODE      :"+p1.getCode());
		System.out.println("TH        :"+p1.getTaux());
		System.out.println("NB HEURE  :"+p1.getNh());
		System.out.println("______________________________________________");
		System.out.println("Ce professeur Enseigne la matiere "+p1.getCours());
		System.out.println("IL Travaille "+p1.getNh()+" Heure (e) par semaine en raison de " +p1.getTaux()+" HTG par Heure");
		System.out.println("Il a un salaire de "+p1.salaire()+" HTG");
		System.out.println("Il a une deduction de  "+p1.getDeduction()+" HTG comme taxe");
		System.out.println("Son salaire net est "+p1.salaireNet()+" HTG en fin de compte");
		System.out.println("Car une somme de "+p1.getDeduction()+" HTD a ete enleve sur son salaire.");
		
	}
	
public static void objetProfesseur2() {
		
		Professeur p1=new Professeur("789-233-7", "Jean", "Wilson", "Verrettes", "W-3939", "Comptable", 7, 750);
		System.out.println("NIF       :"+p1.getNif());
		System.out.println("NOM       :"+p1.getNom());
		System.out.println("PRENOM    :"+p1.getPrenom());
		System.out.println("ADRESSE   :"+p1.getAdresse());
		System.out.println("CODE      :"+p1.getCode());
		System.out.println("TH        :"+p1.getTaux());
		System.out.println("NB HEURE  :"+p1.getNh());
		System.out.println("______________________________________________");
		System.out.println("Ce professeur Enseigne la matiere "+p1.getCours());
		System.out.println("IL Travaille "+p1.getNh()+" Heure (e) par semaine en raison de " +p1.getTaux()+" HTG par Heure");
		System.out.println("Il a un salaire de "+p1.salaire()+" HTG");
		System.out.println("Il a une deduction de  "+p1.getDeduction()+" HTG comme taxe");
		System.out.println("Son salaire net est "+p1.salaireNet()+" HTG en fin de compte");
		System.out.println("Car une somme de "+p1.getDeduction()+" HTD a ete enleve sur son salaire.");
		
	}


public static void AfficherProfesseurEtantQuePersonne() {
	//Professeur p1=new Personne(nif, nom, prenom, adresse);
	 
	Professeur p1=new Professeur();
	p1.setNif("426-244-4");
	p1.setNom("Mackendy");
	p1.setPrenom("Joseph");
	p1.setAdresse("Port-au-prince");
	
	
	System.out.println("NIF       :"+p1.getNif());
	System.out.println("NOM       :"+p1.getNom());
	System.out.println("PRENOM    :"+p1.getPrenom());
	System.out.println("ADRESSE   :"+p1.getAdresse());
}
 
}
