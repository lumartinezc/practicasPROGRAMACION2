package Recu2020;

import java.util.ArrayList;

public class Voluntario extends Elementoabstracto {
	
	private String nacionalidd;
	private String genero;
	private int edad;
	private ArrayList<String>enfermedades;
	private boolean vacuna;
	private boolean seenfermo;
	
	public Voluntario(String nombre, String nacionalidd, String genero, int edad, boolean vacuna, boolean seenfermo) {
		super(nombre);
		this.nacionalidd = nacionalidd;
		this.genero = genero;
		this.edad = edad;
		this.vacuna = vacuna;
		this.seenfermo = seenfermo;
		enfermedades= new ArrayList<>();
	}

	public String getNacionalidd() {
		return nacionalidd;
	}

	public String getGenero() {
		return genero;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isVacuna() {
		return vacuna;
	}

	public boolean isSeenfermo() {
		return seenfermo;
	}
	
	public boolean tieneEnfermedad(String e) {
		if(enfermedades.contains(e)) {
			return true;
		}
		else return false;
	}

	@Override
	public int CantVolunatarios() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int CantVolunatarios(Criterio c) {
		if(c.cumple(this)) {
			return 1;
		}
		else return 0;
	}

	
	

	@Override
	public ArrayList<Voluntario> listar(Criterio c) {
		ArrayList<Voluntario> list= new ArrayList<>();
		if(c.cumple(this)) {
			list.add(this);		
		}
		return list;
	}
	
	
}
