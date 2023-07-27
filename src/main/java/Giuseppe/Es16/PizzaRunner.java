package Giuseppe.Es16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PizzaRunner implements CommandLineRunner {

	@Autowired
	private IPizzaDAO dao;

	@Override
	public void run(String... args) throws Exception {

		try {
			Pizza pizza = Pizza.builder().name("Margherita").drink("Pepsi").numeroOrdine(6).numeroTavolo(10)
					.topping("PAtatine e Maionese").build();
			dao.save(pizza);
		} catch (CustomEx e) {
			log.info(e.getMessage());
		}

		try {

			dao.findByIdAndDelete(1);
		} catch (CustomEx e) {
			log.error(e.getMessage());
		}

		log.info("Count --> " + dao.count());
		try {

			log.info(dao.findById(1).toString());

		} catch (CustomEx e) {
			log.error(e.getMessage());
		}

		dao.findAll().forEach(pizza -> log.info(pizza.toString()));

		dao.findByPartialNameIgnoreCase("g").forEach(pizza -> log.info(pizza.toString()));
	}

}
