package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int[] newNumArr = new int[12];
	public static final int errorRetVal = -1;
	private final int[] numbers = newNumArr;

	public int total = -1;

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return errorRetVal;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
