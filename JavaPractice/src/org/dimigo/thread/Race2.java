/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 * 		|_ Race
 *  
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author H.J.Park
 * @version 1.0.0
 * 
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread r1 = new Thread(new Runner2("홍길동"));
		Thread r2 = new Thread(new Runner2("홍길순"));
		
		r1.start();
		r2.start();

	}

}
