package com.notes.notesserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Note {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Long idUser;
 
	private String title;

	private String content;
	@Column(nullable=false)
	private Date dateCreation;

	private Date dateReminder;
	
	
	public Note(){
		
	}


	public Note(Long idUser, String title, String content, Date dateCreation, Date dateReminder) {
		super();
		this.idUser = idUser;
		this.title = title;
		this.content = content;
		this.dateCreation = dateCreation;
		this.dateReminder = dateReminder;
	}
	
	
	
}
