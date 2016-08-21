
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Data2Array {
	public static void main(String[] args) {
		Data2Array test = new Data2Array();
		test.parse();
	}

	private void parse() {
		String line;
		boolean flag1 = false;
		boolean flag2 = false;
		int i = 0;
		String line1 = null;
		String line2 = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Test\\latlng.txt"));
			while (null != (line = br.readLine())) {

				i++;

				if (Double.valueOf(line) == 34.245737) {
					flag1 = true;
					line1 = line;

				} else if (Double.valueOf(line) == 108.944263) {
					flag2 = true;
					line2 = line;
				}
				if (flag1 && flag2) {
					System.out.print("(" + line1 + "," + line2 + ")" + "点在直线上");
				}
				if (i == 2) {
					flag1 = false;
					flag2 = false;
					i = 1;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	class testroad {
		public void testrd() {
			int d = 1;
			int x0 = 0;
			int y0 = 0;

			int a[][] = new int[20][20];
			int x[] = new int[10];
			int y[] = new int[10];
			int numx[] = new int[10];
			int numy[] = new int[10];
			for (int i = 0; i < 10; i++) {
				x[i] = i;
				y[i] = x[i] + 3;

				numx[i] = (x[i] - x0) / d;
				numy[i] = (y[i] - y0) / d;
				a[numx[i]][numy[i]] = 1;

			}

		}
	}
}
