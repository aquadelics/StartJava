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

		String name = "Iasha";
		char firstNameLatter = name.charAt(0);
		if(firstNameLatter == 'M') {
			System.out.println("Имя начинается с буквы " + firstNameLatter);
		} else if(firstNameLatter == 'I') {
			System.out.println("Имя начинается с буквы " + firstNameLatter);
		} else {
			System.out.println("Имя начинается с другой буквы");
		}
	}
}