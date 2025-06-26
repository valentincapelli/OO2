package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;


public class JsonAdapter extends VoorheesExporter{
	private JsonAdaptee json;
	
	public JsonAdapter() {
		this.json = new JsonAdaptee();
	}
	
	public String exportar(List<Socio> socios) {
		return this.json.exportar(socios);
	}
	
}
