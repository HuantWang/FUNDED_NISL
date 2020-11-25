package test001;

public class Test001 {

	int good1() {
		int a = 10;
		if (a > 1){
			a=2;
		}else{
			a=0;
		}
		return a;
	}

	int bad2() {
		int b = 10;
		if (b > 1){
			b=2;
		}else{
			b=0;
		}
		return b;
	}
}
