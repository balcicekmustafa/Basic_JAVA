package Datee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {	
		Scanner scanner=new Scanner(System.in);
		System.out.println("****Doğum Günü Tebrik Programı****");
		System.out.print("Doğum gününüzü ve saatinizi giriniz.(Örn. 2001-03-30 15:00)");
		String dogumGunuInput=scanner.nextLine();
		String a="yyyy-MM-dd HH:mm";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime dogumGunu= LocalDateTime.parse(dogumGunuInput,format);
		LocalDateTime bugun = LocalDateTime.now();
		
		if(dogumGunu.getMonthValue()==bugun.getMonthValue() && dogumGunu.getDayOfMonth()== bugun.getDayOfMonth()) {
			System.out.println("Bugün doğum gününüz! İYİ Kİ DOĞDUNUZ!");
			
		}
		else {
			long gunKaldi=bugun.until(dogumGunu, ChronoUnit.DAYS);
			long saatKaldi=bugun.until(dogumGunu, ChronoUnit.HOURS);
			System.out.println("Doğum gününüze"+ gunKaldi+"gün, veya"+ saatKaldi+" saat "+"kaldı!!!");
			
		}
		
	}

}
