package ejercicio6L2;

import java.util.Arrays;

public class Entrada {
		private String numIdE;
		private double precio;
		private boolean ocupada;
		private int numFil;
		private String butaca;
		public Entrada(String numIdE, double precio, boolean ocupada, int numFil, String butaca) {
			super();
			this.numIdE = numIdE;
			this.precio = precio;
			this.ocupada = ocupada;
			this.numFil = numFil;
			this.butaca = butaca;
		}
		
		public Entrada() {
			super();
		}
		
		public String getNumIdE() {
			return numIdE;
		}
		public void setNumIdE(String numIdE) {
			this.numIdE = numIdE;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public boolean isOcupada() {
			return ocupada;
		}
		public void setOcupada(boolean ocupada) {
			this.ocupada = ocupada;
		}
		public int getNumFil() {
			return numFil;
		}
		public void setNumFil(int numFil) {
			this.numFil = numFil;
		}
		public String getButaca() {
			return butaca;
		}
		public void setButaca(String butaca) {
			this.butaca = butaca;
		}
		@Override
		public String toString() {
			return "Entrada [numIdE=" + numIdE + ", precio=" + precio + ", ocupada=" + ocupada + ", numFil=" + numFil
					+ ", butaca=" + butaca + "]";
		}
		
		
		
		
	

}
