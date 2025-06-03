package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUVA extends Prestamo{
	private List<Double> pagos;
	
	public PrestamoUVA(double montoSolicitado, int cantCuotas, Cliente cliente) {
		super(montoSolicitado, cantCuotas, cliente);
		this.pagos = new ArrayList<>();
		cliente.agregarPrestamo(this);
	}

	@Override
	public double getInteres() {
		Indec indec = new Indec();
		double interes = indec.getIndiceInflacion();
		return interes;
	}

	@Override
	public void registrarPago() {
		this.pagos.add(this.calcularValorDeCuota());
	}

	@Override
	public boolean verificarFinDePago() {
		return this.pagos.size() == this.getCantidadCuotas();
	}

	@Override
	public double calcularMontoPagado() {
		return pagos.stream().mapToDouble(pago -> pago).sum();
	}
	
	public double calcularCuotasRestantes() {
		return this.getCantidadCuotas() - this.pagos.size();
	}

	@Override
	public double calcularMontoRestante() {
		return this.calcularValorDeCuota() * this.calcularCuotasRestantes();
	}

	@Override
	protected double calcularGastosDeSellado() {
		return 0;
	}
}
