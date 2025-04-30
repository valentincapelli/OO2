package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class Definitiva extends Situacion{

	public Definitiva() {
		
	}
	
	@Override
	public String ofrecerInformacion(Excursion excursion) {
		return super.ofrecerInformacion(excursion) 
				+ " Mails de inscriptos: " + excursion.getMailsDeInscriptos() + " Usuarios faltantes para cupo maximo: " + excursion.usuariosFaltantesParaCupoMaximo();
	}

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.agregarInscripto(usuario);
		if (excursion.getCantidadInscriptos() == excursion.getCupoMaximo())
			excursion.setSituacion(new MaximoAlcanzado());
	}

}
