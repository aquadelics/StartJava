public class Calculator {
		double calculate(int a, int b, char operation) {
			switch (operation) {
				case '+':
					return a + b;
				case '-':
					return a - b;
				case '*':
					return a * b;
				case '/':
					return a / b;
				case '^':
					int result = 1;
					int j = 1;
					while(j <= b) {
						result *= a;
						j++;
					}
					return result;
				case '%':
					return a % b;
				default:
					System.out.println("Неверный оператор");
					return 0;
			}
		}
}