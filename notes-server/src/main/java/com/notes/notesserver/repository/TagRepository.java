package com.notes.notesserver.repository;

import org.springframework.data.repository.CrudRepository;

import com.notes.notesserver.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{

}
