import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		CalculatorTest.calculate();

		System.out.println("Хотите продолжить? [Yes/No]: ");
		Scanner scanRepeatAnswer = new Scanner(System.in);
		String repeatAnswer = scanRepeatAnswer.nextLine();
		System.out.println(repeatAnswer);

		if (repeatAnswer == "Yes") {
			CalculatorTest.calculate();
			return;
		} else if (repeatAnswer == "No") {
			return;
		} else {
			System.out.println("Хотите продолжить? [Yes/No]: ");
			Scanner scanRepeatAnswer2 = new Scanner(System.in);
			repeatAnswer = scanRepeatAnswer2.nextLine();
			System.out.println(repeatAnswer);
		}
	}

	public static void calculate() {
		Calculator calc = new Calculator();
		int a = 0;
		int b = 0;
		char operation;
		System.out.print("Введите первое число: ");
		Scanner scanA = new Scanner(System.in);
		a = scanA.nextInt();
		System.out.print("Введите знак математической операции: ");
		Scanner scanOperation = new Scanner(System.in);
		operation = scanOperation.next().charAt(0);
		System.out.print("Введите второе число: ");
		Scanner scanB = new Scanner(System.in);
		b = scanB.nextInt();
		double result = calc.calculateResult(a, b, operation);
		if(result == Double.MAX_VALUE) {
			System.out.println("Неверный оператор");
		} else {
			System.out.println("Результат: " + result);
		}
	}
}