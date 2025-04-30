package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public class Inicial implements Estado{

	@Override
	public void setValor(Calculadora calculadora, double valor) {
		calculadora.setAcumulado(valor);
	}

	@Override
	public void mas(Calculadora calculadora) {
		calculadora.setEstado(new Sumando());
	}

	@Override
	public void menos(Calculadora calculadora) {
		calculadora.setEstado(new Restando());
	}

	@Override
	public void por(Calculadora calculadora) {
		calculadora.setEstado(new Multiplicando());
	}

	@Override
	public void dividido(Calculadora calculadora) {
		calculadora.setEstado(new Dividiendo());
	}

	@Override
	public String resultado(Calculadora calculadora) {
		return Double.toString(calculadora.getAcumulado());
	}
}
