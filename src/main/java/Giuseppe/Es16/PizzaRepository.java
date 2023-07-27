package Giuseppe.Es16;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
	Optional<Pizza> findByName(String name);

	List<Pizza> findByNameStartingWithIgnoreCase(String name);
}
