package hw.calculator.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorApplicationTests {

	@Test
	public void contextLoads() {
	}

	Operator operator =new Operator();

	@Test
	public void testAdd() {
		assertEquals(5, operator.add(2,3));
	}

	@Test
	public void testSub() {
		assertEquals(1, operator.sub(3,2));
	}

	@Test
	public void testMul() {
		assertEquals(6, operator.mul(2,3));
	}
	@Test
	public void testDiv() {
		assertEquals(2, operator.div(6,3));
	}
	@Test
	public void testMod() {
		assertEquals(5, operator.mod(23,6));
	}
}
