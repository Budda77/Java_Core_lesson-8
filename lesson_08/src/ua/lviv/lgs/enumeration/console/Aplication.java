package ua.lviv.lgs.enumeration.console;

import java.util.Scanner;

public class Aplication {
	
	enum Direction{
		NORTH, SOUTH, WEST,EAST;
	}
	enum Continent{
		AUSTRALIA(Direction.NORTH),
		OKEANIA(Direction.SOUTH),
		ASIA(Direction.EAST),
		AMERICA(Direction.WEST),
		ANTARCTICA(Direction.NORTH),
		AFRICA(Direction.SOUTH),
		EUROPE(Direction.WEST);
		
		Direction direction;
		
		 Continent(Direction direction) {
			this.direction = direction;
		}

		public Direction getDirection() {
			return direction;
		}
		
	}
	
	static void menu() {
		System.out.println("Press 1 to check continent");
		System.out.println("Press 2 to show all continents with this direction");
		System.out.println("Press 3 to choose the next continent");
	}
	
	public static void main(String[] args) {

		Continent [] mas = Continent.values();

		Scanner sc = new Scanner(System.in);


		while(true) {
			menu();

			switch(sc.next()){

			case "1":{
				System.out.println("Enter Continent");

				sc = new Scanner(System.in);
				String continent = sc.next().toUpperCase();

				boolean flag = isContinentPresent(mas, continent);
				
				if(!flag) {
					System.out.println("Continent does not exist");
				}
				break;
			}
			case "2": {
				System.out.println("Enter Direction");

				sc = new Scanner(System.in);
				String directionSc = sc.next().toUpperCase();


				boolean flag = false;

				for(Continent c: mas) {
					if(c.getDirection().name().equals(directionSc)) {
						System.out.println("Continent exist");
						flag = true;
					}
				}
				
				if(flag) {
					//Direction dir = Direction.valueOf(directionSc);
					
					for(Continent con: mas) {
						if(con.getDirection().toString().equalsIgnoreCase(directionSc)) {
							System.out.println(con);
						}
					}	
				}
				
				if(!flag) {
					System.out.println("Continent does not exist");
				}
				break;				
			}

			case "3":{
				System.out.println("Enter Continent");

				sc = new Scanner(System.in);
				String continent = sc.next().toUpperCase();

				boolean flag = isContinentPresent(mas, continent);
				
				if(flag) {
					
					Continent cont2 = Continent.valueOf(continent);
					int ordinal = cont2.ordinal();
					
					if(ordinal == (mas.length-1)) {
						ordinal =0;
						System.out.println(mas[ordinal]);
					}else {
						System.out.println(mas[ordinal+1]);
					}		
				}
				
				if(!flag) {
					System.out.println("Continent does not exist");
				}
				break;		

			}


			}


		}



	}

	private static boolean isContinentPresent(Continent[] mas, String continent) {
		boolean flag = false;

		for(Continent c: mas) {
			if(c.name().equals(continent)) {
				System.out.println("Continent exist");
				flag = true;
			}

		}
		return flag;
	}

}
