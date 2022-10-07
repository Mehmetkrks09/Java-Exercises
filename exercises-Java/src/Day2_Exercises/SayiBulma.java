package Day2_Exercises;

public class SayiBulma {

	public static void main(String[] args) {
		
		sayiBulmaca();
	}
public static void sayiBulmaca() {
	 
int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9};
int arananSayi=5;
boolean isExist=false;

for(int sayi:sayilar) {
	
	if (sayi==arananSayi) {
		isExist=true;
		break;
	}
	
	
}

String mesaj;
if (isExist) {
	mesaj="sayi Mevcuttur "+arananSayi;
	mesajVer(mesaj);
}
else {
	System.out.println("Sayi Mevcut Değildir "+ arananSayi);
}
}

public  static void mesajVer(String mesaj) {
	System.out.println(mesaj);

}
}
