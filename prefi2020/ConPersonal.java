package prefi2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ConPersonal extends Empleado {

	private int antiguedad;
	protected ArrayList<Empleado> acargo;
	private Suedofijo sueldo;

	public ConPersonal(String nombre, String apellido, int edad, int antiguedad, Suedofijo sueldo) {
		super(nombre, apellido, edad);
		this.antiguedad = antiguedad;
		acargo= new ArrayList<>();
		this.sueldo=sueldo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void addempleado(Empleado e) {
		if(!acargo.contains(e)) {
			acargo.add(e);
		}
	}

	@Override
	public ArrayList<String> getEspecialidades() {
		ArrayList<String> newlist = new ArrayList<>();
		ArrayList<String> especialidadempleado = new ArrayList<>();
		for(Empleado e:acargo) {
			especialidadempleado = e.getEspecialidades();
			for(int i=0; i<especialidadempleado.size(); i++) {
				if(!newlist.contains(especialidadempleado.get(i))) {
					newlist.add(especialidadempleado.get(i));
				}
			}
		}
		return newlist;
	}

	@Override
	public double gastoSueldo() {
		double sueldofinal = this.sueldo.calcularsueldo();
		
		for(Empleado e:acargo) {
			sueldofinal=sueldofinal+e.gastoSueldo();
		}
		
		return sueldofinal;
	}

	@Override
	public ArrayList<Empleado> listar(Comparator<Empleado> c) {
		ArrayList<Empleado> newlist = new ArrayList<>();
		newlist.add(this);
		for(Empleado e:acargo) {
		
			newlist.addAll(e.listar(c));
		}
		Collections.sort(newlist, c);
		return newlist;
	}

	@Override
	public int cantidadEmpleados() {
		int total=1;
		for(Empleado e:acargo) {
			total+=e.cantidadEmpleados();
		}
		return total;
	}
	
}
