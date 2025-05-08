package ar.edu.unlp.info.oo2.ejercicio13patrones;

public class Sandwich {
	private String bread;
	private String sauce;
	private String principal;
	private String aditional;
	private double breadPrice;
	private double saucePrice;
	private double principalPrice;
	private double aditionalPrice;
	
	public Sandwich() {
		
	}
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public void setAditional(String aditional) {
		this.aditional = aditional;
	}
	public void setBreadPrice(double breadPrice) {
		this.breadPrice = breadPrice;
	}
	public void setSaucePrice(double saucePrice) {
		this.saucePrice = saucePrice;
	}
	public void setPrincipalPrice(double principalPrice) {
		this.principalPrice = principalPrice;
	}
	public void setAditionalPrice(double aditionalPrice) {
		this.aditionalPrice = aditionalPrice;
	}

	public double calcularPrecio() {
		return this.aditionalPrice
				+ this.breadPrice
				+ this.saucePrice
				+ this.principalPrice;
	}
}
