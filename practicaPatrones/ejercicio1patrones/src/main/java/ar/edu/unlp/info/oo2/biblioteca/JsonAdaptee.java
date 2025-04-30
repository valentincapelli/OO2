package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonAdaptee {
	private JSONArray array;
	
	public JsonAdaptee() {
		this.array = new JSONArray();
	}
	
	private JSONObject exportar (Socio socio) {
		JSONObject object = new JSONObject ();
		object.put("nombre", socio.getNombre());
		object.put("email", socio.getEmail());
		object.put("legajo", socio.getLegajo());
		return object;
	}
	
	public String exportar(List<Socio> socios) {
		socios.stream().forEach(socio -> {this.array.add(exportar(socio));});
		return array.toJSONString();
	}
	
}
