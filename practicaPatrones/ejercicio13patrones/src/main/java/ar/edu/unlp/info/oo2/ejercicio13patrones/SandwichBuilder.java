package ar.edu.unlp.info.oo2.ejercicio13patrones;

public interface SandwichBuilder {
	
	public abstract void makeBread();
	
	public abstract void makeSauce();
	
	public abstract void makePrincipal();
	
	public abstract void makeAditional();
	
	public Sandwich getResult();
	
}
