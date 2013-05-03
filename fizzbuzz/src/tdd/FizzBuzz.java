package tdd;

public class FizzBuzz {

	public String main() {
		StringBuilder bf = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			if (isMultipleOfThreeAndfive(i)) {
				bf.append("Fizz,Buzz");
			} else if (isMultipleOfThree(i)) {
				bf.append("Fizz");
			} else if (isMultipleOfFive(i)) {
				bf.append("Buzz");
			} else {
				bf.append(i);
			}
			bf.append(System.getProperty("line.separator"));
		}

		System.out.println(bf.toString());
		return bf.toString();
	}

	private boolean isMultipleOfThreeAndfive(int value) {
		if (value % 3 == 0 && value % 5 == 0) {
			return true;
		}
		return false;
	}

	private boolean isMultipleOfThree(int value) {
		if (value % 3 == 0) {
			return true;
		}
		return false;
	}

	private boolean isMultipleOfFive(int value) {
		if (value % 5 == 0) {
			return true;
		}
		return false;
	}
}
