package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jensW89
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
