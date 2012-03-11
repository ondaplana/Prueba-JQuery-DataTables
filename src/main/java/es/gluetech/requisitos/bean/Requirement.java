package es.gluetech.requisitos.bean;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Modela un requerimiento (objeto de ejemplo)
 * 
 * NOTA: Se ha incluido una anotación al método que recupera el campo fecha
 * para en la serialización a formato JSON usar un formato específico.
 *
 */
public class Requirement {
	
	private Long id;
	
	private String name;
	
	private String description;
	
	private Date date;
	
	public Requirement(Long id, String name, String description, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
