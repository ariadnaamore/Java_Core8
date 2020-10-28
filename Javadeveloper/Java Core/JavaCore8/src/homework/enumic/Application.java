package homework.enumic;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Month mon[] = Month.values();
		Seasons season[] = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Month.menu();

			switch (sc.next()) {
			case "1":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();
				boolean flag = false;

				for (Month m : mon) {
					if (m.name().equals(month)) {
						System.out.println("Month exist: " + month);
						flag = true;
					}

				}

				if (!flag) {

					System.out.println("This month doesn't exist. Enter valid name.");
				}
				break;

//end first			
			// start second
			case "2": {
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String seasonScan = sc.next().toUpperCase();

				boolean flag1 = false;

				for (Month m : mon) {
					if (m.getSeason().name().equals(seasonScan)) {

						flag1 = true;
					}
				}
				if (flag1) {

					Seasons ses = Seasons.valueOf(seasonScan);

					for (Month mc : mon) {
						if (mc.getSeason().name().equalsIgnoreCase(seasonScan)) {
							System.out.println(mc);
						}
					}
				}
				if (!flag1) {
					System.out.println("Nothing");
				}
				break;
			}
//end second
//start third
			case "3":{
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String quantity = sc.next().toUpperCase();
				
				boolean flag2 =false;
				for (Month md : mon) {
					if(md.name().equals(quantity)) {
						System.out.println(md);
						flag2 =true;
					}
				}
				
				if(flag2) {
					Month mond = Month.valueOf(quantity);
					
					for (Month md : mon) {
						if(md.name().equals(mond)) {
							System.out.println(mond.getDay());
						}
					}
				}
				
				if (!flag2) {
					System.out.println("Nothing");
				
				
			}break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}

		}
	
	}
}}
