package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

public abstract class Prestamo {
	private double montoSolicitado;
	private int cantidadDeCuotas;
	private Cliente cliente;
	private Estado estado;
	
	public Prestamo(double montoSolicitado, int cantCuotas, Cliente cliente) {
		this.montoSolicitado = montoSolicitado;
		this.cantidadDeCuotas = cantCuotas;
		this.cliente = cliente;
		if (this.calcularValorDeCuota() > cliente.calcularTreinta()) {
			this.estado = new Rechazado();
		}else {
			this.estado = new Aceptado();
		}
	}
	
	public abstract double getInteres();
	
	//Template method
	public double calcularValorDeCuota() {
		return (this.montoSolicitado/this.cantidadDeCuotas) * this.getInteres();
	}
	
	public void pagarCuota() {
		this.estado.pagarCuota(this);
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public abstract void registrarPago();
	
	public abstract boolean verificarFinDePago();
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public int getCantidadCuotas() {
		return this.cantidadDeCuotas;
	}
	
	public abstract double calcularMontoPagado();
	
	public abstract double calcularMontoRestante();
	
	public double calcularGastosDeCancelancionDePrestamo() {
		return this.estado.calcularGastosDeCancelancionDePrestamo(this);
	}
	
	protected abstract double calcularGastosDeSellado();

	protected double calcularGastosAdministrativos() {
		return this.calcularMontoRestante() * 0.1;
	}
	
	protected double gastosDeCancelacionDePrestamo() {
		return this.calcularMontoRestante() 
				+ this.calcularGastosAdministrativos()
				+ this.calcularGastosDeSellado();
	}
	
}
