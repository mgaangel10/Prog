package ejercicio2;

import java.util.List;

public class Crud {
	private List<Socio> lista;

	public Crud(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public void agregar(Socio s) {
		lista.add(s);
	}
	public void eliminar(Socio s) {
		lista.remove(s);
	}
	
	public Socio findBynum(int num) {
		int i = 0;
		boolean verda=false;
		//ahora utilizamos el lista.size que es lo mismo que el length
		while(!verda&&i<lista.size()) {
			//en la linea 27 antes utilizamso un lista[i] pero ahora como es un array list
			//ponemso list.get
			if (num==lista.get(i).getNumSo()) {
				verda=true;
			} else {
				i++;
			}
		}
		if (verda) {
			
			return lista.get(i);
		} else {
			return null;
		}
	}
	
	public void editar(int num,double NuevaCuota) {
		Socio s=findBynum(num);
		s.setPago(NuevaCuota);
	
	}
	
	
	
	
	

	public List<Socio> getLista() {
		return lista;
	}
	

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Crud [lista=" + lista + "]";
	}
	

}
