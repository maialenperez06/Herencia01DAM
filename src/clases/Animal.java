package clases;

import java.util.Objects;

public class Animal {
	private int idAnimal;
	private String nombre;
	private boolean chip;//indica si tiene o no chip
	
	
	////////////Constructores//////////
	public Animal(int idAnimal, String nombre, boolean chip) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.chip = chip;
	}
	public Animal(int idAnimal) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = "******";
		this.chip = false;
	}
	public Animal() {
		super();
		this.idAnimal = 0;
		this.nombre = "******";
		this.chip = false;
	
	}
	////////////getters and setters//////////

	
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isChip() {
		return chip;
	}
	public void setChip(boolean chip) {
		this.chip = chip;
	}
	////////////to String//////////
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nombre=" + nombre + ", chip=" + chip + "]";
	}
	////////////hash code y Equals//////////
	@Override
	public int hashCode() {
		return Objects.hash(chip, idAnimal, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return chip == other.chip && idAnimal == other.idAnimal && Objects.equals(nombre, other.nombre);
	}


	
}
