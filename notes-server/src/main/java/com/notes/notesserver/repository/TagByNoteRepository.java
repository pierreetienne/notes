package com.notes.notesserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.notes.notesserver.model.TagByNote;

public interface TagByNoteRepository extends CrudRepository<TagByNote, Long>{

}
