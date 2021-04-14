package gdu.ch073;

public class UnitMain {

	public static void main(String[] args) {
		Unit u = null;
		// u = new Unit(); // 추상클래스의 객체는 만들 수 없다
		
		Knight knight = new Knight();
		knight.move();
		knight.attack();
		
		Archer archer = new Archer();
		archer.move();
		archer.attack();
		
		Unit unit = new Knight();
		unit.move();
		if(unit instanceof Knight) {
			((Knight)unit).attack(); // 형변환
		}
	}

}
