package model;

public class Etudiant {
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom.length() >= 8 && nom.length() <= 30) {
			this.nom = nom;
		} else
			System.out.println("Taille du nom est invalide");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age < 28) {
			this.age = age;
		} else {
			System.out.println("Age invalide!");
		}
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		if (moyenne >= 0 && moyenne <= 20) {
			this.moyenne = moyenne;
		} else
			System.out.println("Moyenne invalide!");
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	private int age;
	private double moyenne;
	private String adresse;

	public void info() {
		System.out.println("Etudiant : " + this.nom + " " + this.age + " " + this.moyenne + " " + this.adresse);
	}

	public Etudiant() {

	}

	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

}
