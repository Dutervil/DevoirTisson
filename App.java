package com.devoir.classes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		for (;;) {
			 
			System.out.println("EXERCICE DE CLASSE\n___________________________________________");
			System.out.println("1- Afficher les trois objets Etudaint");
			System.out.println("2- Afficher les deux objets Professeur");
			System.out.println("3- Afficher un professeur etant que personne");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				Test.objectEtudiant1();
				System.out.println("\n\n");
				Test.objectEtudiant2();
				System.out.println("\n\n");
				Test.objectEtudiant3();
				System.out.println("\n\n");
				break;
			case 2:
				Test.objetProfesseur1();
				System.out.println("\n\n");
				Test.objetProfesseur2();
				System.out.println("\n\n");
				break;
			case 3:
				Test.AfficherProfesseurEtantQuePersonne();
				System.out.println("\n\n");
				break;

			default:
				throw new IllegalArgumentException("Mauvaise valeur de " + new Scanner(System.in).nextInt());
			}
		}
	}
}
