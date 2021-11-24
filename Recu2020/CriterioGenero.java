package Recu2020;

public class CriterioGenero extends Criterio {
	private String genero;
	
	
	public CriterioGenero(String genero) {
		super();
		this.genero = genero;
	}


	@Override
	public boolean cumple(Voluntario v) {
		if(v.getGenero().equals(genero)) {
			return true;
		}
		return false;
	}

}
