import java.util.Scanner;

public class say�s�ralamaprogram� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 say� alarak onlar� s�ralayan program
		Scanner input =new Scanner(System.in);
		int number1, number2, number3;
		
		
		System.out.print("1.Say�y� giriniz: ");
		number1=input.nextInt();
		System.out.print("2.Say�y� giriniz: ");
		number2=input.nextInt();
		System.out.print("3.Say�y� giriniz: ");
		number3=input.nextInt();
		
		//say�lar� kar��lart�rmaca
		
	if(number1<number2 && number1 < number3 ) {
		if(number2<number3) {
			System.out.print("1 < 2 < 3");
		}
		else {
			System.out.print("1 < 3 < 2");
		}	
	}
	else if(number2<number1 && number2<number3){
		if(number1<number3) {
			System.out.print("2 < 1 < 3");			
		}
		else {
			System.out.print("2 < 3 <1");
		}
		
	}
	else {
		if(number1<number2) {
			System.out.print("3 < 1 < 2");			
		}
		else {
			System.out.print("3 < 2 < 1");
		}
	}
		
	}

}
