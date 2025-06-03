package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

public class PrestamoSimple extends Prestamo{
	private double tasaDeInteres;
	private int cantCuotasPagas;
	
	public PrestamoSimple(double montoSolicitado, int cantCuotas, Cliente cliente, double tasaDeInteres) {
		super(montoSolicitado, cantCuotas, cliente);
		this.cantCuotasPagas = 0;
		cliente.agregarPrestamo(this);
	}

	@Override
	public double getInteres() {
		return this.tasaDeInteres;
	}

	@Override
	public void registrarPago() {
		cantCuotasPagas++;
	}

	@Override
	public boolean verificarFinDePago() {
		return cantCuotasPagas == this.getCantidadCuotas();
	}

	@Override
	public double calcularMontoPagado() {
		return this.calcularValorDeCuota() * this.cantCuotasPagas;
	}

	@Override
	public double calcularMontoRestante() {
		return this.calcularValorDeCuota() * (this.getCantidadCuotas() - this.cantCuotasPagas);
	}

	@Override
	protected double calcularGastosDeSellado() {
		return 5000;
	}
}
