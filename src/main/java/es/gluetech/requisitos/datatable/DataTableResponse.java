package es.gluetech.requisitos.datatable;

import java.util.Collection;

/**
 * Almacena los parametros de respuesta a la llamada de un widget DataTable
 * El parametro aaData es generico para almacenar cualquier colección de objetos
 * 
 */
public class DataTableResponse {
	
	private int iTotalRecords;
	
	private int iTotalDisplayRecords;
	
	private int sEcho;
	
	@SuppressWarnings("rawtypes")
	private Collection aaData;
	
	@SuppressWarnings("rawtypes")
	public DataTableResponse(int iTotalRecords, int iTotalDisplayRecords,
			int sEcho, Collection aaData) {
		super();
		this.iTotalRecords = iTotalRecords;
		this.iTotalDisplayRecords = iTotalDisplayRecords;
		this.sEcho = sEcho;
		this.aaData = aaData;
	}

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public int getsEcho() {
		return sEcho;
	}

	public void setsEcho(int sEcho) {
		this.sEcho = sEcho;
	}

	@SuppressWarnings("rawtypes")
	public Collection getAaData() {
		return aaData;
	}

	@SuppressWarnings("rawtypes")
	public void setAaData(Collection aaData) {
		this.aaData = aaData;
	}

}
