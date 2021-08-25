package org.generation.BlogPessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;




@Entity
@Table(name = "postagem")
public class Postagem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
	@Size(min=5, max=100)
	private String titulo;

	@NotBlank
	@Size(min=10, max=500)
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	
	
	public long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	public Date getDate() {
		return date;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
