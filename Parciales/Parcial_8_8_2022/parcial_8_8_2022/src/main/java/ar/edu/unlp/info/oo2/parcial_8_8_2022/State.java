package ar.edu.unlp.info.oo2.parcial_8_8_2022;

import java.time.temporal.ChronoUnit;

public abstract class State {
	
	public void aprobarEtapa(Proyecto proyecto) {
		
	}
	
	public double costoDelProyecto(Proyecto proyecto) {
		return proyecto.getNumeroDeIntegrantes() 
				* proyecto.getMontoDePagoPorIntegrante()
				* ChronoUnit.DAYS.between(proyecto.getInicio(), proyecto.getFin());
				
	}
	
	public double precioDelProyecto(Proyecto proyecto) {
		return proyecto.costoDelProyecto() + (proyecto.costoDelProyecto() * proyecto.getMargenDeGanancia());
	}
	
	public void modificarMargenDeGanancia(Proyecto proyecto, int margenDeGanancia) {
		
	}
	
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo(proyecto.getObjetivo() + "(Cancelado)");
		proyecto.setState(new Cancelada());
	}
}
