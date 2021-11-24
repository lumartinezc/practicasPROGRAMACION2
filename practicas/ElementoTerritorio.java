package practicas;

import java.util.ArrayList;

public abstract class ElementoTerritorio {
	public abstract int cantHabitantes();
	public abstract double superficie();
	public abstract double ingresoPerCapita();
	public abstract double densidad();
	public abstract double  getIngresos();
	public abstract ArrayList<Comarca> listarporcriterio(Criterio c);
	
	
}
