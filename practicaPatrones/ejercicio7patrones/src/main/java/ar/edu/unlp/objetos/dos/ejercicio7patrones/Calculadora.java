package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public class Calculadora {
	private Estado estado;
	private double acumulado;
	
	public Calculadora() {
		this.borrar();
	}
	
	public void setValor(int valor) {
		estado.setValor(this, valor);
	}
	
	public void mas() {
		estado.mas(this);
	}
	
	public void menos() {
		estado.menos(this);
	}
	
	public void por() {
		estado.por(this);
	}
	
	public void dividido() {
		estado.dividido(this);
	}
	
	public void borrar() {
		this.acumulado = 0;
		this.estado = new Inicial();
	}
	
	public String resultado() {
		return estado.resultado(this);
	}

	protected void setAcumulado(double acumulado) {
		this.acumulado = acumulado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public double getAcumulado() {
		return this.acumulado;
	}
}
