
public class sayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[]{3,5,7,10,1,9,8};
		int sayi=5;
		boolean varMi=false;
		
		for(int num:sayilar) {
			
			if (num==sayi) {
				
				varMi=true;
				break;
			}
			
		}
		if (varMi) {
			System.out.println("Sayi Var");
		}
		else {
			System.out.println("Sayi yok");
		}

	}

}
