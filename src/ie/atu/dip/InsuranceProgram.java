
package ie.atu.dip;

import java.util.Scanner; 

/**
 * The <b>InsuranceProgram</b> class represents a simple insurance calculator that calculates
 * the total amount to pay based on the user's age and number of accidents.
 *
 * @author Jonathan Griffey G00299043 - Refactored from Agile Assignment Brief
 * @version 1.0
 * @since 2023-12-15
 */

public class InsuranceProgram {

	/** The base cost of insurance. */
	private static final int BASIC_INSURANCE = 500;

	/** Additional surcharge for individuals under 25 years old. */
	private static final int SURCHARGE_UNDER_25 = 100;

	/**
	 * The main method of the program, which takes user input for age and accidents,
	 * calculates the total amount, and prints the result.
	 */
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int age = getUserAge(input);
			int accidents = getNumberOfAccidents(input);

			int totalAmount = calculateTotalAmount(age, accidents);
			System.out.println("Total amount to pay: " + totalAmount);
		}
	}

	/**
	 * Gets the user's age from the provided scanner.
	 *
	 * @param scanner - The Scanner object used for user input.
	 * @return age - The user's age.
	 */
	static int getUserAge(Scanner scanner) {
		System.out.print("Enter your age: ");
		return scanner.nextInt();
	}

	/**
	 * Gets the number of accidents from the provided scanner.
	 *
	 * @param scanner - The Scanner object used for user input.
	 * @return accidents - The number of accidents.
	 */
	static int getNumberOfAccidents(Scanner scanner) {
		System.out.print("\nHow many accidents did you have? ");
		return scanner.nextInt();
	}

	/**
	 * Calculates the total insurance amount based on the user's age and number of
	 * accidents.
	 *
	 * @param age       - The user's age.
	 * @param accidents - The number of accidents.
	 * @return The total insurance amount to pay.
	 */
	static int calculateTotalAmount(int age, int accidents) {
		int basicInsurance = BASIC_INSURANCE;

		if (age < 25) {
			basicInsurance += SURCHARGE_UNDER_25;
			System.out.println("Additional surcharge " + SURCHARGE_UNDER_25);
		} else {
			System.out.println("No additional surcharge");
		}

		int surcharge = calculateAccidentSurcharge(accidents);
		return basicInsurance + surcharge;
	}

	/**
	 * Calculates the surcharge based on the number of accidents.
	 *
	 * @param accidents - The number of accidents.
	 * @return The surcharge amount.
	 */
	static int calculateAccidentSurcharge(int accidents) {
		switch (accidents) {
		case 0:
			System.out.println("No surcharge");
			return 0;
		case 1:
			return 50;
		case 2:
			return 125;
		case 3:
			return 225;
		case 4:
			return 375;
		case 5:
			return 575;
		default:
			System.out.println("No insurance");
			return 0;
		}
	}
}
