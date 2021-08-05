package com.inti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // pour gerer la relation heritage en JPA
@DiscriminatorColumn(name = "TYPE")
@DiscriminatorValue(value = "ANIMAL")
public class Animal implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_animal")
	protected Long idAnimal;
	protected boolean etat;
	
	@ManyToMany
	@JoinTable(name = "Appartenance", joinColumns = @JoinColumn(name="id_animal"),inverseJoinColumns = @JoinColumn(name="id_eleveur"))
	protected List<Eleveur> eleveurs;
	
	@ManyToMany(mappedBy = "animaux")
	private List<Ferme> fermes;

	public Animal() {
		super();
	}

	public Animal(boolean etat) {
		super();
		this.etat = etat;
	}

	public Animal(Long idAnimal, boolean etat) {
		super();
		this.idAnimal = idAnimal;
		this.etat = etat;
	}

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}

}
