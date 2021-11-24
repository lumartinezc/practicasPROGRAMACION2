package Recu2020;

public class CriterioSeEnfermo extends Criterio {
	private boolean enfermo;
	
	public CriterioSeEnfermo() {
		super();
		enfermo = true;
	}

	@Override
	public boolean cumple(Voluntario v) {
		if(v.isSeenfermo()==enfermo) {
			return true;
		}
		return false;
	}

}
