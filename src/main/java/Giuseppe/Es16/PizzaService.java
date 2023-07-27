package Giuseppe.Es16;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PizzaService implements IPizzaDAO {

	@Autowired
	private PizzaRepository pizzaRepository;

	public void save(Pizza pizza) {
		pizzaRepository.save(pizza);
		log.info("Pizza aggiunta correttamente");

	}

	public void findByIdAndUpdate(int id, Pizza pizza) {
		Pizza pizzaAgg = this.findById(id);
		pizzaAgg.setId(id);
		pizzaAgg.setName("Marinara");
		pizzaAgg.setDrink("Coca-cocola");
		pizzaAgg.setNumeroTavolo(5);
		pizzaAgg.setNumeroOrdine(7);
		pizzaAgg.setTopping("Prosciutto, Pomodoro, Mozzarella");
		pizzaRepository.save(pizzaAgg);
		log.info("Pizza aggiornata correttamente");

	}

	public void findByIdAndDelete(int id) {
		Pizza pizzaAgg = this.findById(id);
		pizzaRepository.delete(pizzaAgg);

	}

	public Pizza findById(int id) {

		return pizzaRepository.findById(id).orElseThrow(() -> new CustomEx(id));
	}

	public List<Pizza> findAll() {

		return pizzaRepository.findAll();
	}

	public long count() {

		return pizzaRepository.count();
	}

	public List<Pizza> findByPartialNameIgnoreCase(String name) {
		return pizzaRepository.findByNameStartingWithIgnoreCase(name);
	}

}
