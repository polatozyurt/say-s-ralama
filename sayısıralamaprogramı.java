import java.util.Scanner;

public class sayýsýralamaprogramý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 sayý alarak onlarý sýralayan program
		Scanner input =new Scanner(System.in);
		int number1, number2, number3;
		
		
		System.out.print("1.Sayýyý giriniz: ");
		number1=input.nextInt();
		System.out.print("2.Sayýyý giriniz: ");
		number2=input.nextInt();
		System.out.print("3.Sayýyý giriniz: ");
		number3=input.nextInt();
		
		//sayýlarý karþýlartýrmaca
		
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
