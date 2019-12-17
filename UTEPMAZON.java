/*CS1101/*CS1101 Intro to Computer Science
 *Instructor: Aguirre
 *First Lab Assignment
 *Modified and Submitted by: [Manuel Gutierrez 88829826]
 *I apologize in advance for the inefficent coding structure of this program but it works 
 */
 import java.util.Scanner;
 import java.io.File;//this takes a file outside your java file

/*public class shopper{
	
}
 */
 
public class UTEPMAZON{
	public static int cartNum = 0; //global variables because you will be manipulating them in multiple methods 
	public static double subtotal = 0.0;
	public static double depositAmount = 0.0;
	
public static double menulayer1(int choices){//method call that calculates the total
	Scanner scnr = new Scanner(System.in);
	double total = 0.0;
	System.out.println("");//some space nothing fancy
	System.out.println("To add to cart input the item number");
	System.out.println("Then input the quantity");
	System.out.println("");//some space nothing fancy
	switch(choices){
		////////////////////////////////////////////this is catalog TV/////////////////////////////
		case 1:
			System.out.println("\t" + "Tvs:");
			System.out.println("1. Vizion 32\"\"\t\t\t"+"$ 139.56");
			System.out.println("2. LG 50\"\"\t\t\t"+"$ 385.12");
			System.out.println("3. Samsumg 65\"\"\t\t\t"+"$ 564.98");
			System.out.println("4. SONY 70\"\"\t\t\t"+"$ 819.47");
			System.out.println("5. To go back to cheack out");				
			System.out.print("PRODUCT NUMBER: ");
			int orderNumber = scnr.nextInt();
				if(orderNumber == 5){///in case of go back will not ask for quantity
				break;///to get out of switch
				}
			System.out.print("QUANTITY: ");
			int quantity = scnr.nextInt();
		
				if(orderNumber == 1){//if cheacks if you can afford it fro order 1
					total = (139.56 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
			
				else if(orderNumber == 2){//if cheacks if you can afford it for option 2
					total = (385.12 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.print("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}	
			
				else if(orderNumber == 3){//if cheacks if you can afford it for option 3
					total = (564.98 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just like the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
				
				else if(orderNumber == 4){//if cheacks if you can afford it for option 4
					total = (819.47 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
		break;//keps me from entering case 
		
		case 2:////////////////////////////////////////This is catalog Laptops/////////////////////////
			System.out.println("\t" + "Laptops");
			
			System.out.println("1. Surface GO!\t\t\t"+"$ 549.99");
			System.out.println("2. Apple MacBook Air\t\t"+"$ 1299.99");
			System.out.println("3. Lenovo\t\t\t"+"$ 539.53");
			System.out.println("4. HP Laptop\t\t\t"+"$ 699.99");
			System.out.println("5. To go back to cheack out");	
			System.out.print("PRODUCT NUMBER: ");
			orderNumber = scnr.nextInt();
				if(orderNumber == 5){///in case of go back will not ask for quantity
					break;///to get out of switch
				}
			System.out.print("QUANTITY: ");
			quantity = scnr.nextInt();

				if(orderNumber == 1){//if cheacks if you can afford it fro order 1
					total = (549.99 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just like the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
			
				else if(orderNumber == 2){//if cheacks if you can afford it for option 2
					total = (1299.99 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just like the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}	
			
				else if(orderNumber == 3){//if cheacks if you can afford it for option 3
					total = (539.53 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just like the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
				
				else if(orderNumber == 4){//if cheacks if you can afford it for option 4
					total = (699.99 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}

		break;//keeps me from entering case 3
		
		case 3:////////////////////////catalog is Cell phones/////////////////////////////////////////
			System.out.println("\t" + "Cell phones");
			System.out.println("1. iPhone 11\t\t\t"+"$ 749.84");
			System.out.println("2. Galaxy Fold\t\t\t"+"$ 1980.00");
			System.out.println("3. Galaxy S10\t\t\t"+"$ 998.97");
			System.out.println("4. Google Pixel\t\t\t"+"$ 378.78");
			System.out.println("5. To go back to cheack out");	
			System.out.print("PRODUCT NUMBER: ");
			orderNumber = scnr.nextInt();
				if(orderNumber == 5){///in case of go back will not ask for quantity
					break;///to get out of switch
				}
			System.out.print("QUANTITY: ");
			quantity = scnr.nextInt();
		
				if(orderNumber == 1){
					total = (749.84 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;
					return total;
				}
			
				else if(orderNumber == 2){//if cheacks if you can afford it for option 2
					total = (1980.00 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}	
			
				else if(orderNumber == 3){//if cheacks if you can afford it for option 3
					total = (998.97 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
				
				else if(orderNumber == 4){//if cheacks if you can afford it for option 4
					total = (378.78 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("");
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
		break;
		case 4://///////////////////////////catalog  of acessories////////////////////////
			System.out.println("\t" + "Acessories:");
			System.out.println("1. Apple Watch \t\t\t"+"$ 214.08");
			System.out.println("2. Keurig Cofee Maker\t\t\t"+"$ 89.00");
			System.out.println("3. Amazon Echo\t\t\t"+"$ 72.51");
			System.out.println("4. Nintendo Switch controller\t\t\t"+"$ 61.19");
			System.out.println("5. To go back to cheack out");	
			System.out.print("PRODUCT NUMBER: ");
			orderNumber = scnr.nextInt();
				if(orderNumber == 5){///in case of go back will not ask for quantity
					break;///to get out of switch
				}
			System.out.print("QUANTITY: ");
			quantity = scnr.nextInt();
			
				if(orderNumber == 1){//if cheacks if you can afford it fro order 1
					total = (214.08 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
			
				else if(orderNumber == 2){//if cheacks if you can afford it for option 2
					total = (89.00* quantity);
						if(total > depositAmount - subtotal){
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}	
			
				else if(orderNumber == 3){//if cheacks if you can afford it for option 3
					total = (72.51 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
				
				else if(orderNumber == 4){//if cheacks if you can afford it for option 4
					total = (61.19 * quantity);
						if(total > depositAmount - subtotal){
							System.out.println("We Appologize for the inconveniece but you have exeeded your deposited amount");
							System.out.println("You will now be redirected to the main menu");
							System.out.println("");//I just liek the space
						return total = 0;
					}
					cartNum += quantity;//adds what ever is in the cart
					return total;
				}
			
		break;
		case 5:////just to go back in case of catalog is 5
		break;
	}
	return total;
}	
	public static void main( String[] args) throws Exception{
		Scanner scnr = new Scanner(System.in);
		//pass the path to the file as a parameter
		
		File filename = new File("testTxtFile.txt");
		
		Scanner reading = new Scanner(filename);

		
		String cardholderOnFile = reading.nextLine(); //manuel gutierrez jr
		String userNameOnFile = reading.nextLine(); //mgutierrez44
		String passwordOnFile = reading.nextLine(); //pa$$word
		int accountNumOnFile = reading.nextInt(); //520520
		int routingNumOnFile = reading.nextInt(); //111000
		reading.nextLine(); //consumes the next line in an Int 
		String addressOnFile = reading.nextLine(); // address
		String couponCodeOnFIle = reading.nextLine();//coupon code
		
		
		//password and username/////////////////////////////////////////////////////////////////
				System.out.println("");
				System.out.println("  **  ** ***** ***** *****       *****");
				System.out.println("  **  ** ***** **    **   *   * ***** * ");
				System.out.println("  **  **  ***  ****  *****   *  **     *");
				System.out.println("  *****   ***  **    **        **");
				System.out.println("   ***    ***  ***** **       **");
				System.out.println("");
				
		
		for(int i = 1; i <= 3; i++ ){
			System.out.println("Welcom to UTEP Electronics");
			System.out.println("please enter:");
			System.out.print("USERNAME: ");
			String userName = scnr.nextLine();//username input
			System.out.print("PASSWORD: ");
			String password = scnr.nextLine();//uternameinput
			
			if(userName.equals(userNameOnFile) && password.equals(passwordOnFile)){
				break;
			}
			else{
				System.out.println("Wrong password or username");
				if(i == 3){
					System.out.println("you have run out of attempts");
					System.exit(1);/////this forcefully ends the program
				}
			}
			
		}
		
		//CardInfo/////////////////////////////////////////////////////////////////////////////////
		System.out.println("Welcome " + cardholderOnFile + " !");
		for(int i = 1; i <= 3; i++){
			System.out.println("please enter:");
			
			System.out.print("CARDHOLDER NAME: ");
			String cardholder = scnr.nextLine();
			
			System.out.print("ACCOUNT NUMBER: ");
			int accountNum = scnr.nextInt();
			
			System.out.print("ROUTING NUMBER: ");
			int routingNum = scnr.nextInt();
			
			System.out.print("ADDRESS: ");
			scnr.nextLine();//consumes the int missing sapce
			String address = scnr.nextLine();

			
			
			
			
			if(cardholder.equals(cardholderOnFile) && (accountNum == accountNumOnFile) && (routingNum == routingNumOnFile) && address.equals(addressOnFile)){
				break;
			}
			else{
				System.out.println("Wrong card Info");
				if(i == 3){
					System.out.println("you have run out of attempts");
					System.exit(1);/////this forcefully ends the program
				}
			}
		}
		
		///////deposit//////////////////////////////////////////////////////////////////////////////
		System.out.println("Exellent! You are now ready to make a deposit.");
		for(int i = 0; i <= 3; i++ ){
			System.out.print("Enter deposit amount: $");
			depositAmount = scnr.nextDouble();
			
			if(depositAmount <= 5000.00){
				break;
			}
			else{
				System.out.println("Sorry, you can only deposit up to 5,000.00 into the account.");
				System.out.println("Try entering a lower amount.");
				if(i == 3){
					System.out.println("Sorry but we do not recognize the Card Info");
					System.exit(1);/////this forcefully ends the program
				}
			}		
		}
		
		/////////////////Main Menu////////////////////////////////////////////////////////////
		int answer = 0;/// just to go inside the loop you may also use a do while loop
		while(answer != 2){
			System.out.println("");//some sapce nothing fancy
			System.out.println("Main Menu");
			System.out.println("Welcome " + cardholderOnFile + "!");
			System.out.printf("subtotal amount: $%.2f", (subtotal) );
			System.out.println("");
			System.out.println("Cart: " + cartNum);
			System.out.println("\t" + "1.Search Item");
			System.out.println("\t" + "2.Check Out");
		
			System.out.print("ANSWER: ");//assuming an Int
			answer = scnr.nextInt();
		
			if(answer == 1){
				System.out.println("1. TVs");
				System.out.println("2. Laptops");
				System.out.println("3. Cell phones");
				System.out.println("4. Accessories");
				System.out.println("5. Go Back <--");
				System.out.print("Which catalog would you like to see: ");//assuming an INt
				int catalog = scnr.nextInt();
					subtotal += menulayer1(catalog);
			}
		
		}
		////////////////////////////coupon/////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Do you have a coupon [Yes/No]");
		String doYouHaveCoupon = scnr.nextLine();//consumes next line
			   doYouHaveCoupon = scnr.nextLine();
		if(doYouHaveCoupon.equals("Yes") || doYouHaveCoupon.equals("yes")){
			for(int i = 1; i <= 3; i++ ){
			System.out.println("please enter your coupon code:");
			String couponCode = scnr.nextLine();//username input
				if(couponCode.equals(couponCodeOnFIle)){
					double saved = (subtotal * .20);
					System.out.printf("YOU HAVE SAVED: %.2f", (saved));
					System.out.println("");
					subtotal = subtotal - (subtotal * .20);
					break;
				}
			
				else{
					System.out.println("Wrong code");
					if(i == 3){
					System.out.println("you have run out of attempts");
					break;
					}
				}
			}
		}
		
/////////////////////////Cheackout///////////////////
		System.out.println("Are you sure you want to proceed with payment [Yes/No]");
		String yesOrNo = scnr.nextLine();
		
		if(yesOrNo.equals("y") || yesOrNo.equals("yes") || yesOrNo.equals("Yes)") || yesOrNo.equals("Y")){///accounting for human error
			System.out.println("");//blanck spaces
			System.out.println("Thank you for your purchase!");
			System.out.println("Your items will be shipped to your address: " + addressOnFile);
			System.out.println("Total amount: " + subtotal);
			System.out.printf("Remaining Miner bucks is: %.2f", (depositAmount - subtotal) );
			///manybe a feature that will store your remaining miner bucks
		}
		else{
			System.out.println("No worries, we hope to hear from you soon!");
			System.out.println("Your budget is: " + depositAmount);
		}
	}
}	