package AramaAlgoritmaları;

public class Uygulama {
	public int lineerArama(int[] dizi, int aranan) {
	    for (int i = 0; i < dizi.length; i++) {
	        if (dizi[i] == aranan) {
	            return i;
	        }
	    }
	    return -1;
	}
	public int binarySearch(int[] dizi, int aranan) {
	    int sol = 0;
	    int sag = dizi.length - 1;
	    while (sol <= sag) {
	        int orta = (sol + sag) / 2;
	        
	        if (dizi[orta] == aranan) {
	            return orta;
	        }
	        
	        if (dizi[orta] < aranan) {
	            sol = orta + 1;
	        } else {
	            sag = orta - 1;
	        }
	    }
	    return -1;
	}
	public int jumpSearch(int[] dizi, int aranan) {
	    int n = dizi.length;
	    int adim = (int) Math.sqrt(n);
	    int onceki = 0;
	    
	    while (dizi[Math.min(adim, n) - 1] < aranan) {
	        onceki = adim;
	        adim += (int) Math.sqrt(n);
	        if (onceki >= n) {
	            return -1;
	        }
	    }
	    
	    while (dizi[onceki] < aranan) {
	        onceki++;
	        if (onceki == Math.min(adim, n)) {
	            return -1;
	        }
	    }
	    
	    if (dizi[onceki] == aranan) {
	        return onceki;
	    }

	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
