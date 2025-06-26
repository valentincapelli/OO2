package ar.edu.unlp.objetos.dos.ejercicio4patrones;

import java.time.Duration;

public abstract class State {

	public abstract void start(ToDoItem context);

	public abstract void togglePause(ToDoItem context);
	
	public abstract void finish(ToDoItem context);
	
	public abstract Duration workedTime(ToDoItem context);
	
}
