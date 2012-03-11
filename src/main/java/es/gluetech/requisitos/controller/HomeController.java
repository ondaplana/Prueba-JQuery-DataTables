package es.gluetech.requisitos.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import es.gluetech.requisitos.bean.Requirement;
import es.gluetech.requisitos.datatable.DataTableRequest;
import es.gluetech.requisitos.datatable.DataTableResponse;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Se incluye una variable estática con una colección de objetos Requirement.
	 * TODO: realizar lo mismo pero recuperando los objetos de una base de datos
	 * usando por ejemplo JPA/Hibernate como ORM.
	 */
		
	private static ArrayList<Requirement> list = new ArrayList<Requirement>();
	
	private static final int I_TOTAL_RECORDS = 100000;
		
	private static final int I_TOTAL_DISPLAY_RECORDS = 100000;
	
	static {
		for (int i=0; i<I_TOTAL_RECORDS; i++) {
			Requirement requirement = new Requirement(new Long(i),
					"Requerimiento " + String.valueOf(i),
					"Descripción del requerimiento " + String.valueOf(i),
					new Date());
					
	    	list.add(requirement);
		}
	}
	
	/**
	 * LLeva a la página de incio de la prueba que enlaza los ejemplos
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String getRequisitos() {
		return "index";
	}
	
	/**
	 * LLeva a la página ejemplo 1
	 * @return
	 */
	@RequestMapping(value="/ejemplo1", method=RequestMethod.GET)
    public String getEjemplo1() {
		return "ejemplo1";
	}
	
	/**
	 * LLeva a la página ejemplo 2
	 * @return
	 */
	@RequestMapping(value="/ejemplo2", method=RequestMethod.GET)
    public String getEjemplo2() {
		return "ejemplo2";
	}
	
	
	/**
	 * Servicio REST que devuelve la respuesta en formato JSON 
	 * que necesita el componente JQuery DataTable para visualizar
	 * una página de objetos Requirement
	 * 
	 * NOTA: por defecto, está configurado en servlet-context.xml que 
	 * si no se se resuelve la vista por el context-type se devuelve
	 * la respuesta en formato JSON
	 * 
	 */
	@RequestMapping(value="/requirement", method=RequestMethod.GET)
    public @ResponseBody DataTableResponse getRequirement(HttpServletRequest request) {
		
		// Se procesa la request para obtener los parametros enviados por el componente DataTable
		DataTableRequest dtRequest = new DataTableRequest(request);
		logger.info("Datatable request:" + dtRequest.toString());
		 
		// Se recupera los elementos solicitados por el componente DataTable
		ArrayList<Requirement> page = new ArrayList<Requirement>();
		int first = dtRequest.getiDisplayStart();
		int last = first + dtRequest.getiDisplayLength();
		for (int i=first; i<last; i++) {
			page.add(list.get(i));
		}
    	
		// Construye el objeto de respuesta que espera el componente DataTable
    	DataTableResponse response = new DataTableResponse(I_TOTAL_RECORDS,
    			I_TOTAL_DISPLAY_RECORDS, dtRequest.getsEcho(), page);
    	
        return response;
    }
	
}
