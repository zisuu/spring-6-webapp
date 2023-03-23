package ch.finecloud.spring6webapp.repositories;

import ch.finecloud.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
