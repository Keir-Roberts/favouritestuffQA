package main;

public class numbersWithArrays {
	public static String[][] numNameArray = {
			{ "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" },
			{ "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" }, { "Ten", "Eleven",
					"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" } };

	public static String dubDigitNumRead(long input) {
		long digit3 = Math.floorDiv(input, 100);
		long digit2 = Math.floorDiv(input - (100 * digit3), 10);
		long digit1 = (input - (100 * digit3 + 10 * digit2));
		if (input < 0) {
			return "Out of Range";
		} else if ((input >= 0) & (input < 10)) {
			return numNameArray[0][(int) input];
		} else if ((input >= 10) & (input < 20)) {
			return numNameArray[2][(int) (input - 10)];
		} else if ((input > 10) & (input % 10 == 0)) {
			return numNameArray[1][(int) ((input / 10) - 2)];
		} else if (input < 100) {
			return (numNameArray[1][(int) (digit2 - 2)] + " " + numNameArray[0][(int) digit1]);

		} else {
			return "error";
		}
	}

	public static String tripDigitNumRead(long input) {
		long digit3 = Math.floorDiv(input, 100);
		if ((digit3 > 0) & (input % 100 == 0)) {
			return numNameArray[0][(int) digit3] + " Hundred";
		} else if (digit3 > 0) {
			return numNameArray[0][(int) digit3] + " Hundred and " + dubDigitNumRead(input - 100 * digit3);
		} else if (input < 100) {
			return dubDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static String hexDigitNumRead(long input) {
		long digit4 = Math.floorDiv(input, 1000);
		if ((digit4 > 0) & (input % 1000 == 0)) {
			return tripDigitNumRead(digit4) + " Thousand";
		} else if (digit4 > 0) {
			return tripDigitNumRead(digit4) + " Thousand, " + tripDigitNumRead(input - 1000 * digit4);
		} else if (input < 1000) {
			return tripDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static String nonDigitNumRead(long input) {
		long digit7 = Math.floorDiv(input, 1000000);
		if ((digit7 > 0) & (input % 1000000 == 0)) {
			return hexDigitNumRead(digit7) + " Million";
		} else if (digit7 > 0) {
			return hexDigitNumRead(digit7) + " Million, " + hexDigitNumRead(input - 1000000 * digit7);
		} else if (input < 1000000) {
			return hexDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static String dodecaDigitNumRead(long input) {
		long digit10 = Math.floorDiv(input, 1000000000);
		if ((digit10 > 0) & (input % 1000000000 == 0)) {
			return nonDigitNumRead(digit10) + " Billion";
		} else if (digit10 > 0) {
			return nonDigitNumRead(digit10) + " Billion, " + nonDigitNumRead(input - 1000000000 * digit10);
		} else if (input < 1000000000) {
			return nonDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static String quindecaDigitNumRead(long input) {
		long digit13 = Math.floorDiv(input, 1000000000000L);
		if ((digit13 > 0) & (input % 1000000000000L == 0)) {
			return dodecaDigitNumRead(digit13) + " Trillion";
		} else if (digit13 > 0) {
			return dodecaDigitNumRead(digit13) + " Trillion, " + dodecaDigitNumRead(input - 1000000000000L * digit13);
		} else if (input < 1000000000000L) {
			return dodecaDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static String NumRead(long input) {
		long digit16 = Math.floorDiv(input, 1000000000000000L);
		if ((digit16 > 0) & (input % 1000000000000000L == 0)) {
			return quindecaDigitNumRead(digit16) + " Quadrillion";
		} else if (digit16 > 0) {
			return quindecaDigitNumRead(digit16) + " Quadrillion, "
					+ quindecaDigitNumRead(input - 1000000000000000L * digit16);
		} else if (input < 1000000000000000L) {
			return quindecaDigitNumRead(input);
		} else {
			return "error";
		}
	}

	public static void main(String[] args) {
		System.out.println(NumRead(123490021240238671L));
	}
}