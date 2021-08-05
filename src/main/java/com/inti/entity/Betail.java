package com.inti.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "Betail")
public class Betail extends Animal implements Serializable {

	private String techElevage;

	public Betail() {
		super();
	}

	public Betail(boolean etat, String techElevage) {
		super(etat);
		this.techElevage = techElevage;
	}

	public Betail(Long idAnimal, boolean etat, String techElevage) {
		super(idAnimal, etat);
		this.techElevage = techElevage;
	}

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}

	@Override
	public String toString() {
		return "Betail [techElevage=" + techElevage + ", idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}

}
