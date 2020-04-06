package NumberPackage;

import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		//Инстанцираме класовете, които ще проверяват числата.
		Chain negativeNumber = new NegativeNumber();
		Chain positiveNumber = new PositiveNumber();
		Chain zeroNumber = new ZeroNumber();
		
		//Задаваме кои да са следващите проверки по веригата.  
		positiveNumber.SetNext(negativeNumber);
		negativeNumber.SetNext(zeroNumber);
		
		//Създаваме обекти от тип Number
		Number firstNumber = new Number();
		firstNumber.setNumber(20);
		
		Number secondNumber = new Number();
		secondNumber.setNumber(-68);
		
		Number thirdNumber = new Number();
		thirdNumber.setNumber(0);
		
		
		positiveNumber.ClientNumber(firstNumber);
		positiveNumber.ClientNumber(secondNumber);
		positiveNumber.ClientNumber(thirdNumber);
		
		//Вход от конзолата
		System.out.println("Let's check your number:");
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();
		userInput.close();
		Number userNumber = new Number();
		userNumber.setNumber(a);
		positiveNumber.ClientNumber(userNumber);
		
	}

}
