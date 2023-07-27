package Giuseppe.Es16;

import java.util.List;

public interface IPizzaDAO {
	public void save(Pizza pizza);

	public void findByIdAndUpdate(int id, Pizza user);

	public void findByIdAndDelete(int id);

	public Pizza findById(int id);

	public List<Pizza> findAll();

	public long count();

	public List<Pizza> findByPartialNameIgnoreCase(String name);
}
