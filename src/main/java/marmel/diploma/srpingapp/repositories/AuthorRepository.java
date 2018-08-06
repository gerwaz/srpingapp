package marmel.diploma.srpingapp.repositories;

import marmel.diploma.srpingapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
