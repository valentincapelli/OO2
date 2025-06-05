package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

public class BasicBuilder extends PCBuilder{

	@Override
	public void crearProcesador() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Procesador basico"));
	}

	@Override
	public void crearRam() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("8 GB"));
	}

	@Override
	public void crearDisco() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("HDD 500GB"));
	}

	@Override
	public void crearGrafica() {
		
	}

	@Override
	public void crearGabinete() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Gabinete estandar (ya viene con fuente)"));

	}

}
