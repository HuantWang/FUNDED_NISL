package test004;

public class Test004 {

	int getInt(String text) {

		int value;

		switch (text) {
		case "ONE":
			value = 1;
			break;
		case "TWO":
			value = 2;
			break;
		case "THREE":
			value = 3;
			break;
		default:
			value = 0;
		}

		return value;
	}
}
