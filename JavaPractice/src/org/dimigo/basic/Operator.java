package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int tr_a = 9;
		int tr_b = 10;
		double tr_h = 5.8;
		double tr = (tr_a + tr_b) * tr_h / 2;
		
		int pa_a = 9;
		double pa_h = 5.4;   
		double pa = pa_a * pa_h;
		
		double area = tr >= pa ? tr - pa : pa - tr;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + tr);
		System.out.println("평행사변형 넓이 : " + pa + "\n");
		if(tr > pa) {
			System.out.println("사다리꼴이 평행사변형 보다 " + area + " 더 큽니다.");
		}
		else if(tr == pa) {
			System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
		}
		else {
			System.out.println("평행사변형이 사다리꼴 보다" + area + " 더 큽니다.");
		}
	}

}
