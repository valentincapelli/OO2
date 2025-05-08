package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class SubteWay {
	private SandwichBuilder sandwichBuilder;
	
	public SubteWay() {
		
	}

	public Sandwich makeSandwich(SandwichBuilder sandwichBuilder) {
		sandwichBuilder.makeBread();
		sandwichBuilder.makeSauce();
		sandwichBuilder.makePrincipal();
		sandwichBuilder.makeAditional();
		return sandwichBuilder.getResult();
	}
	
}
