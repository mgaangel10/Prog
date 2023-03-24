package ejercicio;

import java.util.Arrays;
import java.util.Random;

public class Pasteleria {
	private String sabor;
	private double precioLitro;
	private double volumen;
	private boolean extraNormal;
	private int [] cantidad;
	
	public Pasteleria () {
		
	}
	
	public Pasteleria (String sabor,double precioLitro,double volumen, boolean extraNormal, int [] cantidad) {
		this.sabor=sabor;
		this.precioLitro=precioLitro;
		this.volumen=volumen;
		this.extraNormal=extraNormal;
		this.cantidad=cantidad;
	}
	
	public int [] generarAleatorio(int hasta,int desde) {
		Random num=new Random(System.nanoTime());
		
		for (int i = 0; i < cantidad.length; i++) {
			
			cantidad[i]=num.nextInt(hasta-desde+1)+desde;
			
		}
		return cantidad;
	}
	
	public void imprimirAleatorio() {
		int contador=0;
		for (int i = 0; i < cantidad.length; i++) {
			
			contador++;
			System.out.println("Dia "+contador+": "+cantidad[i]);
		}
	}
	
	public double calcularPF(double volumen,double precioLitro) {
		double precioFab=0.0;
		precioFab=volumen*precioLitro;
		return precioFab;
	}
	
	public double calcularPv(double ganancias,double precioFab) {
		double pv=0.0;
		pv=precioFab*ganancias/100;
		pv=pv+precioFab;
		return pv;
	}
	
	public boolean comprobarExtra(int compBoolean) {
		if(compBoolean==1) {
			extraNormal=true;
		}else {
			extraNormal=false;
		}
		return extraNormal;
	}
	public  void imprimirBool(double pv) {
		if (extraNormal) {
			int aumento=5;
			System.out.println("su tartas es tipo extra por lo tanto tendra un aumentara 5€ mas");
			pv=pv+aumento;
			System.out.println("su precio final es de: "+pv);
		}else {
			System.out.println("no es ");
		}
	}
	public double totalTarta() {
		double suma=0.0;
		for (int i = 0; i < cantidad.length; i++) {
			suma=cantidad[i]+suma;
		}
		return suma;
	}
	
	public double mediaTartas(double suma) {
		double media=0.0;
		media=suma/7;
		return media;
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

	public int[] getCantidad() {
		return cantidad;
	}

	public void setCantidad(int[] cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Pasteleria [sabor=" + sabor + ", precioLitro=" + precioLitro + ", volumen=" + volumen + ", extraNormal="
				+ extraNormal + ", cantidad=" + Arrays.toString(cantidad) + "]";
	}
	
	
	
	
	
	

}
