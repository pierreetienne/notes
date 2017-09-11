package com.notes.notesserver.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TagByNote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(nullable=false, name="id_note")
	private Note nota;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(nullable=false, name="id_tag")
	private Tag tag;

	public TagByNote(Note nota, Tag tag) {
		super();
		this.nota = nota;
		this.tag = tag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Note getNota() {
		return nota;
	}

	public void setNota(Note nota) {
		this.nota = nota;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
}
