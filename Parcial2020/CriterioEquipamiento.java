package Parcial2020;

public class CriterioEquipamiento extends Criterio {
private String equipo;

	public CriterioEquipamiento(String equipo) {
	super();
	this.equipo = equipo;
}

	@Override
	public boolean cumple(Paciente p) {
		if(p.requiereEquipamiento(equipo)) {
			return true;
		}
		return false;
	}

}
