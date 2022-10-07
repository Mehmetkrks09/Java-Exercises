package Day2_Exercises;

public class methods2 {

public static void main(String[] args) {
		
	String mesaj="Bugun hava çok güzel";
	String yeniMesaj=mesaj.substring(0,6);
	System.out.println(yeniMesaj);
	
	int sayi=topla(74, 8);
	System.out.println(sayi);
	int toplam = topla(2,3,4);
	System.out.println(toplam);
		
	}

public static void ekle() {
	System.out.println("Eklendi");
}
public static void sil() {
	System.out.println("Silindi");
}

public static void güncelle() {
	System.out.println("Güncellendi");
}
 public static int topla(int sayi ,int sayi1) {
	
	 return sayi+sayi1;	
}
 
 public static int topla(int... sayilar) {
		
	 int toplam=0;
	 for (int sayi:sayilar) {
		
		 toplam+=sayi;
	}
	 return toplam;
}
 
 public static String sehirVer(String sehir) {
	 
	 return "Aydın";
 }
}
