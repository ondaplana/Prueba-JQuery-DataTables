package es.gluetech.requisitos.datatable;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Almacena de la request los parametros enviados al servidor por datatable
 * El listado de parametros viene especificado en http://datatables.net/usage/server-side
 * TODO: implementación basica, pendiente recuperar todos los parametros, incluidos los del tipo XXX_(int)
 *
 */
public class DataTableRequest {
	
	private int iDisplayStart;
	
	private int iDisplayLength;
	
	private int iColumns;
	
	private String sSearch;
	
	private String bRegex;
	
	private int sEcho;
	
	private static final Logger logger = LoggerFactory.getLogger(DataTableResponse.class);
	
	public DataTableRequest(HttpServletRequest request) {
		
		// Se recorre todo los paramertros de la request y se guardan los valores 
		// de los parametros enviados por el widget tabledata
		@SuppressWarnings("unchecked")
		Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String nameParameter = names.nextElement();
			String valueParameter = (String) request.getParameter(nameParameter);
			logger.debug(nameParameter + "=" + valueParameter);
			
			if ("iDisplayStart".equals(nameParameter)) {
				this.iDisplayStart = Integer.parseInt(valueParameter);
			}
			else if ("iDisplayLength".equals(nameParameter)) {
				this.iDisplayLength = Integer.parseInt(valueParameter);
			}
			else if ("iColumns".equals(nameParameter)) {
				this.iColumns = Integer.parseInt(valueParameter);
			}
			else if ("sSearch".equals(nameParameter)) {
				this.sSearch = valueParameter;
			}
			else if ("bRegex".equals(nameParameter)) {
				this.bRegex = valueParameter;
			}
			else if ("sEcho".equals(nameParameter)) {
				this.sEcho = Integer.parseInt(valueParameter);
			}	
		}
	
	}

	public int getiDisplayStart() {
		return iDisplayStart;
	}

	public void setiDisplayStart(int iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	public int getiDisplayLength() {
		return iDisplayLength;
	}

	public void setiDisplayLength(int iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}

	public int getiColumns() {
		return iColumns;
	}

	public void setiColumns(int iColumns) {
		this.iColumns = iColumns;
	}

	public String getsSearch() {
		return sSearch;
	}

	public void setsSearch(String sSearch) {
		this.sSearch = sSearch;
	}

	public String getbRegex() {
		return bRegex;
	}

	public void setbRegex(String bRegex) {
		this.bRegex = bRegex;
	}

	public int getsEcho() {
		return sEcho;
	}

	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}

}
