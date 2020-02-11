public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 21;
		if(age > 20) {
			System.out.println("Возраст равен " + age);
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("Это мужской пол");
		}
		if(!isMale) {
			System.out.println("Это женский пол");
		}

		int height = 170;
		if(height < 180) {
			System.out.println("Рост меньше 180");
		} else if(height > 180) {
			System.out.println("Рост больше 180");
		}

		String name = "Pasha";
		char m = name.charAt(0);
		char i = name.charAt(0);
		if(m == 'M') {
			System.out.println("Имя начинается с буквы " + m);
		} else if(i == 'I') {
			System.out.println("Имя начинается с буквы " + i);
		} else{
			System.out.println("Имя начинается с другой буквы");
		}
	}
}