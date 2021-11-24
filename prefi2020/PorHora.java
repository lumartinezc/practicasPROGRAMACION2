package prefi2020;

public class PorHora extends Calculadorasueldo {
	private int canthoras;
	private double preciohora;	
	
	public PorHora( int canthoras, double preciohora) {
		
		this.canthoras = canthoras;
		this.preciohora = preciohora;
	}

	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return canthoras*preciohora;
	}

}
