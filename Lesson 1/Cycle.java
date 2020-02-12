public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++ ) {
			System.out.println(i);
		}

		int i = 6;
		while (i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}

		System.out.println();

		int i = 2;
		int result = 1;
		do {
			result = result + i;
			i++;
		} while(result > 9 && result < 21);
		System.out.print (result);
		}
	}