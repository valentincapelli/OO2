package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public abstract class Operando implements Estado{

	@Override
	public abstract void setValor(Calculadora calculadora, double valor);

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}

	@Override
	public void menos(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}

	@Override
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}

	@Override
	public void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Error());
	}

	@Override
	public String resultado(Calculadora calculadora) {
		calculadora.setEstado(new Error());
		return "Error";
	}

}
