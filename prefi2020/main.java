package prefi2020;

public class main {

	public static void main(String[] args) {
		Empresa Esofware=new Empresa();
		ConPersonal Leon = new ConPersonal("Leon", "Perez", 30, 2, new Suedofijo (20000));
		ConPersonal Andres = new ConPersonal("Andres", "Martinez", 33, 5, new Suedofijo( 20000));
		ConPersonal Timoteo = new ConPersonal("Timoteo", "Arguero", 20, 1, new Suedofijo( 20000));
		Simple Luisina = new Simple("luisina", "lorenzo", 29, new PorHora(25, 900));
	
		Esofware.addEmpleado(Leon);
		Esofware.addEmpleado(Andres);
		Esofware.addEmpleado(Timoteo);
		Esofware.addEmpleado(Luisina);
		Leon.addempleado(Timoteo);
		Leon.addempleado(Andres);
		Leon.addempleado(Luisina);
		
		Simple Vicotoria = new Simple("Victoria", "Baez", 28, new Suedofijo( 20000));
		Simple Soledad = new Simple("Soledad", "Pastoruti", 27, new Suedofijo( 20000));
		ConPersonal Ciro = new ConPersonal("Ciro", "Zon", 40, 2, new Suedofijo( 20000));
		
		Esofware.addEmpleado(Vicotoria);
		Esofware.addEmpleado(Soledad);
		Esofware.addEmpleado(Ciro);
		
		Andres.addempleado(Soledad);
		Andres.addempleado(Vicotoria);
		Andres.addempleado(Ciro);
		
		Simple Maria = new Simple("Maria", "Becerra", 28, new Suedofijo( 20000));
		Simple Jose = new Simple("Jose", "Pereiti", 29, new Suedofijo(20000));
		
		Ciro.addempleado(Jose);
		Ciro.addempleado(Maria);
		
	System.out.println(Esofware.listar(new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre())));
	System.out.println(Leon.listar(new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre())));
	System.out.println(Leon.gastoSueldo());
	}

}
