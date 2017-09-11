package com.notes.notesserver.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Note {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(nullable=false ,name="id_user_note")
	private UserNote userNote;

	private String title;

	@Column(nullable=false)
	private String content;
	
	@Column(nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReminder;
	
	public Note(){
		
	}

	public Note(UserNote userNote, String title, String content, Date dateCreation, Date dateReminder) {
		super();
		this.userNote = userNote;
		this.title = title;
		this.content = content;
		this.dateCreation = dateCreation;
		this.dateReminder = dateReminder;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateReminder() {
		return dateReminder;
	}

	public void setDateReminder(Date dateReminder) {
		this.dateReminder = dateReminder;
	}
}
