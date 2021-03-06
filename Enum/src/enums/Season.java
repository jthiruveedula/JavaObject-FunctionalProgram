package enums;

public enum Season {
	WINTER(3), SPRING(2), FALL(4), SUMMER(1);

	private int value;

	public int getValue() {
		return value;
	}

	private Season(int value) {
		this.value = value;
	}
}