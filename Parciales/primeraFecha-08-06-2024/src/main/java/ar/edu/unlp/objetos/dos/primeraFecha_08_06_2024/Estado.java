package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

public abstract class Estado {
	
	public void pagarCuota(Prestamo prestamo) {
		throw new Error ("error");
	}

	public abstract double calcularGastosDeCancelancionDePrestamo(Prestamo prestamo);
}
