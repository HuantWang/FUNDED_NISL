package test010;

public class Test010 {

	void method(boolean b1, boolean b2, boolean b3) {
		System.out.println("start");

		LABEL1: while (b1) {

			if (b1) {
				continue LABEL1;
			}

			LABEL2: while (b2) {

				if (b1 && b2) {
					continue;
				}

				LABEL3: while (b3) {
					if (b1 && b2 && b3) {
						continue LABEL1;
					}
				}

				if (b1 && b2) {
					continue;
				}
			}

			if (b1) {
				continue LABEL1;
			}
		}

		System.out.println("end");
	}
}
