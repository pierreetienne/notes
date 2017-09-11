package com.notes.notesserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.notes.notesserver.model.Note;

public interface NoteRepository extends CrudRepository<Note, Long>{

}
