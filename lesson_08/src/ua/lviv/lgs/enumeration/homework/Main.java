package ua.lviv.lgs.enumeration.homework;

import java.util.Scanner;

public class Main {
	
	static void menu() {
		System.out.println("Press 1 to check if month is available");
		System.out.println("Press 2 to show all months of season");
		System.out.println("Press 3 to show all months with the same number of days");
		System.out.println("Press 4 to show all months with more days");
		System.out.println("Press 5 to show all months with less days");
		System.out.println("Press 6 to show next season");
		System.out.println("Press 7 to show previous season");
		System.out.println("Press 8 to show month with pair number of days");
		System.out.println("Press 9 to show month with odd number of days");
		System.out.println("Press 10 to show entered month with pair number of days");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Month [] mon = Month.values();
		
		menu();
		
		int inputNumber = scanner.nextInt();
		switch(inputNumber) {

			case 1:{
				System.out.println("Please, enter month: ");
				boolean flag = false;
				String month = inputMonth(); 
				flag = arrayOfMonth(mon, month);

					if(!flag) {
						System.out.println("The month is absent. " + month);
					}
				break;
			}
			
			case 2: {
				System.out.println("Please, enter season: ");
				boolean flag = false;
				String month = inputMonth(); 
				
				 for(Month m: mon) {
					if(m.getSeason().name().equals(month)) {
						System.out.println("The season " + m.getSeason() + " include " + m);	
						flag = true;
					} 
				}	
					if(!flag) {
						System.out.println("Season does not exist");
					}
				break;
			}
			
			case 3: {
				System.out.println("Please, enter number of days: ");
				int numberOfDays = inputNumberOfDays();
				boolean flag = false;
				for(Month m: mon) {
					if(m.getNumOfDays() == numberOfDays) {
						System.out.println(m +" has following month: " + m.getNumOfDays());						
					}else {
						flag = false;
					}	
				}	
				if(!flag) {
					System.out.println("Please, input correct number of days");
				}
				break;
			}
			
			case 4: {
				System.out.println("Please, enter number of days: ");
				int numberOfDays = inputNumberOfDays();
				boolean flag = false;
				for(Month m: mon) {
					if(m.getNumOfDays() > numberOfDays) {
						System.out.println("The following month: " + m.name() + " have more days then " + numberOfDays);
						
					} else if(m.getNumOfDays() <= 31) {
						flag = false;						
					}
				}
				if(!flag) {
					System.out.println("the month do not have more then 31 days");
				}				
				break;
			}
			
			case 5: {
				System.out.println("Please, enter number of days: ");
				int numberOfDays = inputNumberOfDays();
				
				for(Month m: mon) {
					if(m.getNumOfDays() < numberOfDays) {
						System.out.println("The following month: " + m.name() + " have less days then " + numberOfDays);				
					} 
				}					
				break;
			}
			
			case 6:{
				System.out.println("Please, enter season: ");
				String month = inputMonth(); 
				
				boolean flag = monthExist(mon, month);

				 if(flag) {
					 
					 Seasons season = Seasons.valueOf(month);
					 Seasons [] s = Seasons.values();
					 
					 int ordinal = season.ordinal();
					 if(ordinal == s.length-1) {
						 ordinal = 0;
						 System.out.println("The next season is " + s[ordinal]); 
					 }else {
						 System.out.println("The next season is " + s[ordinal + 1]); 
					 }	
				 }		
					if(!flag) {
						System.out.println("Continent does not exist");
					}
				break;
			}
			
			case 7:{
				System.out.println("Please, enter season: ");
				
				String seasonData = inputMonth(); 
				boolean flag = monthExist(mon, seasonData);

				 if(flag) {		 
					 Seasons season = Seasons.valueOf(seasonData);
					 Seasons [] s = Seasons.values();
					 
					 int ordinal = season.ordinal();
					 if(ordinal == 0) {
						 ordinal = s.length-1;
						 System.out.println("The next season is " + s[ordinal]); 
					 }else {
						 System.out.println("The next season is " + s[ordinal - 1]); 
					 }	
				 }
					if(!flag) {
						System.out.println("Continent does not exist");
					}
				break;
			}
			
			case 8: {
				System.out.println("The following months have pair number of days: ");
	
				for(Month m: mon) {
					if(m.getNumOfDays() % 2 == 0) {
						System.out.println( m.name() + " " + m.numOfDays);				
					} 
				}					
				break;
			}
			case 9: {
				System.out.println("The following months have odd number of days: ");
	
				for(Month m: mon) {
					if(m.getNumOfDays() % 2 > 0) {
						System.out.println( m.name() + " " + m.numOfDays);				
					} 
				}					
				break;
			}
			case 10: {
				System.out.println("Input month: ");
				String month = inputMonth();
	
				for(Month m: mon) {
					
					if(m.name().equals(month)) {
						if(m.getNumOfDays() % 2 == 0) {
							System.out.println("The following months have pair number of days: " + m);
						} else {
							System.out.println("The following months have odd number of days: " + m);
						}						
					}					
				}					
				break;
			}
			
			
			


		}
	
	}
		

		
	


	private static String inputMonth() {
		
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		return month;
	}
	
	private static int inputNumberOfDays() {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	
	private static boolean arrayOfMonth(Month [] mon, String data) {
		boolean flag = false;
		
		for(Month m: mon) {
			if(m.name().equals(data)) {
				System.out.println("There is the following month: " + m);
				flag = true;
			} 
		}
		return flag;		
	}
	
	private static boolean monthExist(Month [] mon, String data) {
		boolean flag = false;
		
		for(Month m: mon) {
			if(m.getSeason().name().equals(data)) {	
				flag = true;
			}
		}
		return flag;		
	}

}
