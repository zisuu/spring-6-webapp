package ch.finecloud.spring6webapp.repositories;

import ch.finecloud.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
