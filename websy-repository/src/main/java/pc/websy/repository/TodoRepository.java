package pc.websy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import pc.websy.model.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}