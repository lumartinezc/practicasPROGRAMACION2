package Recu2020;

public class CriterioAnd extends Criterio {
	private Criterio c1;
	private Criterio c2;
	
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(Voluntario v) {
		if(c1.cumple(v)&&c2.cumple(v)) {
			return true;
		}
		return false;
	}

}
