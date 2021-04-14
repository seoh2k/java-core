package gdu.ch111;

public class ExceptionMain {
	public static void main(String[] args) throws Exception {
		Class.forName("a.b.C"); // 예외를 발생시킬 수 있어서 컴파일 안된다. // a.b.C = new a.b.C();
		
	}
	public void test(Object o) {
		
	}
}

class A {
	public void test() {
		
	}
}
