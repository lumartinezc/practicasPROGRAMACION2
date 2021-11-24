package Recu2020;

public class CriterioEdad extends Criterio {
	private int edad;
	
	
	public CriterioEdad(int edad) {
		super();
		this.edad = edad;
	}


	@Override
	public boolean cumple(Voluntario v) {
		if(v.getEdad()>edad) {
			return true;
		}
		return false;
	}

}
