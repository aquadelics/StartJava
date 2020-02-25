public class Jaeger {
	private String modelName;
	private String mark;
	private String status;
	private boolean isTurnedOn;
	private int countOfLifes;


	public String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}

	public String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	public boolean getIsTurnedOn() {
		return isTurnedOn;
	}

	void setIsTurnedOn(boolean isTurnedOn) {
		this.isTurnedOn = isTurnedOn;
	}

	public int getCountOfLifes() {
		return countOfLifes;
	}

	void setCountOfLifes(int countOfLifes) {
		this.countOfLifes = countOfLifes;
	}

	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void recover() {
		System.out.println("Робот восстановил жизнь");
	}

	void fight() {
		System.out.println("Робот наносит удар");
	}
}