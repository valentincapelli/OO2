package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

import java.time.LocalDate;

public class Enterprise {

	public PC contruirPC(PCBuilder builder, String nombre, LocalDate fecha) {
		builder.crearPC(nombre, fecha);
		builder.crearProcesador();
		builder.crearRam();
		builder.crearDisco();
		builder.crearGrafica();
		builder.crearGabinete();
		return builder.getPc();
	}
}
