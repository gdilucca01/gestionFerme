package com.inti.entitty;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value = "BC")
public class BasseCourt extends Animal implements Serializable {

	private String habitat;

	public BasseCourt() {
		super();
	}

	public BasseCourt(boolean etat, String habitat) {
		super(etat);
		this.habitat = habitat;
	}

	public BasseCourt(Long idAnimal, boolean etat, String habitat) {
		super(idAnimal, etat);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "BasseCourt [habitat=" + habitat + ", idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}

}
