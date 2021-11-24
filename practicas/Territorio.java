package practicas;

import java.util.ArrayList;

public class Territorio extends ElementoTerritorio {
	private String nombre;
	private ArrayList<ElementoTerritorio> regiones;
	
	public Territorio(String nombre) {
		super();
		this.nombre = nombre;
		regiones=new ArrayList<>();
	}

	@Override
	public int cantHabitantes() {
		int cant=0;
		for (ElementoTerritorio r : regiones) {
			cant+= r.cantHabitantes();
		}
		// TODO Auto-generated method stub
		return cant;
	}

	@Override
	public double superficie() {
		int cant=0;
		for (ElementoTerritorio r : regiones) {
			cant+= r.superficie();
		}
		return cant;
	}

	@Override
	public double ingresoPerCapita() {
		
		return this.getIngresos()/this.cantHabitantes();
		
	}

	@Override
	public double densidad() {
		// TODO Auto-generated method stub
		return this.cantHabitantes()/this.superficie();
	}

	@Override
	public double getIngresos() {
		int cant=0;
		for (ElementoTerritorio r : regiones) {
			cant+= r.getIngresos();
		}
		
		return cant;
	}
	
	public ArrayList<Comarca> listarporcriterio(Criterio c){
		ArrayList<Comarca>  newlist = new ArrayList<Comarca> ();
		for(ElementoTerritorio r : regiones) {
			newlist.addAll(r.listarporcriterio(c));
				
			}
		
		return newlist;
	}
	
}
