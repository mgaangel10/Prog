package tipoexamen;

public class Producto {

	private String nombre;
	private double precioB;
	private String seccion;
	private boolean rebaja;
	private double pvp;
	
	public Producto() {
		
	}
	public Producto(String nombre,double precioB,String seccion,boolean rebaja,double pvp) {
		this.nombre=nombre;
		this.precioB=precioB;
		this.seccion=seccion;
		this.rebaja=rebaja;
		this.pvp=pvp;
	}
	
	public double pvp(int porcentaje) {
		double cien=100;
		pvp=precioB+precioB*porcentaje/cien;
		return pvp;
	}
	public boolean compReb(int porcentajeReb) {
		if (porcentajeReb!=0) {
			return true;
		}else {
			return false;
		}
	}
	public void rebaja(boolean b,int porcentajeReb) {
		
		

		if (b) {
			double res=0.0;
			res=pvp*porcentajeReb/100;
			pvp=pvp-res;
				System.out.println("su rebaja es de "+res);		
				System.out.println("el pvp quedaria "+pvp);
			
		}else {
			System.out.println("no rebaja");
		}
		
	}
	public double convertirDolar() {
		pvp=pvp*1.04;
		return pvp;
	}
	public void megaGanga() {
		if(pvp<3) {
			System.out.println("Mega Ganga!!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioB=" + precioB + ", seccion=" + seccion + ", rebaja=" + rebaja
				+ ", pvp=" + pvp + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioB() {
		return precioB;
	}
	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public boolean isRebaja() {
		return rebaja;
	}
	public void setRebaja(boolean rebaja) {
		this.rebaja = rebaja;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	
	
	
	
}
