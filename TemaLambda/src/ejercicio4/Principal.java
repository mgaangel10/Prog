package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vuelos> lista = new ArrayList <Vuelos>();
		Vuelos e;
		LocalDate fecha =LocalDate.of(2020, 11, 13);
		LocalTime horaSalida=LocalTime.of(17, 20);
		LocalTime duracion = LocalTime.of(1, 30);
		e=new Vuelos(1,"sevilla",horaSalida,fecha,200,"1b1",duracion);
		
		

	}

}
