package Parcial2020;

import java.util.ArrayList;

public class Paciente {
	private String nombre;
	private int edad;
	private ArrayList<String>sintomas;
	private ArrayList<String>equipamiento;
	
	public Paciente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.equipamiento = new ArrayList<>();
		sintomas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public boolean requiereEquipamiento(String e) {
		if(equipamiento.contains(e)) {
			return true;
		}
		else return false;
	}
	
	public boolean TieneSintoma(String e) {
		if(sintomas.contains(e)) {
			return true;
		}
		else return false;
	}
}
