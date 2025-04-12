package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdaptee {

	public JacksonAdaptee() {
		
	}
	
	public String exportar(List<Socio> socios) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();

		// Serializar lista a String en formato JSON
		String json = mapper.writeValueAsString(socios);
		return json;

	}
}
