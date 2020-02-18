import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
	Calculator calculatorProgram = new Calculator();
	int a = 0;
	int b = 0;
	String operation;
	System.out.print("Введите первое число: ");
	Scanner scanA = new Scanner(System.in);
	a = scanA.nextInt();
	System.out.print("Введите знак математической операции: ");
	Scanner scanOperation = new Scanner(System.in);
	operation = scanOperation.nextLine();
	System.out.print("Введите второе число: ");
	Scanner scanB = new Scanner(System.in);
	b = scanB.nextInt();
	double result = calculatorProgram.calculateResult(a, b, operation);
	if(result == Double.MAX_VALUE) {
		System.out.println("Неверный оператор");
	} else {
		System.out.println("Результат: " + result);
		}
	}
}