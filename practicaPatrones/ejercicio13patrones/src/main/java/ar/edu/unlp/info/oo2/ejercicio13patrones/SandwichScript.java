package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class SandwichScript {
	public static void main(String[] args) {
		SubteWay subteway = new SubteWay();
		
		Sandwich classic = subteway.makeSandwich(new ClassicBuilder());
		System.out.println("Precio del sandwich clasico: " + classic.calcularPrecio());
		
		Sandwich vegan = subteway.makeSandwich(new VeganBuilder());
		System.out.println("Precio del sandwich vegano: " + vegan.calcularPrecio());
		
		Sandwich vegetarian = subteway.makeSandwich(new VegetarianBuilder());
		System.out.println("Precio del sandwich vegetariano: " + vegetarian.calcularPrecio());
		
		Sandwich noTACC = subteway.makeSandwich(new NoTACCBuilder());
		System.out.println("Precio del sandwich sin TACC: " + noTACC.calcularPrecio());
	}
}
