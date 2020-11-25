package test012;

public class Test012 {

	int method(final int[] a, final int[] b) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c += a[i] * b[j];
			}
		}
		return c;
	}
}
