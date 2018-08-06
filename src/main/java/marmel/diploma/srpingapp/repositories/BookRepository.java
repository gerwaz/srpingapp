package marmel.diploma.srpingapp.repositories;

import marmel.diploma.srpingapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
