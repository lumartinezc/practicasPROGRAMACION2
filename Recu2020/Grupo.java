package Recu2020;

import java.util.ArrayList;

public class Grupo extends Elementoabstracto {
	private ArrayList<Elementoabstracto> integrantes;

	public Grupo(String nombre) {
		super(nombre);
		integrantes= new ArrayList<>();
	}
	
	@Override
	public int CantVolunatarios() {
	int cant=0;
	for(int i=0; i<integrantes.size(); i++) {
		cant= cant+integrantes.get(i).CantVolunatarios();
	}
		return cant;
	}

	@Override
	public int CantVolunatarios(Criterio c) {
		int cant=0;
		for(int i=0; i<integrantes.size(); i++) {
			cant= cant+integrantes.get(i).CantVolunatarios(c);
		}
			return cant;
		
	}

	

	@Override
	public ArrayList<Voluntario> listar(Criterio c) {
		ArrayList<Voluntario> list= new ArrayList<>();
		
		for(int i=0; i<integrantes.size(); i++) {
			list.addAll(integrantes.get(i).listar(c));
		}		
		
		return list;
		
	}

	
 
}
