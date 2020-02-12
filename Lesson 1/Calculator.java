public class Calculator {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		String operations = "+-*/^%";
		double result = 0;
		for(int i = 0; i < operations.length(); i++) {
			if(operations.charAt(i) == '+') {
				result = a + b;
				System.out.println(a + "+" + b + "=" + result);
			} else if(operations.charAt(i) == '-') {
				result = a - b;
				System.out.println(a + "-" + b + "=" + result);
			} else if(operations.charAt(i) == '*') {
				result = a * b;
				System.out.println(a + "*" + b + "=" + result);
			} else if(operations.charAt(i) == '/') {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
			} else if(operations.charAt(i) == '^') {
				result = 1;
				int j = 1;
				while(j <= b) {
					result = result * a;
					j++;
				}
				System.out.println(a + "^" + b + "=" + result);
			} else if(operations.charAt(i) == '%') {
				result = a % b;
				System.out.println(a + "%" + b + "=" + result);
			}
		}
	}
}