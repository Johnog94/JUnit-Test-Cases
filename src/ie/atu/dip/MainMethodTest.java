package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * The <b>MainMethodTest</b> class contains JUnit test methods for testing the main
 * method in the InsuranceProgram class with a specified timeout.
 *
 * @author Jonathan Griffey - G00299043
 * @version 1.0
 * @since 2023-12-15
 */
class MainMethodTest {

	/**
	 * Test the main method of the InsuranceProgram class within a specified
	 * timeout. The test sets up an expected input, executes the main method, and
	 * asserts that the execution completes within the given timeout.
	 */
	@Test
	@Timeout(value = 5, unit = TimeUnit.MILLISECONDS)
	void Test() {
		// Prepare input for the test
		String ExpectedInput = "26\n2\n"; // Replace with appropriate age and accidents values
		InputStream originalSystemIn = System.in;
		System.setIn(new ByteArrayInputStream(ExpectedInput.getBytes()));

		// Execute the main method within the specified timeout
		assertTimeout(Duration.ofSeconds(5), () -> InsuranceProgram.main(new String[] {}));

		// Reset System.in to its original state
		System.setIn(originalSystemIn);
	}
}
