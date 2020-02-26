public class GuessNumber {
	int compNumber = 51;
	int playerNumber = 72;
	int minNumber = 1;
	int maxNumber = 100;

	void startGame(Player pl1, Player pl2) {
		Scanner scanner = new Scanner(System.in);

		pl1.number = scanner.nextInt();

		System.out.println("Игрок загадал " + playerNumber);
		while(playerNumber >= minNumber && playerNumber <= maxNumber) {
		if(playerNumber > compNumber) {
			System.out.println("Число игрока больше загаданного компьютером");
			maxNumber = playerNumber;
			int step = ((maxNumber - minNumber) / 2);
			playerNumber -= step;
			System.out.println("Теперь игрок загадал " + playerNumber);
		} else if(playerNumber < compNumber) {
			System.out.println("Число меньше загаданного компьютером");
			minNumber = playerNumber;
			int step = ((maxNumber - minNumber) / 2);
			playerNumber += step;
			System.out.println("Теперь игрок загадал " + playerNumber);
		}
		System.out.println("Вы угадали!");
		return;
		}
	}
}