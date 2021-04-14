package gdu.ch073;

public class Breakfast extends Meal{ // 상속
	public Breakfast() {
		// getClass: 현재 참조하고 있는 클래스를 확인하는 메소드
		System.out.println(this.getClass()); 
	}
}
