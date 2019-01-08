package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
