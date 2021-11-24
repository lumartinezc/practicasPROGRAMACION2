package Recu2020;

import java.util.ArrayList;

public abstract class Elementoabstracto {
	private String nombre;

	public Elementoabstracto(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract int CantVolunatarios();
	public abstract int CantVolunatarios(Criterio c);
	
	
	public abstract ArrayList<Voluntario> listar(Criterio c);
	
	public double porcentjaeVoluntarios(Criterio c) {
		double cant= CantVolunatarios(c);
		
		int canttotal= CantVolunatarios();
		return cant/canttotal;
	}
}
