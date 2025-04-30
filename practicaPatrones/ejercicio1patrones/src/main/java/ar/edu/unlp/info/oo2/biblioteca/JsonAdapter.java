package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonAdapter extends VoorheesExporter{
	private JsonAdaptee json;
	
	public JsonAdapter() {
		this.json = new JsonAdaptee();
	}
	
	public String exportar(List<Socio> socios) {
		return json.exportar(socios);
	}
	
}
