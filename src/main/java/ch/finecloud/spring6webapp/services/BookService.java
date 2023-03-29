package ch.finecloud.spring6webapp.services;

import ch.finecloud.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();

}
