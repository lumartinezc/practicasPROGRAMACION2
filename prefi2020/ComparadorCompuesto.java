package prefi2020;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Empleado> {
	private Comparator<Empleado> c1;
	private Comparator<Empleado> c2;
	
	
	public ComparadorCompuesto(Comparator<Empleado> c1, Comparator<Empleado> c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public int compare(Empleado o1, Empleado o2) {
		int res= c1.compare(o1, o2);
		if(res==0) {
			return c2.compare(o1, o2);
		}
		else return res;
	}

}
