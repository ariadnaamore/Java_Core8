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
//start first
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
			case "2":
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
					System.out.println("The month of this season: ");

					for (Month mc : mon) {
						if (mc.getSeason().name().equalsIgnoreCase(seasonScan)) {
							System.out.println(mc);
						}
					}
				}
				if (!flag1) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
//end second
//start third
			case "3":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String quantity = sc.next().toUpperCase();

				boolean flag2 = false;
				for (Month md : mon) {
					if (md.name().equals(quantity)) {
						System.out.println(md + ": this month have " + md.getDay() + " days");
						flag2 = true;
					}
				}
				if (flag2) {
					Month mond = Month.valueOf(quantity);

					System.out.println("All month with same day quantity: ");
					for (Month md : mon) {
						if (md.getDay() == mond.getDay()) {
							System.out.println(md.name());
						}
					}
				}
				if (!flag2) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
// end third
// start fourth
			case "4":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String lessDay = sc.next().toUpperCase();

				boolean flag3 = false;
				for (Month md : mon) {
					if (md.name().equals(lessDay)) {
						System.out.println(md + ": this month have " + md.getDay() + " days");
						flag3 = true;
					}
				}
				if (flag3) {
					Month mondLess = Month.valueOf(lessDay);
					System.out.println("All month with less day quantity: ");
					for (Month md : mon) {
						if ((mondLess.getDay() - md.getDay()) >= 1) {
							System.out.println(md.name());
						} else if ((mondLess.getDay() - md.getDay()) < 1) {
							flag3 = false;
						}
					}
				}
				if (!flag3) {
					System.out.println("Not exist");
				}
				break;
// end fourth
// start fifth
			case "5":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String moreDay = sc.next().toUpperCase();
				boolean flag4 = false;

				for (Month md : mon) {

					if (md.name().equals(moreDay)) {

						System.out.println(md + ": this month have " + md.getDay() + " days");

						flag4 = true;
					}
				}
				if (flag4) {
					Month mondMore = Month.valueOf(moreDay);
					System.out.println("All month with more day quantity: ");
					for (Month md : mon) {
						if ((md.getDay() - mondMore.getDay()) >= 1) {
							System.out.println(md.name());
						} else if ((md.getDay() - mondMore.getDay()) < 0) {
							flag4 = false;

						}
					}
				}
				if (!flag4) {
					System.out.println("Not exist");
				}
				break;
// end of fifth
// start sixth
			case "6":
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String nextSes = sc.next().toUpperCase();
				boolean flag5 = false;

				for (Month m : mon) {
					if (m.getSeason().name().equals(nextSes)) {

						flag5 = true;
					}
				}
				if (flag5) {

					Seasons ses = Seasons.valueOf(nextSes);
					int s1 = ses.ordinal();
					System.out.println("The next season is: ");

					for (Month ns : mon) {
						if (ns.getSeason().ordinal() == s1) {
							System.out.println(ns.getSeason().nextses());
						}
						break;
					}
				}
				if (!flag5) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
// end of sixth
// start of seventh
			case "7":
				System.out.println("Enter season: ");
				sc = new Scanner(System.in);
				String prevSes = sc.next().toUpperCase();
				boolean flag6 = false;

				for (Month m : mon) {
					if (m.getSeason().name().equals(prevSes)) {

						flag6 = true;
					}
				}
				if (flag6) {

					Seasons ses = Seasons.valueOf(prevSes);
					int s2 = ses.ordinal();
					System.out.println("The previous season is: ");

					for (Month ns : mon) {
						if (ns.getSeason().ordinal() == s2) {

							System.out.println(ns.getSeason().prevses());

						}
						break;
					}
				}
				if (!flag6) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
// end of seventh
// start of eighth

			case "8":
				System.out.println("Month with even numbers of day : ");

				for (Month m : mon) {
					if (m.getDay() % 2 == 0) {
						System.out.println(m.name());
					}
				}
				break;
//end of eight
//start of ninth			
			case "9":
				System.out.println("Month with odd numbers of day :  ");
				for (Month m : mon) {
					if (m.getDay() % 2 == 0) {
					}
					System.out.println(m.name());
				}
				break;
//end of ninth
//start of tenth				
			case "10":
				System.out.println("Enter month: ");
				sc = new Scanner(System.in);
				String dayMonth = sc.next().toUpperCase();
				boolean flag7 = false;
				for (Month m : mon) {
					if (m.name().equals(dayMonth)) {
						System.out.println(m.name());
						flag7 = true;
					}
					if (flag7) {
						for (Month mds : mon) {
							if (mds.getDay() % 2 == 0) {
								System.out.println("This month has even number of days");
							}
						}
						System.out.println("This month has odd number of days");
					}
					break;
				}

				if (!flag7) {
					System.out.println("This value doesn't exist. Enter valid name");
				}
				break;
//end of tenth
			}

		}

	}
}
