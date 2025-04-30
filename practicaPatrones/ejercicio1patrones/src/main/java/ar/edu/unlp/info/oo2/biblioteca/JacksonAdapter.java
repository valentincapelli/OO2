package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JacksonAdapter extends VoorheesExporter{
	private JacksonAdaptee jackson;
	
	public JacksonAdapter() {
		this.jackson = new JacksonAdaptee();
	}
	
	public String exportar(List<Socio> socios) throws JsonProcessingException {
		return this.jackson.exportar(socios);
	}

}
