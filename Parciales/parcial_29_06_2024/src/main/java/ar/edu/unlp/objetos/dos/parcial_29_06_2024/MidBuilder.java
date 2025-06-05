package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

public class MidBuilder extends PCBuilder{
	
	@Override
	public void crearProcesador() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Procesador intermedio"));
	}

	@Override
	public void crearRam() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("16 GB"));
	}

	@Override
	public void crearDisco() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("SDD 500GB"));
	}

	@Override
	public void crearGrafica() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("GTX 1650"));

	}

	@Override
	public void crearGabinete() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Gabinete estandar "));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Fuente 800w"));
	}
}
