package org.lwstudio.spring5webapp.repositories;

import org.lwstudio.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
