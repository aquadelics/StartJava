import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {

		String answerYes = "Yes";
		String answerNo = "No";
		boolean repeat = false;
		Scanner scanr = new Scanner(System.in);
		do {
			calculate();
			boolean stop = false;
			do {
				System.out.println("Хотите продолжить? [Yes/No]: ");
				String repeatAnswer = scanr.nextLine();
				if(repeatAnswer.equals(answerYes)) {
					repeat = true;
					stop = true;
				} else if(repeatAnswer.equals(answerNo)) {
					repeat = false;
					stop = true;
				}
			}
			while(!stop);
		}
		while(repeat);
	}

	public static void calculate() {
		Calculator calc = new Calculator();
		Scanner scanr = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char operation;
		System.out.print("Введите первое число: ");
		a = scanr.nextInt();
		System.out.print("Введите знак математической операции: ");
		operation = scanr.next().charAt(0);
		System.out.print("Введите второе число: ");
		b = scanr.nextInt();
		double result = calc.calculate(a, b, operation);
		System.out.println("Результат: " + result);
	}
}