package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class Definitiva extends Situacion{

	public Definitiva() {
		
	}
	
	@Override
	public String ofrecerInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() + excursion.getFechaDeInicio() 
				+ excursion.getFechaDeFin() + excursion.getPuntoDeEncuentro() 
				+ excursion.getMailsDeInscriptos() + excursion.usuariosFaltantesParaCupoMaximo();
	}

	@Override
	public void inscribirUsuario(Usuario usuario, Excursion excursion) {
		excursion.agregarInscripto(usuario);
		if (excursion.getCantidadInscriptos() == excursion.getCupoMaximo())
			excursion.setSituacion(new MaximoAlcanzado());
	}

}
