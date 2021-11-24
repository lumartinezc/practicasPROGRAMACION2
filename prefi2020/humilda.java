package prefi2020;

import java.util.ArrayList;

public class humilda extends ConPersonal {
	private int max;
	public humilda(String nombre, String apellido, int edad, int antiguedad, int max, Suedofijo sueldo) {
		super(nombre, apellido, edad, antiguedad, sueldo);
		this.max=max;
	}
	
	public ArrayList<String> getEspecialidades() {
		ArrayList<String> newlist = new ArrayList<>(acargo.get(0).getEspecialidades());		
		for(Empleado e:acargo) {
			ArrayList<String> newlist2 = e.getEspecialidades();
			newlist.retainAll(newlist2);
			}
		if(newlist.size()<max) {
			return newlist;
		}
		else {
			ArrayList<String> newlist3 = new ArrayList<>();
			for(int i=0; i<max; i++) {
				newlist3.add(newlist.get(i));
			}
			return newlist3;
		}
		
	}
}
