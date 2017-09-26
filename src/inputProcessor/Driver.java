package inputProcessor;

import abstractFactory.*;
import dataStore.DataStore;
import outputProcessor.OutputProcessor;

import java.util.Scanner;

import MDA_EFSM.StateConverter;

public class Driver {

	static DataStore ds;
	static OutputProcessor op;
	
	static Account1 account1;
	static Account2 account2;

	static AbstractFactory factory;
	static StateConverter converter;
	
	/* local variables for ACCOUNT-1 input */
	static String p1;
	static String y1;
	static float a1;
	
	static String x1;
	static float d1;
	static float w1;
	
	/* local variables for ACCOUNT-2 input */
	static int p2;
	static int y2;
	static int a2;
	
	static int x2;
	static int d2;
	static int w2;
	
	public static void main(String[] args) {

		int select;
		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("select ACCOUNT-1 or ACCOUNT-2\n");
		System.out.println("1. ACCOUNT-1");
		System.out.println("2. ACCOUNT-2");
		
		while (true) {
			select = sc.nextInt();

			/* The numbers which are not 1 or 2 will not be accepted */
			if (select != 1 && select != 2) {
				System.out.println("invalid input");
			} else
				break;
		}
		
		if (select == 1) {
			
			factory = new ConcreteFactory_01();
			
			op = new OutputProcessor(factory);
			converter = new StateConverter(op);
			
			account1 = new Account1(factory, converter);
			
			System.out.println("ACCOUNT-1");
			System.out.println("Menu of Operations");
			System.out.println("0. open(String, String, float)");
			System.out.println("1. login(String)");
			System.out.println("2. pin(String)");
			System.out.println("3. deposit(float)");
			System.out.println("4. withdraw(float)");
			System.out.println("5. balance()");
			System.out.println("6. logout()");
			System.out.println("7. lock(String)");
			System.out.println("8. unlock(String)");
			System.out.println("9. Quit()");

			System.out.println("Please make a note of these operations");

			System.out.println("ACCOUNT-1 Execution");

			ch = '1';

			while (ch != 'q') {
				System.out.println("Select Operation: ");
				System.out.println("0-open,1-login,2-pin,3-deposit,4-withdraw,5-balance,6-logout,7-lock,8-unlock");

				ch = sc.next().charAt(0);

				switch (ch) {
				case '0': // open
					System.out.println("Operation: open(String p, String y, float a)");
					System.out.println("Enter value of the parameter p:");
					p1 = sc.next();
					System.out.println("Enter value of the parameter y:");
					y1 = sc.next();
					System.out.println("Enter value of the parameter a:");
					a1 = sc.nextFloat();
					account1.open(p1, y1, a1);
					break;
				case '1': // login
					System.out.println("Operation: login(String y)");
					System.out.println("Enter value of the parameter y:");
					y1 = sc.next();
					account1.login(y1);
					break;
				case '2': // pin
					System.out.println("String x");
					System.out.println("Enter value of the parameter x");
					x1 = null;
					x1 = sc.next();
					account1.pin(x1);
					break;
				case '3': // deposit
					System.out.println("Operation: deposit(float d)");
					System.out.println("Enter value of the parameter d");
					d1 = sc.nextFloat();
					account1.deposit(d1);
					break;
				case '4': // withdraw
					System.out.println("Operation: withdraw(float w)");
					System.out.println("Enter value of the parameter w");
					w1 = sc.nextFloat();
					account1.withdraw(w1);
					break;
				case '5': // balance
					System.out.println("Operation: balance()");
					account1.balance();
					break;
				case '6': // logout
					System.out.println("Operation: logout()");
					account1.logout();
					break;
				case '7': // lock
					System.out.println("Operation: lock()");
					account1.lock(x1);
					break;
				case '8': // unlock
					System.out.println("Operation: unlock()");
					System.out.println("Enter value of the parameter x");
					x1 = sc.next();
					account1.unlock(x1);
					break;
				}
			}
		}
		
		else if (select == 2) {
			
			factory = new ConcreteFactory_02();
			
			op = new OutputProcessor(factory);
			converter = new StateConverter(op);
			
			account2 = new Account2(factory, converter);
			
			System.out.println("ACCOUNT-2");
			System.out.println("Menu of Operations");
			System.out.println("0. OPEN(int,int,int)");
			System.out.println("1. LOGIN(int)");
			System.out.println("2. PIN(int)");
			System.out.println("3. DEPOSIT(int)");
			System.out.println("4. WITHDRAW(int)");
			System.out.println("5. BALANCE()");
			System.out.println("6. LOGOUT()");
			System.out.println("7. suspend()");
			System.out.println("8. activate()");
			System.out.println("9. close()");

			System.out.println("Please make a note of these operations");

			System.out.println("ACCOUNT-2 Execution");

			ch = '1';

			while (ch != 'q') {
				System.out.println("Select Operation: ");
				System.out.println("0-OPEN,1-LOGIN,2-PIN,3-DEPOSIT,4-WITHDRAW,5-BALANCE,6-LOGOUT,7-suspend,8-activate,9-close");

				ch = sc.next().charAt(0);

				switch (ch) {
				case '0': // OPEN
					System.out.println("Operation: OPEN(int p, int y, int a");
					System.out.println("Enter value of the parameter p:");
					p2 = sc.nextInt();
					System.out.println("Enter value of the parameter y:");
					y2 = sc.nextInt();
					System.out.println("Enter value of the parameter a:");
					a2 = sc.nextInt();
					account2.OPEN(p2, y2, a2);
					break;
				case '1': // LOGIN
					System.out.println("Operation: LOGIN(int y)");
					System.out.println("Enter value of the parameter y:");
					y2 = sc.nextInt();
					account2.LOGIN(y2);
					break;
				case '2': // PIN
					System.out.println("int x");
					System.out.println("Enter value of the parameter x");
					x2 = sc.nextInt();
					account2.PIN(x2);
					break;
				case '3': // DEPOSIT
					System.out.println("Operation: DEPOSIT(int d)");
					System.out.println("Enter value of the parameter d");
					d2 = sc.nextInt();
					account2.DEPOSIT(d2);
					break;
				case '4': // WITHDRAW
					System.out.println("Operation: WITHDRAW(int w)");
					System.out.println("Enter value of the parameter w");
					w2 = sc.nextInt();
					account2.WITHDRAW(w2);
					break;
				case '5': // BALANCE
					System.out.println("Operation: BALANCE()");
					account2.BALANCE();
					break;
				case '6': // LOGOUT
					System.out.println("Operation: LOGOUT()");
					account2.LOGOUT();
					break;
				case '7': // suspend
					System.out.println("Operation: SUSPEND()");
					account2.suspend();
					break;
				case '8': // active
					System.out.println("Operation: active()");
					account2.activate();
					break;
				case '9': // close
					System.out.println("Operation: close()");
					account2.close();
					break;
				}
			}
		}sc.close();
	}
}
