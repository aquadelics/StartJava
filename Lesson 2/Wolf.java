public class Wolf {
	private boolean isMale = true;
	private String name = "Wolchara";
	private int age = 15;
	private String colour = "Grey";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == "") {
			System.out.println("Некорректная кличка");
		} else {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}
	public boolean walk() {
		System.out.println("Волк идёт");
		return true;
	}

	public void sit() {
		System.out.println("Волк сидит");
	}

	public String howl() {
		return "Воет";
	}

	public void hunt() {
		System.out.println("Волк охотится");
	}
}