package prefi2020;

import java.util.ArrayList;
import java.util.Comparator;

public class Simple extends Empleado {
	
	private ArrayList<String>especialidad;
	private Calculadorasueldo sueldo;

	public Simple(String nombre, String apellido, int edad, Calculadorasueldo sueldo) {
		super(nombre, apellido, edad);
		especialidad=new ArrayList<>();
		this.sueldo=sueldo;
	}
	
	public void addEspecialidad(String e) {
		if(!especialidad.contains(e)){
			especialidad.add(e);
		}
	}
	
	public void setSueldo(Calculadorasueldo sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public ArrayList<String> getEspecialidades() {
		ArrayList<String> newlist = new ArrayList<>(especialidad);
		return newlist;
	}

	@Override
	public double gastoSueldo() {
		
		return sueldo.calcularsueldo();
	}

	@Override
	public ArrayList<Empleado> listar(Comparator<Empleado> c) {
		ArrayList<Empleado> newlist = new ArrayList<>();
		newlist.add(this);
		return newlist;
	}

	@Override
	public int cantidadEmpleados() {
		
		return 1;
	}

}
