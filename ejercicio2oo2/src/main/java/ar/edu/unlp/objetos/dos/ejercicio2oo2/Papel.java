package ar.edu.unlp.objetos.dos.ejercicio2oo2;

public class Papel implements Objeto {

	public Papel() {
		
	}
	
	@Override
	public String jugarContra(Objeto objeto) {
		return objeto.jugarContraPapel();
	}

	@Override
	public String jugarContraTijera() {
		return "Gana tijera";
	}

	@Override
	public String jugarContraPapel() {
		return "Empate";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana papel";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana papel";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Gana lagarto";
	}
	
}
