package ar.edu.unlp.info.oo2.parcial_8_8_2022;

public class Evaluacion extends State{

	public void aprobarEtapa(Proyecto proyecto) {
		proyecto.setState(new Confirmada());
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, int margenDeGanancia) {
		if (margenDeGanancia >= 11 && margenDeGanancia <= 15)
			proyecto.setMargenDeGanancia(margenDeGanancia);
	}
	
}
