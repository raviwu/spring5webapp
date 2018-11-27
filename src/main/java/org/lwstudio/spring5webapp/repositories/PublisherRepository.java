package org.lwstudio.spring5webapp.repositories;

import org.lwstudio.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
