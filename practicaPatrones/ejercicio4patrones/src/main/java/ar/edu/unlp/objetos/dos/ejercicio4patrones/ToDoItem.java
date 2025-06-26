package ar.edu.unlp.objetos.dos.ejercicio4patrones;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ToDoItem {
	private String name;
	private State state; 
	private List<String> comentarios;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.state = new Pending();
		this.comentarios = new LinkedList<>();	
	}
	
	public void start() {
		this.state.start(this);
	}

	public void togglePause() {
		this.state.togglePause(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}
	
	protected void setState(State state){
		this.state = state;
	}
	
	public void setInicio(LocalDateTime tiempo) {
		this.inicio = tiempo;
	}
	
	public void setFin(LocalDateTime tiempo) {
		this.inicio = tiempo;
	}
	
	public Duration workedTime() {
		return this.state.workedTime(this);
	}

	public LocalDateTime getInicio() {
		return inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}
	
	
	
}
