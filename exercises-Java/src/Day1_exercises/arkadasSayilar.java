package Day1_exercises;


public class arkadasSayilar {

	public static void main(String[] args) {

		int number=220;
		int number1=284;
		int sum=0;
		int sum1=0;
		
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				
				sum+=i;
				
			}
		}
		for (int j = 1; j < number1; j++) {
			
			if (number1%j==0) {
				
				sum1+=j;
			}
		}
	
			if (sum==number1&& sum1==number) {
				
				System.out.println("Arkadaş Sayıdır");
			}
			else {
				
				System.out.println("Arkadaş Sayı Değildir");
			}
			
		

	}

}
