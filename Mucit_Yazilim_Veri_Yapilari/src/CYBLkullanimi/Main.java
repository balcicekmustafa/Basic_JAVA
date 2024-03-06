package CYBLkullanimi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		ListeYapisi bl=new ListeYapisi();
		int secim=-1,sayi,indis;
		while(secim!=0) {
			System.out.println("1. Başa Ekle");
			System.out.println("2. Sona Ekle");
			System.out.println("3. Araya Ekle");
			System.out.println("4. Baştan Sil");
			System.out.println("5. Sondan Sil");
			System.out.println("6. Aradan Sil");
			System.out.println("7. Sondan Başa Yazdır.");
			
			System.out.println("0. Exit");
			System.out.println("Seçimini: ");
			secim=k.nextInt();
			if(secim==1) {
				System.out.println("Sayi: ");
				sayi=k.nextInt();
				bl.basaEkle(sayi);
			}
			else if(secim==2) {
				System.out.println("sayi: ");
				sayi=k.nextInt();
				bl.sonaEkle(sayi);
			}
			else if(secim==3) {
				System.out.println("Indis: ");
				indis=k.nextInt();
				System.out.println("sayi: ");
				sayi=k.nextInt();
				bl.arayaEkle(indis, sayi);
			}
			else if (secim==4) {bl.bastanSil();
			}
			else if(secim==5) {
				bl.sondanSil();
			}
			else if (secim==6) {
				System.out.println("indis: ");
				indis=k.nextInt();
				bl.aradanSil(indis);
			}
			else if(secim==7) {
				bl.sondanYazdir();
			}
			bl.yazdir();
		}
	}

}
