//Test suite for right angle feature in Triangle program.
//Designed by Justin Lai
import static org.junit.Assert.*;

import org.junit.Test;


public class RightTriangleTests {

	@Test
	public void WR1() {
		assertEquals("Not a triangle", Triangle.Triangle_Test(4, 1, 2));
	}

	@Test
	public void WR2() {
		assertEquals("Right Scalene", Triangle.Triangle_Test(3, 4, 5));
	}

	@Test
	public void WR3() {
		assertEquals ("Right Isosceles", Triangle.Triangle_Test(Math.sqrt(2), Math.sqrt(2), 2));
	}

	@Test
	public void WR4() {
		assertEquals ("Equilateral (not right)", Triangle.Triangle_Test(3, 3, 3));
	}

	@Test
	public void WR5() {
		assertEquals ("Scalene (not right)", Triangle.Triangle_Test(2, 3, 4));
	}
	
	@Test
	public void WR6() {
		assertEquals ("Isosceles (not right)", Triangle.Triangle_Test(4,4,6));
	}
	
	@Test
	public void WR7() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(-1, 5, 5));
	}

	
	@Test
	public void WR8() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(5, -1, 5));
	}

	
	@Test
	public void WR9() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(5, 5, -1));
	}

	
	@Test
	public void WR10() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(201, 5, 5));
	}

	
	@Test
	public void WR11() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(5, 201, 5));
	}

	
	@Test
	public void WR12() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(5, 5, 201));
	}


}