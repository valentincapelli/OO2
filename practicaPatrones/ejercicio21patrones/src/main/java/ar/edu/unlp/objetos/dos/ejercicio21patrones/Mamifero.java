package ar.edu.unlp.objetos.dos.ejercicio21patrones;

import java.time.LocalDate;
import java.util.Date;

public class Mamifero implements IMamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private IMamifero padre;
	private IMamifero madre;
	
	public Mamifero() {
		this.padre = new NullMamifero();
		this.madre = new NullMamifero();		
	}

	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public void setIdentificador(String id) {
		this.identificador = id;
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	@Override
	public IMamifero getPadre() {
		return this.padre;
	}

	@Override
	public void setPadre(IMamifero padre) {
		this.padre = padre;
	}

	@Override
	public IMamifero getMadre() {
		return this.madre;
	}

	@Override
	public void setMadre(IMamifero madre) {
		this.madre = madre;
	}

	@Override
	public IMamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}

	@Override
	public IMamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}

	@Override
	public IMamifero getAbuelaPaterno() {
		return this.padre.getMadre();
	}

	@Override
	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		return this.padre.equals(unMamifero)
				|| this.madre.equals(unMamifero)
				|| this.padre.tieneComoAncestroA(unMamifero)
				|| this.madre.tieneComoAncestroA(unMamifero);
	}

}
