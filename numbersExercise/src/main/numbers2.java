package main;

public class numbers2 {
	public static String singleDigitNumRead(int number) {
		if ((number > 0) & (number < 10)) {
			switch (number) {
			case 1:
				return "One";
			case 2:
				return "Two";
			case 3:
				return "Three";
			case 4:
				return "Four";
			case 5:
				return "Five";
			case 6:
				return "Six";
			case 7:
				return "Seven";
			case 8:
				return "Eight";
			case 9:
				return "Nine";

			}
		}
		return " ";
	}

	public static String teenRead(int teen) {
		if ((teen > 9) & (teen < 20)) {
			switch (teen) {
			case 10:
				return "Ten";
			case 11:
				return "Eleven";
			case 12:
				return "Twelve";
			case 13:
				return "Thirteen";
			case 14:
				return "Fourteen";
			case 15:
				return "Fifteen";
			case 16:
				return "Sixteen";
			case 17:
				return "Seventeen";
			case 18:
				return "Eighteen";
			case 19:
				return "Nineteen";
			}
		}
		return " ";
	}

	public static int secondDigitCount(int doublenum) {
		int digit2 = Math.floorDiv(doublenum, 10);
		return digit2;
	}

	public static String secondDigitRead(int secondDigit) {
		if ((secondDigit > 1) & (secondDigit < 10)) {
			switch (secondDigit) {
			case 1:
				return "Ten";
			case 2:
				return "Twenty";
			case 3:
				return "Thirty";
			case 4:
				return "Fourty";
			case 5:
				return "Fifty";
			case 6:
				return "Sixty";
			case 7:
				return "Seventy";
			case 8:
				return "Eighty";
			case 9:
				return "Ninety";

			}
		}
		return " ";
	}

	public static String numRead(int value) {
		if(value < 0) {
			return ("Must be a positive number!");
		}else if(value == 0) {
			return "Zero";
		} else if((value>0) & (value < 10)) {
			return singleDigitNumRead(value);
		} else if ((value <= 10) & (value > 20)) {
			return teenRead(value);
		}else if (value < 100) {
			int digit2 = secondDigitCount(value);
			String digitTwo = secondDigitRead(digit2);
			int digit1 = (value - (10 * digit2));
			String digitOne = singleDigitNumRead(digit1);
			return (digitTwo + " " + digitOne);
		} else {
			return "must be between 0 - 99";
		}
	}

	public static void main(String[] args) {
		System.out.println(numRead(0));
	}
}