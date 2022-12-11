package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		/*
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Amine",25,15.5,"Tunis");
		
		e1.info();
		e2.info();*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nom :");
		String nom = sc.next(); // lecture au clavier
		//System.out.println("Nom = " +nom);
		
		System.out.println("Donner un age:");
		int age = sc.nextInt(); // lecture au clavier
		//System.out.println("Age = "+age);
		
		System.out.println("Donner une moyenne:");
		double moyenne = sc.nextDouble(); // lecture au clavier
		//System.out.println("Moyenne = "+moyenne);
		
		System.out.println("Donner une Adresse :");
		String adresse = sc.next(); // lecture au clavier
		//System.out.println("Adresse = " +adresse);
		
		Etudiant e1 = new Etudiant();
		e1.setNom(nom);
		//System.out.println(e1.getNom());
		
		e1.setAge(age);
		//System.out.println(e1.getAge());
		
		e1.setMoyenne(moyenne);
		//System.out.println(e1.getMoyenne());
		e1.setAdresse(adresse);
		e1.info();


	}

}
