package ch.finecloud.spring6webapp.repositories;


import ch.finecloud.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
