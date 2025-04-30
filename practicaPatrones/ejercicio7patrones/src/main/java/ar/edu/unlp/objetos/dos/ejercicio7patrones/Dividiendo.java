package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public class Dividiendo extends Operando{

	public Dividiendo() {
		
	}
	
	@Override
	public void setValor(Calculadora calculadora, double valor) {
		if (valor != 0) {
			calculadora.setAcumulado(calculadora.getAcumulado() / valor);
			calculadora.setEstado(new Inicial());
		} else
			calculadora.setEstado(new Error());
	}
}
