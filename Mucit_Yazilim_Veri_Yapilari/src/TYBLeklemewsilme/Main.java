package TYBLeklemewsilme;

import TYBLolustur.ListeYapisi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListYapisi liste=new ListYapisi();
		liste.basaEkle(11);
		liste.basaEkle(22);
		liste.sonaEkle(33);
		liste.sonaEkle(31);
		liste.basaEkle(69);
		
		liste.arayaEkle(3, 25);
		liste.arayaEkle(6, 80);
		/*liste.bastanSil();
		liste.bastanSil();
		liste.bastanSil();
		liste.bastanSil();
		liste.bastanSil();
		liste.bastanSil();
		liste.bastanSil();
		liste.sondanSil();*/
		liste.aradanSil(2);
		liste.Yazdir();
	}

}
