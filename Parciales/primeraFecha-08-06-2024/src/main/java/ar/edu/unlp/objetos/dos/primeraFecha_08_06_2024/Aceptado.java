package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

public class Aceptado extends Estado{

	@Override
	public void pagarCuota(Prestamo prestamo) {
		prestamo.registrarPago();
		if (prestamo.verificarFinDePago()) {
			prestamo.setEstado(new Finalizado());
		}
	}

	@Override
	public double calcularGastosDeCancelancionDePrestamo(Prestamo prestamo) {
		return prestamo.gastosDeCancelacionDePrestamo();
	}

}
