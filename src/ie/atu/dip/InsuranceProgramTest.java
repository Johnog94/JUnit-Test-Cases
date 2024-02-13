package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Test class for the <b>InsuranceProgram</b> class. It includes various test methods
 * to validate the functionality of the InsuranceProgram class.
 *
 * @author Jonathan Griffey - G00299043
 * @version 1.0
 * @since 2023-12-15
 */
class InsuranceProgramTest {

	/** The InsuranceProgram instance used for testing. */
	public static InsuranceProgram ip;

	/**
	 * Initialises the InsuranceProgram instance before all test methods are
	 * executed.
	 */
	@BeforeAll
	public static void SetUp() {
		ip = new InsuranceProgram();
	}

	/**
	 * Code to be executed before each test method.
	 */
	@BeforeEach
	void setUp() {
		System.out.println("Before each test");
	}

	/**
	 * Code to be executed after each test method.
	 */
	@AfterEach
	void tearDown() {
		System.out.println("After each test");
	}

	/**
	 * Code to be executed once after all test methods.
	 */
	@AfterAll
	static void tearDownAfterAll() {
		System.out.println("After all tests");
	}

	/**
	 * Parameterized test for the getUserAge method of InsuranceProgram. It
	 * validates that the method correctly retrieves the user's age from the scanner
	 * input.
	 *
	 * @param ageInput The age input provided for testing.
	 */
	@ParameterizedTest
	@ValueSource(strings = { "30", "35", "40" })
	void testGetUserAge(String ageInput) {
		String inputData = ageInput + "\n"; // Example: Age 30
		InputStream inputStream = new ByteArrayInputStream(inputData.getBytes());
		Scanner scanner = new Scanner(inputStream);

		int age = InsuranceProgram.getUserAge(scanner);

		assertEquals(Integer.parseInt(ageInput), age);
	}

	/**
	 * Parameterized test for the getNumberOfAccidents method of
	 * InsuranceProgram. It validates that the method correctly retrieves the number
	 * of accidents from the scanner input.
	 *
	 * @param accidentsInput The number of accidents input provided for testing.
	 */
	@ParameterizedTest
	@ValueSource(ints = { 3, 5, 7 })
	void testGetNumberOfAccidents(int accidentsInput) {
		String inputData = accidentsInput + "\n"; // Example: 3 accidents
		InputStream inputStream = new ByteArrayInputStream(inputData.getBytes());
		Scanner scanner = new Scanner(inputStream);

		int accidents = InsuranceProgram.getNumberOfAccidents(scanner);

		assertEquals(accidentsInput, accidents);
	}
	

}
