package ar.edu.unlp.info.oo2.parcial_8_8_2022;

public class Construccion extends State{
	
	public void aprobarEtapa(Proyecto proyecto) {
		if (proyecto.precioDelProyecto() != 0)
			proyecto.setState(new Evaluacion());
		else
			throw new RuntimeException("Error :/ ");
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, int margenDeGanancia) {
		if (margenDeGanancia >= 8 && margenDeGanancia <= 10)
			proyecto.setMargenDeGanancia(margenDeGanancia);
	}
	
}
