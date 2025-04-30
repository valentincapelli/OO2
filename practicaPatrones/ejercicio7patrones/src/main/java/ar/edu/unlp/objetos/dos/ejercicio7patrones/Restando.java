package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public class Restando extends Operando{
	
	public Restando() {
		
	}

	@Override
	public void setValor(Calculadora calculadora, double valor) {
		calculadora.setAcumulado(calculadora.getAcumulado() - valor);
		calculadora.setEstado(new Inicial());
	}
	
}
