package pratica18;

import java.util.Arrays;

public class Ordenacao {

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

	public static void quickSort(int[] vetor, int baixo, int alto) {
		if (baixo < alto) {
			int indiceParticao = particionar(vetor, baixo, alto);
			quickSort(vetor, baixo, indiceParticao - 1);
			quickSort(vetor, indiceParticao + 1, alto);
		}
	}

	private static int particionar(int[] vetor, int baixo, int alto) {
		int pivo = vetor[alto];
		int i = (baixo - 1);

		for (int j = baixo; j < alto; j++) {
			if (vetor[j] <= pivo) {
				i++;
				trocarElementos(vetor, i, j);
			}
		}

		trocarElementos(vetor, i + 1, alto);
		return i + 1;
	}

	private static void trocarElementos(int[] vetor, int i, int j) {
		int temp = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = temp;
	}

	public static void mergeSort(int[] vetor, int baixo, int alto) {
		if (baixo < alto) {
			int meio = (baixo + alto) / 2;
			mergeSort(vetor, baixo, meio);
			mergeSort(vetor, meio + 1, alto);
			merge(vetor, baixo, meio, alto);
		}
	}

	private static void merge(int[] vetor, int baixo, int meio, int alto) {
		int n1 = meio - baixo + 1;
		int n2 = alto - meio;

		int[] metadeEsquerda = new int[n1];
		int[] metadeDireita = new int[n2];

		for (int i = 0; i < n1; ++i) {
			metadeEsquerda[i] = vetor[baixo + i];
		}
		for (int j = 0; j < n2; ++j) {
			metadeDireita[j] = vetor[meio + 1 + j];
		}

		int i = 0, j = 0;
		int k = baixo;
		while (i < n1 && j < n2) {
			if (metadeEsquerda[i] <= metadeDireita[j]) {
				vetor[k] = metadeEsquerda[i];
				i++;
			} else {
				vetor[k] = metadeDireita[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			vetor[k] = metadeEsquerda[i];
			i++;
			k++;
		}

		while (j < n2) {
			vetor[k] = metadeDireita[j];
			j++;
			k++;
		}
	}
}
