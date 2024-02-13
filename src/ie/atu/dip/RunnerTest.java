package ie.atu.dip;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

/**
 * The RunnerTest class represents a test suite that includes multiple JUnit
 * test classes. It is used to organise and run a suite of tests for the InsuranceProgram
 * application.
 *
 * @author Jonathan Griffey - G00299043
 * @version 1.0
 * @since 2023-12-15
 */

@Suite
@SelectClasses({ InsuranceProgramTest.class, CalculationTest.class, MainMethodTest.class })
class RunnerTest {
}
