package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

public class Rechazado extends Estado{

	@Override
	public double calcularGastosDeCancelancionDePrestamo(Prestamo prestamo) {
		throw new Error ("error");
	}

	
}
