public class Cycle {
	public static void main(String [] args) {
		for(int i = 0; i <=20; i++ ) {
			System.out.println(i);
		}
		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i = i - 2;
		}
		System.out.println();
		int p = 9;
		do{
			p = p + 2;
			System.out.println (p + " ");
		} while (p < 18);
	}
}