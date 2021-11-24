package Parcial2020;

import java.util.ArrayList;

public class Grupo extends Elementoabstracto {
	private ArrayList<Elementoabstracto> camas;

	public Grupo() {
		super();
		this.camas = new ArrayList<>();
	}
	
	public void add(Elementoabstracto e) {
		if(!camas.contains(e)) {
			camas.add(e);
		}
	}
	
	public boolean tieneElemento() {
		if(camas.size()>0) {
			return true;
		}
		else return false;
	}

	@Override
	public int cantcamas() {
		int camastotales=0;
		for(Elementoabstracto a:camas) {
			camastotales= camastotales+ a.cantcamas();
		}
		return camastotales;
	}

	@Override
	public ArrayList<Cama> camasdisponibles(Paciente p) {
		ArrayList<Cama> camasdisponibles= new ArrayList<>();
		for(Elementoabstracto a:camas) {
			camasdisponibles.addAll(a.camasdisponibles(p));
		}
		
		return camasdisponibles;
	}

	@Override
	public Elementoabstracto copia(Criterio c) {
		
		Grupo copia= new Grupo();
		for(Elementoabstracto a:camas) {
			Elementoabstracto copiahijo= a.copia(c);
			if(copiahijo!=null) {
				copia.add(copiahijo);
			}
		}
		if(copia.tieneElemento()) {
			return copia;
		}
		else return null;
	}
}
