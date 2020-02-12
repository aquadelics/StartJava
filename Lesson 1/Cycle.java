public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++ ) {
			System.out.println(i);
		}

		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}
		System.out.println();

		int p = 10;
		int sum = 0;
		do {
			if(p % 2 != 0) {
				sum = sum + p;
			}
			p++;
		} while(p <= 20);
		System.out.println(sum);
	}
}