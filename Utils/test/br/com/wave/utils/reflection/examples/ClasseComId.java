package br.com.wave.utils.reflection.examples;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class ClasseComId implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	public String getId() {
		return id;
	}

}
