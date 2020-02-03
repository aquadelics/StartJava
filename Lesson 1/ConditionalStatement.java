public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		int height = 170;
		String name = "Misha";
		boolean isMale = true;

		if(age > 20) {
			System.out.println("Возраст равен " + age);
		}
		if(isMale) {
			System.out.println ("Это мужской пол");
		}
		if(!isMale) {
			System.out.println ("Это женский пол");
		}
		if(height < 180) {
			System.out.println ("Рост меньше 180");
		} else if (height > 180) {
			System.out.println ("Рост больше 180");
		}
		char symbol = name.charAt(0);
		if(symbol == 'M') {
			System.out.println ("Имя начинается с буквы " + symbol);
		} else if (symbol == 'I') {
			System.out.println ("Имя начинается с буквы " + symbol);
		} else {
			System.out.println("Имя начинается с другой буквы");
		}
	}
}