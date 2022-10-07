package Day1_exercises;

public class miniProject1 {

	public static void main(String[] args) {

      int number=0;
      
      boolean isPrime=true;
      
      if (number==1) {
		
    	  System.out.println("Sayı Asal Değildir");
    	return;  
	}
      if (number<1) {
		
    	  System.out.println("Geçersiz Sayı");
    	  return;
	}
      
      
      for (int i = 2; i < number; i++) {
		
    	  if (number%2==0) {
			
    		  isPrime=false;
		}
	}
      
   if (isPrime) {
	System.out.println("Asal Sayı");
}
   else {
	System.out.println("Asal Değildir");
}
   
      
	}
      
     

}
