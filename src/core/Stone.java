package core;

public class Stone extends Tile {

	private final int value;

	public Stone(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.getValue() + "";

	}

}
