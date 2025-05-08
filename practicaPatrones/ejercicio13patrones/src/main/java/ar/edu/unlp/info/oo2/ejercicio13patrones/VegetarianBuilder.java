package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class VegetarianBuilder implements SandwichBuilder {
	private Sandwich sandwich;
	
	public VegetarianBuilder() {
		this.sandwich = new Sandwich();
	}
	
	@Override
	public void makeBread() {
		this.sandwich.setBread("Pan con semillas");
		this.sandwich.setBreadPrice(120);
	}

	@Override
	public void makeSauce() {
		this.sandwich.setSauce("");
		this.sandwich.setSaucePrice(0);
	}

	@Override
	public void makePrincipal() {
		this.sandwich.setPrincipal("Provoleta grillada");
		this.sandwich.setPrincipalPrice(200);
	}

	@Override
	public void makeAditional() {
		this.sandwich.setAditional("Berenjenas al escabeche");
		this.sandwich.setAditionalPrice(100);
	}

	@Override
	public Sandwich getResult() {
		return this.sandwich;
	}
}
