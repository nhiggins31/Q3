import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void AreaTest() {
		Triangle A=new Triangle(3,4,5);
		Triangle B=new Triangle(6,8,10);
		assertTrue(A.getArea()==B.getArea());
		
	}
	@Test
	public void PerimeterTest() {
		Triangle B=new Triangle(12,16,20);
		assertTrue(B.getPerimeter()==48);
	}

}