import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBoard {
	
	Board board;

	@Before
	public void setUp() throws Exception {
		board = new Board();
	}

	@After
	public void tearDown() throws Exception {
		board = null;
	}

	@Test
	public void testCreatedBoard() {
		Assert.assertNotNull(board);
	}

}
