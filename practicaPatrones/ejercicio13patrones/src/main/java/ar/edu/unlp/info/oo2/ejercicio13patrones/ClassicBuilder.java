package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class ClassicBuilder implements SandwichBuilder{
	private Sandwich sandwich;
	
	public ClassicBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void makeBread() {
		this.sandwich.setBread("Pan brioche");
		this.sandwich.setBreadPrice(100);
	}

	@Override
	public void makeSauce() {
		this.sandwich.setSauce("A base de mayonesa");
		this.sandwich.setSaucePrice(20);
	}

	@Override
	public void makePrincipal() {
		this.sandwich.setPrincipal("Carne de ternera");
		this.sandwich.setPrincipalPrice(300);
	}

	@Override
	public void makeAditional() {
		this.sandwich.setAditional("Tomate");
		this.sandwich.setAditionalPrice(80);
	}

	@Override
	public Sandwich getResult() {
		return this.sandwich;
	}
}
