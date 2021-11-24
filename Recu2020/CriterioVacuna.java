package Recu2020;

public class CriterioVacuna extends Criterio {
	private boolean vacuna;
	
	public CriterioVacuna(boolean vacuna) {
		super();
		this.vacuna = vacuna;
	}

	@Override
	public boolean cumple(Voluntario v) {
		if(v.isVacuna()==vacuna) {
			return true;
		}
		else return false;
	}

}
