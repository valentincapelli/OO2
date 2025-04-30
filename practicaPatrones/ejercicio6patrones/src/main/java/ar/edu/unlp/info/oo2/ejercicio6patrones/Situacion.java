package ar.edu.unlp.info.oo2.ejercicio6patrones;

public abstract class Situacion {
	
	public String ofrecerInformacion(Excursion excursion) {
		return "Nombre: " + excursion.getNombre() + " Costo: " + excursion.getCosto() + " Inicio: " + excursion.getFechaDeInicio() 
		+ " Fin: " + excursion.getFechaDeFin() + " Punto de encuentro: " + excursion.getPuntoDeEncuentro();
	}
	
	public abstract void inscribir(Usuario usuario, Excursion excursion);

}
