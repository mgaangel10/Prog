package examena;

import java.util.Random;

public class Pasteleria {
	
	private String sabor;
	private double precioLitro;
	private double volumen;
	private boolean extraNormal;
	private int [] cantTartas;
	
	
	public Pasteleria () {
		
	}


	public Pasteleria(String sabor, double precioLitro, double volumen, boolean extraNormal, int[] cantTartas) {
		
		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumen = volumen;
		this.extraNormal = extraNormal;
		this.cantTartas = cantTartas;
	}
	
	public void rellenarTartas(int hasta, int desde) {
		int uno=1;
		Random num=new Random(System.nanoTime());
		for (int i = 0; i < cantTartas.length; i++) {
			cantTartas [i]=num.nextInt(hasta-desde+1)+desde;
		}
	}
	
	public void imprimirTartas() {
		System.out.println("------");
		System.out.println("SEMANA");
		System.out.println("------");
		for (int i = 0; i < cantTartas.length; i++) {
			System.out.println("DIA"+1+i+"= "+cantTartas[i]+".");
		}
	}
	public double calcularPrecioFab() {
		return volumen*precioLitro;
	}
	public double calcularPrecioVenta(double porcent) {
		int cien=100;
		return calcularPrecioFab()+(calcularPrecioFab()*porcent/cien);
	}
	public double calcularExtra(double porcent,double costeExtra) {
		if (extraNormal) {
			return calcularPrecioVenta(porcent)+costeExtra;
		}else {
			return calcularPrecioVenta(porcent);
		}
	}
	public int calcularTotalTartas() {
		int totalTartas=0;
		for (int i = 0; i < cantTartas.length; i++) {
			totalTartas+=cantTartas[i];
		}
		return totalTartas;
	}
	public void cambiarDiaTarta(int cambiarDia, int cambiarTarta) {
		cantTartas[cambiarDia-1]=cambiarTarta;
	}
	public double calcularMediaTarta() {
		return (double) calcularTotalTartas()/cantTartas.length;
	}
	
	
	


	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public double getPrecioLitro() {
		return precioLitro;
	}


	public void setPrecioLitro(double precioLitro) {
		this.precioLitro = precioLitro;
	}


	public double getVolumen() {
		return volumen;
	}


	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}


	public boolean isExtraNormal() {
		return extraNormal;
	}


	public void setExtraNormal(boolean extraNormal) {
		this.extraNormal = extraNormal;
	}


	public int[] getCantTartas() {
		return cantTartas;
	}


	public void setCantTartas(int[] cantTartas) {
		this.cantTartas = cantTartas;
	}
	
	
	
	

}
