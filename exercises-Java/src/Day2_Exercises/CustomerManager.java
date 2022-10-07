package Day2_Exercises;

public class CustomerManager {

	public static void main(String[] args) {

      classes CustomerManager=new classes();
      CustomerManager.Add();
      CustomerManager.Remove();
      CustomerManager.Update();
//         value
      
      int sayi1=10;
      int sayi2=20;
      sayi2=sayi1;
      sayi1=30;
      System.out.println(sayi2);
      
      int[] sayilar= new int[] {1,2,3,4,5,6,7};
      int[] sayilar1 = new int[] {1,2,3,4,5,6,7,8,9};
      
      sayilar1=sayilar;
      sayilar[0]=10;
      System.out.println(sayilar1[0]);
	}

}
