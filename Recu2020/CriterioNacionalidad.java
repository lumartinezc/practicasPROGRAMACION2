package Recu2020;

public class CriterioNacionalidad extends Criterio {
	private String nacionalidad;
	
	
	public CriterioNacionalidad(String nacionalidad) {
		super();
		this.nacionalidad = nacionalidad;
	}


	@Override
	public boolean cumple(Voluntario v) {
		if(v.getNacionalidd().equals(nacionalidad)){
			return true;
		}
			else return false;

	}

}
