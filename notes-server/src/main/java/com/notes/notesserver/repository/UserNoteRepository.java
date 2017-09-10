package com.notes.notesserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.notes.notesserver.model.UserNote;

public interface UserNoteRepository extends CrudRepository<UserNote, Long> {

	
	
}
