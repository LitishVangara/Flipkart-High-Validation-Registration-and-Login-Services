package flipkartProject;

import java.util.Scanner;

import flipkartProject.PasswordValidation;

public class FlipkartMainMethod 
{
	public static String cpassword;
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Flipkart");
		System.out.println("Enter the Details for Registration : ");
		System.out.println("Enter the Email : ");
		String email = scan.nextLine();
		System.out.println("Enter the Mobile Number : ");
		long number = scan.nextLong();
		System.out.println("Create Password : ");
		scan.nextLine();
		String password = scan.nextLine();
		System.out.println("Confirm Password : ");
		cpassword = scan.nextLine();
		int passValidator = 0;
		passValidator = PasswordValidation.passValidator(0);
		if (passValidator==1)
		{
			if (password.equals(cpassword))
			{
				System.out.println("Your Registration is Successfully Completed.");
				System.out.println("Enter 1 for Login or 2 for Exit the page.");
				int input = scan.nextInt();
				switch (input)
				{
					case 1 : 
						System.out.println("Login.");
						{
							System.out.println("Enter User Name : ");
							scan.nextLine();
							String uname = scan.nextLine();
							System.out.println("Enter Password : ");
							String lpassword = scan.nextLine();
							if (cpassword.equals(lpassword) && uname.equals(email))
							{
									System.out.println("Login Sccessfull.");
									System.out.println("Enter 1 for Shoping.");
									System.out.println("OR");
									System.out.println("Enter 2 for Mobiles.");
									System.out.println("OR");
									System.out.println("Enter 3 for Eletronics.");
									System.out.println("OR");
									System.out.println("Enter 4 for Grocery.");
									int flipkartInput = scan.nextInt();
									switch (flipkartInput)
									{
										case 1 : 
											{
												System.out.println("Done Shoping");
												System.out.println("Thank you Visit Again.");
											}
											break;
										case 2 : 
										{
											System.out.println("I have bought Mobiles");
											System.out.println("Thank you Visit Again.");
										}
										break;
										case 3 : 
										{
											System.out.println("I have bought Eletronics");
											System.out.println("Thank you Visit Again.");
										}
										break;
										case 4 : 
										{
											System.out.println("I have bought grocery");
											System.out.println("Thank you Visit Again.");
										}
										break;
										default : System.err.println("Invalid Data.");
										break;
									}
							}
							else
							{
								System.err.println("Invalid Data.  Login Password and Confirm Password; User Name and Email should be same only.");
							}
						}
						break;
					case 2 : Ending.endTag();
					break;
					default : System.err.println("Invalid Data.");
					break;
				}
			}
			else
			{
				System.err.println("Invalid Data.  Password and Confirm Password should be same only.");
			}
		}
	}
}