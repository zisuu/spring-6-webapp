package ch.finecloud.spring6webapp.services;

import ch.finecloud.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
