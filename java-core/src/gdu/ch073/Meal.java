package gdu.ch073;

import java.util.Calendar;

public abstract class Meal { // 부모 타입(추상클래스)
	public static Meal getInstance() { // static: 언제든지 호출 가능 // 리턴 타입 Meal
		Meal meal = null;
		
		Calendar c = Calendar.getInstance(); 
		int h = c.get(Calendar.HOUR_OF_DAY); // 0 <= h <24
		if(h < 12) { // 아침
			meal = new Breakfast(); // 다형성
		} else if(h < 18) { // 점심
			meal = new Lunch();
		} else if(h < 24) { // 저녁
			meal = new Dinner();
		}
		return meal; // 다형성
		
	}
}
