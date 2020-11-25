package test011;

public class Test011 {

	void method2() {
		final int number = 10;
		A a = new A() {
			public void method1(boolean b1) {
				if (b1) {
					System.out.println(number);
				}
			}
		};
		a.method1(true);
	}
}

interface A {
	void method1(boolean b1);
}
