package ejercicio4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelos {
	private int id;
	private String nombreCompañia;
	private LocalTime horaSalida;
	private LocalDate fecha;
	private int aforo;
	private String codVuelo;
	private LocalTime duracion;
	
	public Vuelos(int id, String nombreCompañia, LocalTime horaSalida, LocalDate fecha, int aforo, String codVuelo,
			LocalTime duracion) {
		super();
		this.id = id;
		this.nombreCompañia = nombreCompañia;
		this.horaSalida = horaSalida;
		this.fecha = fecha;
		this.aforo = aforo;
		this.codVuelo = codVuelo;
		this.duracion = duracion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreCompañia() {
		return nombreCompañia;
	}
	public void setNombreCompañia(String nombreCompañia) {
		this.nombreCompañia = nombreCompañia;
	}
	public LocalTime getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public String getCodVuelo() {
		return codVuelo;
	}
	public void setCodVuelo(String codVuelo) {
		this.codVuelo = codVuelo;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Vuelos [id=" + id + ", nombreCompañia=" + nombreCompañia + ", horaSalida=" + horaSalida + ", fecha="
				+ fecha + ", aforo=" + aforo + ", codVuelo=" + codVuelo + ", duracion=" + duracion + "]";
	}
	
	
	
	
	
	
	

}
