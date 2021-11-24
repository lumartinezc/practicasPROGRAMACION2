package Recu2020;

public class CriterioTieneEnfrmedad extends Criterio {
	private String enfermedad;
	
	public CriterioTieneEnfrmedad(String enfermedad) {
		super();
		this.enfermedad = enfermedad;
	}

	@Override
	public boolean cumple(Voluntario v) {
		if(v.tieneEnfermedad(enfermedad)) {
			return true;
		}
		return false;
	}

}
