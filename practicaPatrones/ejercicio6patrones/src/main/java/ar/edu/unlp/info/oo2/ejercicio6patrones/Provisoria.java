package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class Provisoria extends Situacion{
	
	public Provisoria() {
		
	}

	@Override
	public String ofrecerInformacion(Excursion excursion) {
		return super.ofrecerInformacion(excursion) + " Usuarios faltantes para cupo minimo: " + excursion.usuariosFaltantesParaCupoMinimo();
	}

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.agregarInscripto(usuario);
		if (excursion.getCantidadInscriptos() == excursion.getCupoMinimo())
			excursion.setSituacion(new Definitiva());
	}

	
}
