package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

import java.time.LocalDate;

public abstract class PCBuilder {
	private PC pc ;
	private Catalogo catalogo;
	
	public PCBuilder() {
		this.catalogo = new Catalogo();
	}
	
	public  void crearPC(String nombre, LocalDate fecha) {
		this.pc = new PC(nombre, fecha);
	}
	
	public abstract void crearProcesador();
	public abstract void crearRam();
	public abstract void crearDisco();
	public abstract void crearGrafica();
	public abstract void crearGabinete();
	
	public PC getResult() {
		return this.pc;
	}
	
	public PC getPc() {
		return pc;
	}

	public Catalogo getCatalogo() {
		return catalogo;
	}
	
}
