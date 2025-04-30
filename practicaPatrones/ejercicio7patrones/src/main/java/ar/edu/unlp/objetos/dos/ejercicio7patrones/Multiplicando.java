package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public class Multiplicando extends Operando{

	public Multiplicando() {
		
	}
	
	@Override
	public void setValor(Calculadora calculadora, double valor) {
		calculadora.setAcumulado(calculadora.getAcumulado() * valor);
		calculadora.setEstado(new Inicial());
	}
	
}
