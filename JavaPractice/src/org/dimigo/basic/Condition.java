package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		String car = "고속버스";
		int distance = 10;
		int charge;
		int add;
		int caradd;
		
		switch(car) {
		case "고속버스":
			charge = 850;
			caradd = 300;
			break;
		case "경차":
			charge = 300;
			caradd = 200;
			break;
		default:
			charge = 600;
			caradd = 200;
		}
		if(distance % 10 > 0) {
			add = (distance / 10) * caradd;
		}
		else {
			add = ((distance / 10) - 1) * caradd;
		}
		charge += add;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + charge + "원");

	}

}
