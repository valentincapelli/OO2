package ar.edu.unlp.objetos.dos.ejercicio2patrones;

public class EmpleadoPlanta extends EmpleadoConHijos{
	private int añosDeAntiguedad;

	public EmpleadoPlanta(boolean estaCasado, int cantidadDeHijos, int añosDeAntiguedad) {
		super(estaCasado, cantidadDeHijos);
		this.añosDeAntiguedad = añosDeAntiguedad;
	}
	
	public Double sueldoBasico() {
		return 50000.0;
	}
	
	public Double sueldoAdicional() {
		return super.sueldoAdicional() + (2000 * this.añosDeAntiguedad);
	}
	
}
