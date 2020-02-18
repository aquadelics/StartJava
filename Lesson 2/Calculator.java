public class Calculator {
		private double result = 0;
		
		double calculateResult (int a, int b, String operation) {
			switch (operation) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				case "^":
					result = 1;
					int j = 1;
					while(j <= b) {
						result = result * a;
						j++;
					}
					break;
				case "%":
					result = a % b;
					break;
				default:
					result = Double.MAX_VALUE;
					break;
			}
		return result;
		}
}