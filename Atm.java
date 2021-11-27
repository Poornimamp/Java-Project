import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 25000;
		int withdraw;
		int deposit;
		//PIN generation
		int entry=4567;
		int pincode;
		int newpin,newpin1;
		System.out.println("Welcome to the Bank");
		
		while (true) {
			System.out.println("ATM Process");
			System.out.println("Choose the operation to perform");
			System.out.println("Choose 1:Deposit Amount");
			System.out.println("Choose 2:Withdraw Amount");
			System.out.println("Choose 3:Balance Enquiry");
			System.out.println("Choose 4:System Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				//PIN generation
				
				System.out.println("Enter your PIN");
				pincode=sc.nextInt();
				//Incorrect PIN
				    for(int i=0;i<3;i++) {
				    	if(pincode!=entry) {
					System.out.println("INCORRECT PIN: TRY AGAIN");
					System.out.println("Enter your PIN");
					pincode=sc.nextInt();}}
					
				
				//New PIN generation
				if(pincode!=entry) {
				System.out.println("FORGOT PIN");	
				System.out.println("Enter Your New PIN");
				newpin=sc.nextInt();
				System.out.println("Enter PIN Again");
				newpin1=sc.nextInt();
				if(newpin==newpin1) {
					entry=newpin;
					System.out.println("Your PIN changed");
					
					
				}
				}
					//Deposit Operation
				if(pincode==entry) {
				System.out.println("Enter your Deposit Amount ");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your Amount has successfully deposited");
				System.out.println("Your Account Balance");
				System.out.println(balance);
				System.out.println("   \n");}
				break;
			}
			case 2: {
                   //PIN generation
				
				System.out.println("Enter your PIN");
				pincode=sc.nextInt();
				//Incorrect PIN
				    for(int i=0;i<3;i++) {
				    	if(pincode!=entry) {
					System.out.println("INCORRECT PIN: TRY AGAIN");
					System.out.println("Enter your PIN");
					pincode=sc.nextInt();}}
					
				
				//New PIN generation
				if(pincode!=entry) {
				System.out.println("FORGOT PIN");	
				System.out.println("Enter Your New PIN");
				newpin=sc.nextInt();
				System.out.println("Enter PIN Again");
				newpin1=sc.nextInt();
				if(newpin==newpin1) {
					entry=newpin;
					System.out.println("Your PIN changed");
					
					
				}
				}
				
				//Withdraw Operation
				if(pincode==entry) {
				System.out.println("Enter your Withdraw Amount");
				withdraw = sc.nextInt();
				if (balance <= withdraw) {
					System.out.println("Insufficient Balance ");

				} else {
					System.out.println("Please collect your Amount.......");
					balance = balance - withdraw;
					System.out.println("Your Amount has been withdraw successfully");
					System.out.println("Your Current Account Balance \t" + balance);

				}}
				System.out.println("   \n");
				break;
			}
			case 3: {
 //PIN generation
				
				System.out.println("Enter your PIN");
				pincode=sc.nextInt();
				//Incorrect PIN
				    for(int i=0;i<3;i++) {
				    	if(pincode!=entry) {
					System.out.println("INCORRECT PIN: TRY AGAIN");
					System.out.println("Enter your PIN");
					pincode=sc.nextInt();}}
					
				
				//New PIN generation
				if(pincode!=entry) {
				System.out.println("FORGOT PIN");	
				System.out.println("Enter Your New PIN");
				newpin=sc.nextInt();
				System.out.println("Enter PIN Again");
				newpin1=sc.nextInt();
				if(newpin==newpin1) {
					entry=newpin;
					System.out.println("Your PIN changed");
					
					
				}
				}
				
				//Balance Enquiry
				System.out.println("Your Account Balance");
				
				System.out.println(balance);
				System.out.println("   \n");
				break;

			}
			case 4: {
				System.out.println("Thank You!!....VISIT AGAIN!!!!");
				System.exit(0);
			}

			}

		}
     
	}

}
