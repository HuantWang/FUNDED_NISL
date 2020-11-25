package test008;

public class Test008 {

	void method() {
		System.out.println("start");
		SOTO: for (int i = 0; i < 10; i++) {
			UCHI: for (int j = 0; j < 10; j++) {
				if (10 == i + j) {
					break UCHI;
				}
			}
		}
		System.out.println("end");
	}
}
