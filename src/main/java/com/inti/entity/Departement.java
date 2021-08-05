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
public class Departement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// declaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departement")
	private Long idDepartement;
	private String nom;
	private String region;
	
	@ManyToMany(mappedBy = "departements")
	private Set<Ferme> fermes;

	// declaration des cnstrs
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(String nom, String region) {
		super();
		this.nom = nom;
		this.region = region;
	}

	// getters et setters
	public Long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nom=" + nom + ", region=" + region + "]";
	}

}