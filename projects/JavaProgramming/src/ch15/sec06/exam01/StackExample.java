package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<>();
		
		//동전을 계속해서 집어넣는다.
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		stack.push(new Coin(10));
		
		//더이상 동전이 남아있지않을 때까지 동전을 스택에서 빼낸다.
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println("꺼내온 동전은 " + coin.getValue() + "원");
		}
	}

}
