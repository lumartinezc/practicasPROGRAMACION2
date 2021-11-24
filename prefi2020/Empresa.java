package prefi2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	private ArrayList<Empleado>empleados;

	public Empresa() {
		super();
		empleados=new ArrayList<>();
	}
	public void addEmpleado(Empleado e) {
		if(!empleados.contains(e)) {
			empleados.add(e);
		}
	}
	public ArrayList<Empleado> listar(Comparator<Empleado> c){
		ArrayList<Empleado> newlist = new ArrayList<>();
		
		for(Empleado e:empleados) {
			if(!newlist.contains(e)){
			
			newlist.add(e);
			
			}
		}
		Collections.sort(newlist, c);
		return newlist;
	}
}
