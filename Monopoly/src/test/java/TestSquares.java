
import org.junit.Assert;
import org.junit.Test;

public class TestSquares {
	ISquare square;

	@Test
	public void testGetSquareName() {
		String inputName = "Park Place";
		square = new PropertySquare(inputName);

		Assert.assertEquals(inputName, square.getName());
	}

}
