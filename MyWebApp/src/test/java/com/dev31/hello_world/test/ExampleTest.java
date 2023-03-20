package junit;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitHelloWorld {
 
    public boolean isGreater(int num1, int num2){
        return num1 > num2;
    }
}

public class JUnitHelloWorldTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}
	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		JUnitHelloWorld helloWorld = new JUnitHelloWorld();
		assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
	}
	@After
	public void after() {
		System.out.println("After Test Case");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
