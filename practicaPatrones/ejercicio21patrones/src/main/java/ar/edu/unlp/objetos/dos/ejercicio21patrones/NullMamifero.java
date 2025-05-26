package ar.edu.unlp.objetos.dos.ejercicio21patrones;

import java.time.LocalDate;

public class NullMamifero implements IMamifero{
	
	public NullMamifero() {
		
	}
	
	@Override
	public String getIdentificador() {
		return "?";
	}

	@Override
	public void setIdentificador(String id) {
		
	}

	@Override
	public String getEspecie() {
		return "?";
	}

	@Override
	public void setEspecie(String especie) {

	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {

	}

	@Override
	public IMamifero getPadre() {
		return null;
	}

	@Override
	public void setPadre(IMamifero padre) {
		
	}

	@Override
	public IMamifero getMadre() {
		return null;
	}

	@Override
	public void setMadre(IMamifero madre) {

	}

	@Override
	public IMamifero getAbueloMaterno() {
		return null;
	}

	@Override
	public IMamifero getAbuelaMaterna() {
		return null;
	}

	@Override
	public IMamifero getAbueloPaterno() {
		return null;
	}

	@Override
	public IMamifero getAbuelaPaterno() {
		return null;
	}

	@Override
	public boolean tieneComoAncestroA(IMamifero unMamifero) {
		return false;
	}
}
