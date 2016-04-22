package cn.cxx.book;

public class EightQueensNoRec {
	private static final boolean AVAILABLE = true;
	private int squares = 8, norm = squares - 1;
	private int positionInRow[] = new int[squares];
	private int p = -1;
	private boolean[] rows = new boolean[squares];
	private boolean[] column = new boolean[squares];
	private boolean[] leftDiagonal = new boolean[2 * squares - 1];
	private boolean[] rightDiagonal = new boolean[2 * squares - 1];
	private static int howMany = 0;

	public EightQueensNoRec() {
		// To complete the initialization work for the
		// column,leftDiagonal,rigthDiagonal.
		for (int i = 0; i < squares; i++) {
			rows[i] = AVAILABLE;
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

	public void putQueen() {
		int row = 0, col;
		while (true) {
			for (col = p + 1; col < squares; col++) {
				if (rows[row] == AVAILABLE && column[col] == AVAILABLE
						&& leftDiagonal[row + col] == AVAILABLE
						&& rightDiagonal[row - col + norm] == AVAILABLE) {
					break;
				}
			}
			// �ڵ�ǰ���������ҵ��˿��Է��ûʺ��λ��
			if (col < squares) {
				rows[row] = !AVAILABLE;
				column[col] = !AVAILABLE;
				leftDiagonal[row + col] = !AVAILABLE;
				rightDiagonal[row - col + norm] = !AVAILABLE;
				positionInRow[row] = col;
				p = col;
			} else// �����ǰ��û�췴���ûʺ��ˣ���ô����
			{
				if (row > 0)// ��ǰһ��
				{
					row--;
					p = positionInRow[row];
					rows[row] = AVAILABLE;
					column[p] = AVAILABLE;
					leftDiagonal[row + p] = AVAILABLE;
					rightDiagonal[row - p + norm] = AVAILABLE;
					positionInRow[row] = -1;
					continue;
				} else {
					break;
				}
			}
			if (row == squares - 1) {
				howMany += 1;
				printResults(positionInRow);
				p = positionInRow[row];
				rows[row] = AVAILABLE;
				column[p] = AVAILABLE;
				leftDiagonal[row + p] = AVAILABLE;
				rightDiagonal[row - p + norm] = AVAILABLE;
				positionInRow[row] = -1;
				continue;
			} else {
				row++;
				p = -1;
				continue;
			}
		}
	}

	public static void main(String args[]) {
		EightQueensNoRec eightQueens = new EightQueensNoRec();
		eightQueens.putQueen();
		System.out.println("�ʺ�����һ����" + howMany + "�ֽⷨ");
	}

}
