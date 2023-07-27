package Giuseppe.Es16;

public class CustomEx extends RuntimeException {

	public CustomEx(int id) {
		super("Elemento con id: " + id + " non è stato trovato!");
	}
}
