package ar.edu.unlp.objetos.dos.ejercicio7patrones;

public interface Estado {
	
	public void setValor(Calculadora calculadora, double valor);
	
	public void mas(Calculadora calculadora);
	
	public void menos(Calculadora calculadora);
	
	public void por(Calculadora calculadora);
	
	public void dividido(Calculadora calculadora);
	
	public String resultado(Calculadora calculadora);

}
