package com.inti.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Gerant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// declaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_gerant")
	private Long idGerant;
	private String nom;
	private String prenom;
	
	@ManyToMany(mappedBy = "gerants")
	private Set<Ferme> fermes;

	// constructeurs
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerant(Long idGerant, String nom, String prenom) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
	}

	// getters et setters
	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
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

	public Set<Ferme> getFermes() {
		return fermes;
	}

	public void setFermes(Set<Ferme> fermes) {
		this.fermes = fermes;
	}

	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
