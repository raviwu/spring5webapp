package org.lwstudio.spring5webapp.bootstrap;

import org.lwstudio.spring5webapp.model.Author;
import org.lwstudio.spring5webapp.model.Book;
import org.lwstudio.spring5webapp.model.Publisher;
import org.lwstudio.spring5webapp.repositories.AuthorRepository;
import org.lwstudio.spring5webapp.repositories.BookRepository;
import org.lwstudio.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        // Eric
        Publisher harper = new Publisher("Harper Collins", "US");
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "12345", harper);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisherRepository.save(harper);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        // Rod
        Publisher worx = new Publisher("Worx", "EU");
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);

        publisherRepository.save(worx);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
