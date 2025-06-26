package ar.edu.unlp.objetos.dos.ejercicio2patrones;

public abstract class Empleado {
	private boolean estaCasado;
	
	
	public Empleado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public Double sueldo() {
		return this.sueldoBasico() 
				+ this.sueldoAdicional()
				- this.sueldoDescuento();
	}
	
	public Double sueldoBasico() { // lo deberia implementar cada uno
		return 20000.0;
	}
	
	public Double sueldoDescuento() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05;
	}
	
	public Double sueldoAdicional() { // pasar este metodo a clase intermedia abstracta
		double result = 0;
		if (this.isEstaCasado())
			result = 5000;
		return result;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

}
