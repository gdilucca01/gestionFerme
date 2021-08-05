package com.inti.entitty;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Eleveur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eleveur")
	private Long idEleveur;
	private String nom;
	private String prenom;
	private boolean statut;
	
	@ManyToMany(mappedBy = "eleveurs")
	private List<Animal> animaux;
	
	

	public Eleveur() {
		super();
	}

	public Eleveur(String nom, String prenom, boolean statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}

	public Eleveur(Long idEleveur, String nom, String prenom, boolean statut) {
		super();
		this.idEleveur = idEleveur;
		this.nom = nom;
		this.prenom = prenom;
		this.statut = statut;
	}

	public Long getIdEleveur() {
		return idEleveur;
	}

	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
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

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "Eleveur [idEleveur=" + idEleveur + ", nom=" + nom + ", prenom=" + prenom + ", statut=" + statut + "]";
	}

}
