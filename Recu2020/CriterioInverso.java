package Recu2020;

public class CriterioInverso extends Criterio {
	private Criterio c;
	
	public CriterioInverso(Criterio c) {
		super();
		this.c = c;
	}

	@Override
	public boolean cumple(Voluntario v) {
		if(c.cumple(v)) {
			return false;
		}
		else return true;
	}

}
