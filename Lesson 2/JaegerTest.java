public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerModelOne = new Jaeger();
		jaegerModelOne.setModelName("Chrome Brutus");
		jaegerModelOne.setMark("Mk3");
		jaegerModelOne.setStatus("Active");
		jaegerModelOne.setIsTurnedOn(true);
		jaegerModelOne.setCountOfLifes(2);
		Jaeger jaegerModelTwo = new Jaeger();
		jaegerModelTwo.setModelName("Gipsy Avenger");
		jaegerModelTwo.setMark("Mk6");
		jaegerModelTwo.setStatus("Active");
		jaegerModelTwo.setIsTurnedOn(true);
		jaegerModelTwo.setCountOfLifes(3);


		System.out.println("Выходит первый игрок");
		System.out.println("Имя первого игрока: " + jaegerModelOne.getModelName() + ". Статус робота " + jaegerModelOne.getStatus() + ". Состояние робота " + jaegerModelOne.getIsTurnedOn());
		System.out.println("Выходит второй игрок");
		System.out.println("Имя второго игрока: " + jaegerModelTwo.getModelName() + ". Статус робота " + jaegerModelTwo.getStatus() + ". Состояние робота " + jaegerModelTwo.getIsTurnedOn());

		System.out.println("Начинается бой! Раунд 1");

		int countOfLifesFirstPlayer = jaegerModelOne.getCountOfLifes();
		int countOfLifesSecondPlayer = jaegerModelTwo.getCountOfLifes();

		jaegerModelOne.fight();
		jaegerModelTwo.setCountOfLifes(countOfLifesSecondPlayer - 1);
		System.out.println("Теперь у " + jaegerModelTwo.getModelName() + " осталось " + jaegerModelTwo.getCountOfLifes() + " жизней");

		jaegerModelTwo.fight();
		jaegerModelOne.setCountOfLifes(countOfLifesFirstPlayer - 1);
		System.out.println("Теперь у " + jaegerModelOne.getModelName() + " осталось " + jaegerModelOne.getCountOfLifes() + " жизней");

		countOfLifesFirstPlayer = jaegerModelOne.getCountOfLifes();
		countOfLifesSecondPlayer = jaegerModelTwo.getCountOfLifes();

		System.out.println("Начинается бой! Раунд 2");

		jaegerModelOne.fight();
		jaegerModelTwo.setCountOfLifes(countOfLifesSecondPlayer - 1);
		System.out.println("Теперь у " + jaegerModelTwo.getModelName() + " осталось " + jaegerModelTwo.getCountOfLifes() + " жизней");
		jaegerModelTwo.recover();
		jaegerModelTwo.setCountOfLifes(countOfLifesSecondPlayer + 1);
		System.out.println(jaegerModelTwo.getModelName() + " восстановил 1 жизнь. Теперь их " + jaegerModelTwo.getCountOfLifes());

		countOfLifesFirstPlayer = jaegerModelOne.getCountOfLifes();
		countOfLifesSecondPlayer = jaegerModelTwo.getCountOfLifes();

		System.out.println("Начинается бой! Раунд 3");

		jaegerModelOne.fight();
		jaegerModelTwo.setCountOfLifes(countOfLifesSecondPlayer - 1);
		System.out.println("Теперь у " + jaegerModelTwo.getModelName() + " осталось " + jaegerModelTwo.getCountOfLifes() + " жизней");

		jaegerModelTwo.fight();
		jaegerModelOne.setCountOfLifes(countOfLifesFirstPlayer - 1);
		System.out.println("Теперь у " + jaegerModelOne.getModelName() + " осталось " + jaegerModelOne.getCountOfLifes() + " жизней");
		jaegerModelOne.setIsTurnedOn(false);
		jaegerModelOne.setStatus("Destroyed");
		System.out.println("Бой окончен! Победил " + jaegerModelTwo.getModelName());

		System.out.println("Имя проигравшего игрока: " + jaegerModelOne.getModelName() + ". Статус робота " + jaegerModelOne.getStatus() + ". Состояние робота " + jaegerModelOne.getIsTurnedOn());
		System.out.println("Имя выигравшего игрока: " + jaegerModelTwo.getModelName() + ". Статус робота " + jaegerModelTwo.getStatus() + ". Состояние робота " + jaegerModelTwo.getIsTurnedOn());
	}
}