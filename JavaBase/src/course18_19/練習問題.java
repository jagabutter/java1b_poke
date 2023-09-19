package course18_19;

public class 練習問題 {

	public static void main(String[] args) {
		int[] logicArray = new int[5];
		logicArray[0] = 100;
		logicArray[1] = 50;
		logicArray[2] = 75;
		logicArray[3] = 80;
		logicArray[4] = 65;
		int save = 0;

		for (int a = 4; a >= 0; a--) {
			for (int w = 0; w < a; w++) {
				if (logicArray[w] > logicArray[w + 1]) {
					save = logicArray[w];
					logicArray[w] = logicArray[w + 1];
					logicArray[w + 1] = save;
				}
			}
		}
		for (int r = 0; r < 5; r++) {
			System.out.println(logicArray[r]);
		}
	}
}
