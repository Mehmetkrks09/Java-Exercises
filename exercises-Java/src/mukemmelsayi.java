
public class mukemmelsayi {

	public static void main(String[] args) {

		int number=6;
		int total=0;
		
		if (number%2==0) {
			
			total+=number;
		}
		if (total==number) {
			
			System.out.println("Mükemmel Sayıdır");
		}
		else {
				System.out.println("Mükemmel Sayı Değildir");
		}
	}

}
