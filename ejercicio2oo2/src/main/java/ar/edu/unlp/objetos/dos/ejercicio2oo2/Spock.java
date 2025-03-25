package ar.edu.unlp.objetos.dos.ejercicio2oo2;

public class Spock implements Objeto{
	
	public Spock() {
		
	}
	
	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraPapel();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana spock";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana papel";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana spock";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana lagarto";
	}
}
