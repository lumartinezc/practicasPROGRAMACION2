package prefi2020;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Empleado(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public abstract ArrayList<String> getEspecialidades();
	public abstract double gastoSueldo();
	public abstract ArrayList<Empleado> listar(Comparator<Empleado> c);
	public abstract int cantidadEmpleados();

	@Override
	public String toString() {
		
		return nombre +" "+ apellido;
	}
	
	
}
