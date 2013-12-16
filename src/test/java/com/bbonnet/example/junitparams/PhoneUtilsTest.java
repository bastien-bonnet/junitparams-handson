package com.bbonnet.example.junitparams;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class PhoneUtilsTest {

	@Test
	@Parameters
	public void isValidPhoneNumberTest(final String phoneNumber, final boolean expectedResult) {
		// TODO 1.1 Implement test
	}

	@SuppressWarnings("unused")
	private Object[] parametersForIsValidPhoneNumberTest() {
		return new Object[][] {
				{"1", false},
				{"0123456789", true}
				//TODO 1.3 Add more test cases
		};
	}



	// TODO 2.1 Write a parameterized unit test test for isMobilePhoneNumber(String phoneNumber)





	// TODO 3.1 Complete the following parameterized unit test test for internationalize(String localPhoneNumber)
	// using an external class as a parameter provider (i.e. PhoneNumberProvider.)
	@Test
	public void internationalizeTest(final String localPhoneNumber) {

	}


	// TODO 4.1 Complete the following parameterized unit test test for getLocalZoneIndicator(String phoneNumber)
	// using an external CSV file as a parameter provider (src/test/resources/data.csv)
	@Test
    public void getLocalZoneIndicatorTest(String number, String expectedIndicator) {

	}

	// TODO 5.1 Complete the following parameterized unit test test for areSameNumber(String number1, String number2)
	// using litteral parameters directly in annotation
	@Test
	public void areSameNumberTest(String number1, String number2, boolean areEqual) {

	}

}
