package ar.edu.unlp.objetos.dos.ejercicio4patrones;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends State{

	@Override
	public void start(ToDoItem context) {
		
	}

	@Override
	public void togglePause(ToDoItem context) {
		System.out.print("Error. No se puede pausar en finalizado.");
	}

	@Override
	public void finish(ToDoItem context) {
		
	}

	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getInicio(), context.getFin());
	}

}
