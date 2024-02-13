package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * The <b>CalculationTest</b> class contains JUnit test methods for testing the
 * calculation methods in the InsuranceProgram class.
 *
 * @author Jonathan Griffey - G00299043
 * @version 1.0
 * @since 2023-12-15
 */
class CalculationTest {

	/**
	 * Test the calculateTotalAmount method for individuals under 25 with no
	 * accidents.
	 */
	@Test
	void testCalculateTotalAmountUnder25NoAccidents() {
		int totalAmount = InsuranceProgram.calculateTotalAmount(20, 0);
		assertEquals(600, totalAmount);
	}

	/**
	 * Test the calculateTotalAmount method for individuals under 25 with accidents.
	 */
	@Test
	void testCalculateTotalAmountUnder25WithAccidents() {
		int totalAmount = InsuranceProgram.calculateTotalAmount(22, 3);
		assertEquals(825, totalAmount);
	}

	/**
	 * Test the calculateTotalAmount method for individuals over 25 with no
	 * accidents.
	 */
	@Test
	void testCalculateTotalAmountOver25NoAccidents() {
		int totalAmount = InsuranceProgram.calculateTotalAmount(30, 0);
		assertEquals(500, totalAmount);
	}

	/**
	 * Test the calculateTotalAmount method for individuals over 25 with accidents.
	 */
	@Test
	void testCalculateTotalAmountOver25WithAccidents() {
		int totalAmount = InsuranceProgram.calculateTotalAmount(30, 2);
		assertEquals(625, totalAmount);
	}

	/**
	 * Test the calculateAccidentSurcharge method for no accidents.
	 */
	@Test
	void testCalculateAccidentSurchargeNoAccidents() {
		int surcharge = InsuranceProgram.calculateAccidentSurcharge(0);
		assertEquals(0, surcharge);
	}

	/**
	 * Test the calculateAccidentSurcharge method for accidents.
	 */
	@Test
	void testCalculateAccidentSurchargeWithAccidents() {
		int surcharge = InsuranceProgram.calculateAccidentSurcharge(4);
		assertEquals(375, surcharge);
	}

	/**
	 * Test the calculateAccidentSurcharge method for excessive accidents.
	 */
	@Test
	void testCalculateAccidentSurchargeExcessiveAccidents() {
		int surcharge = InsuranceProgram.calculateAccidentSurcharge(8);
		assertEquals(0, surcharge);
	}

}
