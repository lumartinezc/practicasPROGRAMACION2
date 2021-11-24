package prefi2020;

public class CalculadorAnd extends Calculadorasueldo{
	private Calculadorasueldo c1;
	private Calculadorasueldo c2;
	
	public CalculadorAnd(Calculadorasueldo c1, Calculadorasueldo c2) {
	
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double calcularsueldo() {
		// TODO Auto-generated method stub
		return c1.calcularsueldo()+c2.calcularsueldo();
	}
	
	
	
}
