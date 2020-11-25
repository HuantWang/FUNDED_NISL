package test009;

public class Test009 {

	void method(boolean b1, boolean b2, boolean b3) {
		System.out.println("start");

		LABEL: do {

			if (b1) {
				break;
			}

			while (b1 && b2) {

				if (b2) {
					break LABEL;
				}

				for (; b1 && b2 && b3;) {
					if (b3) {
						break LABEL;
					}
				}
			}

			if (b1) {
				break;
			}

		} while (true);

		System.out.println("end");
	}
}
