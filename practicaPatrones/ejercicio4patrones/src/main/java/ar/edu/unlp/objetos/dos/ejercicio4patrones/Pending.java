package ar.edu.unlp.objetos.dos.ejercicio4patrones;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{

	@Override
	public void start(ToDoItem context) {
		context.setState(new InProgress());
		context.setInicio(LocalDateTime.now());
	}

	@Override
	public void togglePause(ToDoItem context) {
		System.out.print("Error. No se puede pausar en pendiente.");
	}

	@Override
	public void finish(ToDoItem context) {
		
	}

	@Override
	public Duration workedTime(ToDoItem context) {
		System.out.print("Error. No se inicio la tarea");
		return null;
	}

}
