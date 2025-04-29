package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class Provisoria extends Situacion{
	
	public Provisoria() {
		
	}

	@Override
	public String ofrecerInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() + excursion.getFechaDeInicio() 
				+ excursion.getFechaDeFin() + excursion.getPuntoDeEncuentro() 
				+ excursion.usuariosFaltantesParaCupoMinimo();
	}

	@Override
	public void inscribirUsuario(Usuario usuario, Excursion excursion) {
		excursion.agregarInscripto(usuario);
		if (excursion.getCantidadInscriptos() == excursion.getCupoMinimo())
			excursion.setSituacion(new Definitiva());
	}

	
}
