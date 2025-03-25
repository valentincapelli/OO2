package ar.edu.unlp.objetos.dos.ejercicio2oo2;

public class Lagarto implements Objeto{
	public Lagarto() {
		
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
		return "Gana lagarto";
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana piedra";
	}

	@Override
	public String jugarContraSpock() {
		// TODO Auto-generated method stub
		return "Gana lagarto";
	}

	@Override
	public String jugarContraLagarto() {
		// TODO Auto-generated method stub
		return "Empate";
	}
}
