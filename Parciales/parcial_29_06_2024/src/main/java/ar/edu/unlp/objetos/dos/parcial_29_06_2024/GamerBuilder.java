package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

public class GamerBuilder extends PCBuilder{

	@Override
	public void crearProcesador() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Procesador gamer"));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Pad termico"));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Cooler"));

	}

	@Override
	public void crearRam() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("32 GB"));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("32 GB"));
	}

	@Override
	public void crearDisco() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("SDD 500GB"));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("SSD1 TB"));
	}

	@Override
	public void crearGrafica() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("RTX 4090"));

	}

	@Override
	public void crearGabinete() {
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Gabinete gamer"));
		this.getPc().agregarComponente(this.getCatalogo().getComponente("Fuente" +  this.calcularConsumo() + "w"));
	}
	
	public double calcularConsumo() {
		return this.getPc().calcularConsumo() + (0.5 * this.calcularConsumo());
	}
	
}
