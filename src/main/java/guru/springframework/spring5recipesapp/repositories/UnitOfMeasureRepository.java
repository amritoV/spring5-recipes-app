package guru.springframework.spring5recipesapp.repositories;

import guru.springframework.spring5recipesapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
