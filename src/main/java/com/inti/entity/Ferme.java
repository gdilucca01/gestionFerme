package com.inti.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ferme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// declaration des attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ferme")
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	
	@ManyToMany
	@JoinTable(name = "tab_asso_gerant", joinColumns = @JoinColumn(name = "id_ferme"), inverseJoinColumns = @JoinColumn(name = "id_gerant"))
	private Set<Gerant> gerants;
	
	@ManyToMany
	@JoinTable(name = "tab_asso_departement", joinColumns = @JoinColumn(name = "id_ferme"), inverseJoinColumns = @JoinColumn(name = "id_departement"))
	private Set<Departement> departements;

	@ManyToMany
	@JoinTable(name = "tab_asso_animaux", joinColumns = @JoinColumn(name = "id_ferme"), inverseJoinColumns = @JoinColumn(name = "id_animal"))
	private Set<Animal> animaux;
	
	// constructeurs
	public Ferme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ferme(String nom, Date dateAchat) {
		super();
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	// getters et setters
	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	public Set<Gerant> getGerants() {
		return gerants;
	}

	public void setGerants(Set<Gerant> gerants) {
		this.gerants = gerants;
	}

	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}

}
