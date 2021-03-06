package es.gluetech.requisitos.bean;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * Extiende el serializador de un objeto fecha de Jackson JSON para 
 * especificar un formato concreto.
 *
 */
public class CustomDateSerializer extends JsonSerializer<Date> {
	
	@Override
	public void serialize(Date value, JsonGenerator gen, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String formattedDate = formatter.format(value);
	
		gen.writeString(formattedDate);		
	}

}
