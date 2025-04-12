package ar.edu.unlp.objetos.dos.ejercicio2patrones;

public class EmpleadoTemporario extends Empleado{
	private int horasTrabajadas;

	public EmpleadoTemporario(boolean estaCasado, int cantidadDeHijos, int horasTrabajadas) {
		super(estaCasado, cantidadDeHijos);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Double sueldoBasico() {
		return super.sueldoBasico() + (300 * this.horasTrabajadas);
	}
}
