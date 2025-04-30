package ar.edu.unlp.info.oo2.ejercicio6patrones;

public class MaximoAlcanzado extends Situacion{

	public MaximoAlcanzado() {
		
	}

	@Override
	public void inscribir(Usuario usuario, Excursion excursion) {
		excursion.agregarAEspera(usuario);
	}

}
