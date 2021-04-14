package gdu.ch073;

public class Archer extends Unit{ 
	void attack() {
		
	}

	@Override
	void move() { // 추상 메서드
		System.out.println("걸어서 움직입니다.");
	}
}
