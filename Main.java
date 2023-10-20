package patikaOrnekler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mat, fizik, kimya, turkce, muzik, tarih;
		Scanner inp = new Scanner(System.in);
		System.out.print("Matematik notu: ");
		mat = inp.nextInt();
		System.out.print("fizik notu: ");
		fizik = inp.nextInt();
		System.out.print("türkçe notu: ");
		turkce = inp.nextInt();
		System.out.print("kimya notu: ");
		kimya = inp.nextInt();
		System.out.print("tarih notu: ");
		tarih = inp.nextInt();
		System.out.print("müzik notu: ");
		muzik = inp.nextInt();
		int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
		double sonuc=toplam / 6;
		System.out.println("Not ortalamasý: "+sonuc);
		boolean kosul1= sonuc>=60;
		String str = kosul1 ? "geçtiniz" : "kaldýnýz";
		System.out.println(str);
		
		
	}
}
