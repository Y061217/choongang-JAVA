package coll;

import java.util.Stack;

/*
 * LIFO last in first out
 * FIFO	first in first out
 */

class Coin{
	private int value;
	public Coin(int value) {
		this.value = value;
		
	}
	
	public int getValue() {
		return value;
	}
}
public class Stack02 {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100)); //스택 메모리에 저장
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(coin.getValue());
		}
		
		
		
	}

}
