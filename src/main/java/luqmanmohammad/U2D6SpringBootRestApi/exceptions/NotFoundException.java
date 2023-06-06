package luqmanmohammad.U2D6SpringBootRestApi.exceptions;

public class NotFoundException extends RuntimeException {

	public NotFoundException(int id) {
		super("Item with id " + id + " not found!");
	}

}