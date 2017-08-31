import java.util.Scanner;

class PayCheck {
		//Input / Scans for the indicated class
		private static Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
		double AmmountInBank = 0;
		/*
		System.out.print("Enter you monthly salary:");
		AmmountInBank = scanner.nextInt();
		*/
		for(int i=0;i<12;i++){
			System.out.print("How much did you earn this monthy ");
			double pay = scanner.nextInt();
			AmmountInBank = AmmountInBank + pay;
		}


		System.out.print("Your Yearly salary is ");
		System.out.print(AmmountInBank);
		System.out.println(" in total");
	}
}