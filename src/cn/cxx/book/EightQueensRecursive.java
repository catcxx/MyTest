package cn.cxx.book;

public class EightQueensRecursive {
	private static final boolean AVAILABLE = true;
	private int squares = 8, norm = squares - 1;
	private int positionInRow[] = new int[squares];
	private boolean[] column = new boolean[squares];
	private boolean[] leftDiagonal = new boolean[2 * squares - 1];
	private boolean[] rightDiagonal = new boolean[2 * squares - 1];
	private static int howMany = 0;

	public EightQueensRecursive() {
		// To complete the initialization work for the
		// column,leftDiagonal,rigthDiagonal.
		for (int i = 0; i < squares; i++) {
			column[i] = AVAILABLE;
			positionInRow[i] = -1;
		}
		for (int i = 0; i < 2 * squares - 1; i++) {
			leftDiagonal[i] = AVAILABLE;
			rightDiagonal[i] = AVAILABLE;
		}
	}

	public void printResults(int[] columns) {
		int row, col;
		System.out.println("�˻ʺ�����ĵ� " + howMany + " �ֽⷨ");
		System.out.print("�˻ʺ�����Ľ��Ϊ��");
		for (int e : columns) {
			System.out.print(e);
		}
		System.out.println("\n�����ͼʾ����ͼ��ʾ��");
		for (row = 0; row < squares; row++) {
			for (col = 0; col < squares; col++) {
				if (col == positionInRow[row]) {
					System.out.print("@");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public void putQueen(int row) {
		// ���ǰ���Ѿ��õ���һ�����н�
		for (int i = 0; i < squares; i++) {
			if (row > squares - 1)
				break;
			if (column[i] == AVAILABLE && leftDiagonal[row + i] == AVAILABLE
					&& rightDiagonal[row - i + norm] == AVAILABLE) {
				positionInRow[row] = i;
				column[i] = !AVAILABLE;
				leftDiagonal[row + i] = !AVAILABLE;
				rightDiagonal[row - i + norm] = !AVAILABLE;
				if (row < squares - 1) {
					putQueen(row + 1);
				} else {
					howMany += 1;
					printResults(positionInRow);
				}
				column[i] = AVAILABLE;
				leftDiagonal[row + i] = AVAILABLE;
				rightDiagonal[row - i + norm] = AVAILABLE;
			}
		}
	}

	public static void main(String args[]) {
		EightQueensRecursive eightQueens = new EightQueensRecursive();
		eightQueens.putQueen(0);
		System.out.println("�ʺ�����һ���ҵ��� " + howMany + "��⡣");
	}
}
