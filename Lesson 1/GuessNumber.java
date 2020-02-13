public class GuessNumber {
	public static void main(String[] args) {
		int compNumber = 51;
		int playerNumber = 72;
		int minNumber = 1;
		int maxNumber = 100;
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