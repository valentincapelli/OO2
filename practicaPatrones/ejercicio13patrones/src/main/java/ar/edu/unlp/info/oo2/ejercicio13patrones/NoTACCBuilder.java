package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class NoTACCBuilder implements SandwichBuilder{
	private Sandwich sandwich;
	
	public NoTACCBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void makeBread() {
		this.sandwich.setBread("Pan de chipa");
		this.sandwich.setBreadPrice(150);
	}

	@Override
	public void makeSauce() {
		this.sandwich.setSauce("Salsa tartara");
		this.sandwich.setSaucePrice(18);
	}

	@Override
	public void makePrincipal() {
		this.sandwich.setPrincipal("Carne de pollo");
		this.sandwich.setPrincipalPrice(250);
	}

	@Override
	public void makeAditional() {
		this.sandwich.setAditional("Verduras grilladas");
		this.sandwich.setAditionalPrice(200);
	}

	@Override
	public Sandwich getResult() {
		return this.sandwich;
	}

}
