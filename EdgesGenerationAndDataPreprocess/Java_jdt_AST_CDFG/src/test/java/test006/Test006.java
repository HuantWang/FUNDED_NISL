package test006;

public class Test006 {

	void method() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (0 == i % 5) {
				break;
			} else if (0 == i % 7) {
				continue;
			}
		}
	}
}
