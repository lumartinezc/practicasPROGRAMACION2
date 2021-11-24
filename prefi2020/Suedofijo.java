package prefi2020;

public class Suedofijo extends Calculadorasueldo {
	private double fijo;
	
	
	public Suedofijo( double fijo) {
		
		this.fijo = fijo;
	}


	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return fijo;
	}

}
