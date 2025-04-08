package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JsonSimpleAdapter extends VoorheesExporter{
	private JSONArray array;
	
	public String exportar(List<Socio> socios) {
		array = new JSONArray();
		socios.stream()
		.forEach(s -> {array.add( new JSONObject)});
	}
	
}
