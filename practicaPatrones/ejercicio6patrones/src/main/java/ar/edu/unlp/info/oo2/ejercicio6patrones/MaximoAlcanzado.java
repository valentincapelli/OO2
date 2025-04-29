package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class MaximoAlcanzado extends Situacion{

	public MaximoAlcanzado() {
		
	}
	
	@Override
	public String ofrecerInformacion(Excursion excursion) {
		return excursion.getNombre() + excursion.getCosto() + excursion.getFechaDeInicio() 
				+ excursion.getFechaDeFin() + excursion.getPuntoDeEncuentro();
	}

	@Override
	public void inscribirUsuario(Usuario usuario, Excursion excursion) {
		excursion.agregarAEspera(usuario);
	}

}
