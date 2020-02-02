public class ConditionalStatement {
	public static void main (String[] args) {
		int age = 21;
		String sex = "male";
		int height = 170;
		String name = "Misha";
		boolean IsMaleSex = sex == "male";

		if (age > 20) {
			System.out.println("Возраст равен " + age);
		}
		if (IsMaleSex == true) {
			System.out.println ("Это мужской пол");
		}
		if (IsMaleSex == false) {
			System.out.println ("Это женский пол");
		}
		if (height < 180) {
			System.out.println ("Рост меньше 180");
		}
		else if (height > 180) {
			System.out.println ("Рост больше 180");
		}
		char symbol = name.charAt(0);
		if (symbol == 'M') {
			System.out.println ("Имя начинается с буквы " + symbol);
		}
		else if (symbol == 'I') {
			System.out.println ("Имя начинается с буквы " + symbol);
		}
		else {
			System.out.println("Имя начинается с другой буквы");
		}
	}
}