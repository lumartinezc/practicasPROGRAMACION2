package Parcial2020;

import java.util.ArrayList;

public abstract class Elementoabstracto {
	public abstract int cantcamas();
	public abstract ArrayList<Cama> camasdisponibles(Paciente p);
	public abstract  Elementoabstracto copia(Criterio c);
}
