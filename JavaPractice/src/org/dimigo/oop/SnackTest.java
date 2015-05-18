/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ SnackTest
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author H.J.Park
 * @version 1.0.0
 * 
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] snack = new Snack[] {new Snack("새우깡", "농심", 1100, 2),
							new Snack("콘칲", "크라운", 1200, 1),
							new Snack("허니버터칩", "해태", 1500, 4)};
		
		snack[0].printSnack();
		snack[1].printSnack();
		snack[2].printSnack();
		
		System.out.println("총 구매 금액 : " + String.format("%,d", 
				snack[0].calcPrice() + snack[1].calcPrice() + snack[2].calcPrice()) + "원");
		}

	}
