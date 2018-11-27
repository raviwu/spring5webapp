package org.lwstudio.spring5webapp.repositories;

import org.lwstudio.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends CrudRepository<Book, Long> {
}
