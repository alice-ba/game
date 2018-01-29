package com.example.game.user;

import org.springframework.data.annotation.Id;

public class Utilisateur {

	@Id
	private String id;

	private String prenom;
	private String nom;
	private String email;
	private String nomUtilisateur;

	public Utilisateur () {}

	public Utilisateur (String prenom, String nom,
	String email, String nomUtilisateur) {
		this.prenom=prenom;
		this.nom = nom;
		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
	}


	public String getPrenom() {
		return prenom;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

}
