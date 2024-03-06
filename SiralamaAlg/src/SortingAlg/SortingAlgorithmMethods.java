package SortingAlg;

public class SortingAlgorithmMethods {
	public void bubbleSort(int[] dizi) {
	    int n = dizi.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (dizi[j] > dizi[j + 1]) {
	                // elemanları takas et
	                int gecici = dizi[j];
	                dizi[j] = dizi[j + 1];
	                dizi[j + 1] = gecici;
	            }
	        }
	    }}
	public void selectionSort(int[] dizi) {
	    int n = dizi.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIndeks = i;
	        for (int j = i + 1; j < n; j++) {
	            if (dizi[j] < dizi[minIndeks]) {
	                minIndeks = j;
	            }
	        }

	        int gecici = dizi[minIndeks];
	        dizi[minIndeks] = dizi[i];
	        dizi[i] = gecici;
	    }
	}
	public void insertionSort(int[] dizi) {
	    int n = dizi.length;
	    for (int i = 1; i < n; i++) {
	        int anahtar = dizi[i];
	        int j = i - 1;

	        while (j >= 0 && dizi[j] > anahtar) {
	            dizi[j + 1] = dizi[j];
	            j = j - 1;
	        }
	        dizi[j + 1] = anahtar;
	    }
	}
	public void merge(int dizi[], int sol, int orta, int sag) {
	    int n1 = orta - sol + 1;
	    int n2 = sag - orta;

	    int solDizi[] = new int[n1];
	    int sagDizi[] = new int[n2];

	    for (int i = 0; i < n1; i++)
	        solDizi[i] = dizi[sol + i];
	    for (int j = 0; j < n2; j++)
	        sagDizi[j] = dizi[orta + 1 + j];

	    int i = 0, j = 0;

	    int k = sol;
	    while (i < n1 && j < n2) {
	        if (solDizi[i] <= sagDizi[j]) {
	            dizi[k] = solDizi[i];
	            i++;
	        } else {
	            dizi[k] = sagDizi[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < n1) {
	        dizi[k] = solDizi[i];
	        i++;
	        k++;
	    }

	    while (j < n2) {
	        dizi[k] = sagDizi[j];
	        j++;
	        k++;
	    }
	}

	public void mergeSort(int dizi[], int sol, int sag) {
	    if (sol < sag) {
	        int orta = (sol + sag) / 2;

	        mergeSort(dizi, sol, orta);
	        mergeSort(dizi, orta + 1, sag);

	        merge(dizi, sol, orta, sag);
	    }
	}
}
