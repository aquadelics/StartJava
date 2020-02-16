public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("Кличка волка " + wolfOne.getName());
		System.out.println("Возраст волка " + wolfOne.getAge());
		wolfOne.setName("Volchok");
		System.out.println("Новая кличка волка " + wolfOne.getName());
		wolfOne.setAge(9);
		System.out.println("Оказывается, возраст " + wolfOne.getAge());
	}
}
