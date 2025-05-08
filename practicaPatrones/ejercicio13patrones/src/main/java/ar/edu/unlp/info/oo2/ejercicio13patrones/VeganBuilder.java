package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class VeganBuilder implements SandwichBuilder{
	private Sandwich sandwich;
	
	public VeganBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void makeBread() {
		this.sandwich.setBread("Pan integral");
		this.sandwich.setBreadPrice(100);
	}

	@Override
	public void makeSauce() {
		this.sandwich.setSauce("Salsa criolla");
		this.sandwich.setSaucePrice(20);
	}

	@Override
	public void makePrincipal() {
		this.sandwich.setPrincipal("Milanesa de girgolas");
		this.sandwich.setPrincipalPrice(500);
	}

	@Override
	public void makeAditional() {
		this.sandwich.setAditional("");
		this.sandwich.setAditionalPrice(0);
	}

	@Override
	public Sandwich getResult() {
		return this.sandwich;
	}
}
