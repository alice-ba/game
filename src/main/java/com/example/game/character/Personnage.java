package com.example.game.character;

import org.springframework.data.annotation.Id;

public class Personnage {

	@Id
	private String id;

	private String prenom;
	private String nom;
	private String classe;
	private String attaque;
	private String defense;
	private String pv;
	private String sac;
	private String competences;

	public Personnage () {}

	public Personnage (String prenom, String nom,
	String classe, String attaque, String defense, String pv, String sac, String competences) {
		this.prenom=prenom;
		this.nom = nom;
		this.classe = classe;
		this.attaque = attaque;
		this.defense = defense;
		this.pv = pv;
		this.sac = sac;
		this.competences = competences;
	}





	public String getPrenom() {
		return prenom;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAttaque() {
		return attaque;
	}

	public void setAttaque(String attaque) {
		this.attaque = attaque;
	}

	public String getDefense() {
		return defense;
	}

	public void setDefense(String defense) {
		this.defense = defense;
	}

	public String getPv() {
		return pv;
	}

	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getSac() {
		return sac;
	}

	public void setSac(String sac) {
		this.sac = sac;
	}

	public String getCompetences() {
		return competences;
	}

	public void setCompetences(String competences) {
		this.competences = competences;
	}

}
