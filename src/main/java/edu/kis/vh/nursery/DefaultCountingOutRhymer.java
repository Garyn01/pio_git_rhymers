package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int[] newNumArr = new int[12];
	private static final int errorRetVal = -1;
	private final int[] numbers = newNumArr;

	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == errorRetVal;
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
			return errorRetVal;
		return numbers[total--];
	}

}
