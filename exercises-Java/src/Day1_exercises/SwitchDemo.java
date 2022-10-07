package Day1_exercises;

public class SwitchDemo {

	public static void main(String[] args) {

		char grade = 'w';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel Geçtiniz");
			break;
		case 'B':
			System.out.println("Güzel  Geçtiniz");
			break;
		case 'c':
			System.out.println("iyi  Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil  Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;	
			
		default:
			System.out.println("Geçerli  Bir Not Giriniz");
			
			break;
		}

	}

}
