package practicas;

public class Criteriohabitantes extends Criterio {
	private int cant;
	
	public Criteriohabitantes(int cant) {
		super();
		this.cant = cant;
	}

	@Override
	protected boolean cumple(Comarca r) {
		if(r.cantHabitantes()>cant) {
			return true;
		}
		return false;
	}

}
