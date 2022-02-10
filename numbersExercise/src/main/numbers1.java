package main;

public class numbers1 {
	public static int combine(int number) {
		if (number < 10) {
			return number;
		} else {
			int output = 0;
			for (int i = number; i >= 10; i -= 10) {
				output++;
				number -= 10;
			}
			for (int i = number; i > 0; i -= 1) {
				output++;
				number -= 1;

			}
			return output;
		}
	}

public static void main(String[] args) {
	System.out.println(combine(49));
}
}