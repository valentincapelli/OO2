package ar.edu.unlp.objetos.dos.ejercicio4patrones;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State{

	@Override
	public void start(ToDoItem context) {
		
	}

	@Override
	public void togglePause(ToDoItem context) {
		context.setState(new InProgress());
	}

	@Override
	public void finish(ToDoItem context) {
		context.setState(new Finished());
		context.setFin(LocalDateTime.now());
	}

	@Override
	public Duration workedTime(ToDoItem context) {
		return Duration.between(context.getInicio(), LocalDateTime.now());
	}

}
