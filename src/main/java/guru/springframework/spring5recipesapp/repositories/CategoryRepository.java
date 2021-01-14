package guru.springframework.spring5recipesapp.repositories;

import guru.springframework.spring5recipesapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
