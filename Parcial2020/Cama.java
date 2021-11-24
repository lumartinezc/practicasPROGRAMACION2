package Parcial2020;

import java.util.ArrayList;

public class Cama extends Elementoabstracto {
	private ArrayList<String>equipamiento;
	private Criterio criterio;
	private Paciente ocupada;
	
	public Cama(Criterio criterio) {
		super();
		this.equipamiento = new ArrayList<>();
		this.criterio = criterio;
		this.ocupada=null;
	}
	
	public boolean puedeAceptarPaciente (Paciente p) {
		if((ocupada==null)&&(criterio.cumple(p))){
			
			return true;
		}
		else return false;
	}
	public void setPaciente(Paciente p) {
		if( puedeAceptarPaciente(p)) {
			this.ocupada=p;
		}
		
	}
	public void addEquipamiento(String e) {
		if(!equipamiento.contains(e)) {
			equipamiento.add(e);
		}
	}
	public boolean EstaOcupada() {
		if(this.ocupada!=null) {
			return true;
		}
		else return false;
	}
	@Override
	public int cantcamas() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ArrayList<Cama> camasdisponibles(Paciente p) {
		ArrayList<Cama> camasdisponibles= new ArrayList<>();
		if(puedeAceptarPaciente(p)) {
			camasdisponibles.add(this);
			
		}
		return camasdisponibles;
	}

	@Override
	public Elementoabstracto copia(Criterio c) {
		
		//if((ocupada!=null)&&(c.cumple(ocupada))) {
			Cama copia = new Cama(this.criterio);
			copia.setPaciente(this.ocupada);
			for(int i=0; i<equipamiento.size(); i++) {
				copia.addEquipamiento(equipamiento.get(i));
			}
			
			return copia;
		//}
		//else return null;
	}
}
