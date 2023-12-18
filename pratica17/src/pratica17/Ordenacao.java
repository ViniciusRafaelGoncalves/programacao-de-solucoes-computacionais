package pratica17;



class Ordenacao {
	public static void bubbleSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[minIndex]) {
					minIndex = j;
				}
			}
			int temp = vetor[minIndex];
			vetor[minIndex] = vetor[i];
			vetor[i] = temp;
		}
	}

	public static void insertionSort(int[] vetor) {
		int n = vetor.length;
		for (int i = 1; i < n; ++i) {
			int key = vetor[i];
			int j = i - 1;

			while (j >= 0 && vetor[j] > key) {
				vetor[j + 1] = vetor[j];
				j = j - 1;
			}
			vetor[j + 1] = key;
		}
	}
}
