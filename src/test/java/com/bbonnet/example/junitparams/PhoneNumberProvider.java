package com.bbonnet.example.junitparams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhoneNumberProvider {
	public static Object[] provideLocalNumbers() {
		List<String> localNumbers = new ArrayList<String>();

		// TODO 3.2 fill list with local numbers e.g. "0120304050"




		return localNumbers.toArray();
	}

	private static String generateLocalPhoneNumber() {
		String result = "";
		Random r = new Random();
		for (int i = 1; i <= 9; i++) {
			result += r.nextInt(10);
		}
		return "0" + result;
	}
}
