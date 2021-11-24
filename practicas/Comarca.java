package practicas;

import java.util.ArrayList;

public class Comarca extends ElementoTerritorio {
	private String nombre;
	private int habitantes;
	private double superficie;
	private double ingresos;
	
	public Comarca(String nombre, int habitantes, double superficie, double ingresos) {
		super();
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.superficie = superficie;
		this.ingresos = ingresos;
	}

	public String getNombre() {
		return nombre;
	}



	
	public double getIngresos() {
		return ingresos;
	}

	@Override
	public int cantHabitantes() {
		// TODO Auto-generated method stub
		return habitantes;
	}

	@Override
	public double superficie() {
		// TODO Auto-generated method stub
		return superficie;
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
	public ArrayList<Comarca> listarporcriterio(Criterio c) {
		ArrayList<Comarca>  newlist = new ArrayList<Comarca> ();
		if(c.cumple(this)) {
			newlist.add(this);
			
		}
		return newlist;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Comarca c1 = (Comarca) obj;
			return c1.getNombre().equals(this.getNombre());
		}
		catch (Exception e) {
			return false;
		}
	
	}
	
	
}
