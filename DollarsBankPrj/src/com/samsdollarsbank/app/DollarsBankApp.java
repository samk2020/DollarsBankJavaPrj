package com.samsdollarsbank.app;

import java.util.Scanner;
import com.samsdollarsbank.model.CustomerInfo;
import com.samsdollarsbank.controller.MainController;
import com.samsdollarsbank.util.ColorsUtil;
import com.samsdollarsbank.model.Accounts;
import java.util.InputMismatchException;

public class DollarsBankApp {  
	private final Scanner sc = new Scanner(System.in);
	public static void main (String [] srgs) { 
			
	}
	private static MainController ctrl = new MainController();  
	
	public static void User() {
		boolean InitializingApp = true;
		while(InitializingApp) {
			System.out.println( ColorsUtil.BLUE + 
					"\n********* SAM'S DOLLARS BANK : " +  "\tWelcome to a new banking!****** "
					+ ColorsUtil.RESET); 
			System.out.println(ColorsUtil.BLUE + "Choose from the following options below: " + ColorsUtil.RESET); 
			System.out.println(ColorsUtil.BLUE + "1. Sign-In to your account" + ColorsUtil.RESET); 
			System.out.println(ColorsUtil.BLUE + "2. Create an account" + ColorsUtil.RESET);
			System.out.println(ColorsUtil.BLUE + "3. Exit" + ColorsUtil.RESET); 
			
			int input = 0;
			String invalid = "Invalid choice, try again!"; 
			if(sc.hasNextInt()) {
				input = sc.nextInt(); 
				switch(input) { 
				
				case 1: 
					sc.nextLine(); 
					signinUser(); 
					break; 
				case 2: 
					sc.nextLine();
					createAccounts();
					break;
					
				case 3: 
					ctrl.saveAccounts();
					System.out.println(ColorsUtil.BLUE + "\n ************ Exiting out of the account menu! ************"+ ColorsUtil.RESET);
					InitializingApp = false;
					break;
				} 
				
			} 
			
			//done
			public static void signinUser() {
				Boolean aLoggedIn = true;
				
				while(aLoggedIn) {
					System.out.println(ColorsUtil.BLUE +"\n ********** Log-In to your account: **********" + ColorsUtility.RESET);
					System.out.println(" ");
					
					
					String username = "";
					String password = "";
					System.out.print(ColorsUtil.BLUE);
					
					System.out.println("Log-In with your Username:");
					username= sc.nextLine();
					
					System.out.println("Log-in with your Password:");
					password = sc.nextLine();
					try {
						Accounts acc = MainController.checkLogin(username, password);
						aLoggedIn = false;
						customerInit(acc);
						System.out.print(ColorsUtil.RESET);
					} catch (DataEx e) {
						System.out.println(ColorsUtil.RED + "\n *********** TRY AGAIN, INCORRECT LOGIN INFO: ***********" + ColorsUtil.RESET);
						aLoggedIn = true;
						continue;
					}		
					
				}
			
			// to -do 
			private static void createAccounts() {
				// TODO Auto-generated method stub 
				boolean input = true; 
				while(input) { 
					System.out.println(ColorsUtil.BLUE + "\n ********** Please input the following info below: ***********" + ColorsUtil.RESET);
					String name = ""; 
					String username = "";
					String password = ""; 
					int ssn = "";
					float initialBalance = 00000000000.00;   
					Boolean Successful = true; 
					
					try {
						System.out.println("Input your full legal name shown on your ID: ");
						name = sc.nextLine(); 
						System.out.println(" Input your complete Social security number: "); 
						name = sc.nextLine(); 
						
					}catch(InputMismatchException e) {
						System.out.println(ColorsUtil.GREEN + "\n *********** The input you have enter is incorrect, please try again: ************" + ColorsUtil.RESET); 
						Successful = false;
						sc.nextLine();
						continue;
					} 
					
					if(Successful) {
						MainController.getAccounts(name, username, ssn, password, balance);
						input = false;
					}
					
				}
					
			}


			public static void findLoggedIn() {
				Boolean aLoggedIn = true;
				
				while(aLoggedIn) {
					System.out.println(ColorsUtil.BLUE +"\n ********** Log-In to your account: **********" + ColorsUtil.RESET);
					System.out.println(" ");
					
					
					String username = "  : ";
					String password = "  : ";
					System.out.print(ColorsUtil.BLUE);
					
					System.out.println("Log-In with your Username:");
					username= sc.nextLine();
					
					System.out.println("Log-in with your Password:");
					password = sc.nextLine();
					try {
						Accounts acc = MainController.checkLogin(username, password);
						aLoggedIn = false;
						customerInit(acc);
						System.out.print(ColorsUtil.RESET);
					} catch (DataEx e) {
						System.out.println(ColorsUtil.RED + "\n ********** Incorrect Username/Password. Please try again to login: **********" + ColorsUtil.RESET);
						aLoggedIn = true;
						continue;
					}
					
				
				
				
				}
			
			}
			
			
			}	
			
			}
			
		
			}
	
	private static void createAccounts() {
		// TODO Auto-generated method stub
		
	}

	private static void signinUser() {
		// TODO Auto-generated method stub
		
	} 
	
}
