package main;

import java.util.Scanner;

public class menu {
	public static void doMenu() {
		garage garage1 = new garage();
		car aygo = new car("toyota", "aygo", "petrol", 110, 4, false, 20);
		aygo.garageStore(garage1);
		motorbike swift = new motorbike("Suzuki", "fast", "Petrol", 180, 500, "sport", true);
		swift.garageStore(garage1);
		helicopter chopper = new helicopter("Apache", "Chopper", "oil", 300, 1000, 4, "brrrrrrrr");
		chopper.garageStore(garage1);
		while (true) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want to "
					+ "\n 1. create a new vehicle, "
					+ "\n 2. print the garage, "
					+ "\n 3. output a vehicle,?"
					+ "\n 4. show the repair costs for all vehicles,"
					+ "\n 5. remove a vehicle from the garage,"
					+ "\n 6. show the cost to fix a vehicle,"
					+ "\n 7. empty garage,"
					+ "\n 8. empty garage of a type,"
					+ "\n 9. do outType");
			int choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			case 1:
				System.out.println("What is the vehicle's manufacturer?");
				String manufacturer = scan.nextLine();
				System.out.println("What is its make?");
				String make = scan.nextLine();
				System.out.println("What fuel type does it use?");
				String fueltype = scan.nextLine();
				System.out.println("What is its max speed?");
				int maxSpeed = Integer.parseInt(scan.nextLine());
				System.out.println("Is it 1. A car 2. A motorbike or 3. a helicopter?");
				int choice2 = Integer.parseInt(scan.nextLine());
				switch (choice2) {
				case 1: 
					System.out.println("What is its seat number?");
					int seatNum = Integer.parseInt(scan.nextLine());
					boolean automatic = false;
					System.out.println("Is it automatic, y/n?");
					if (Character.toLowerCase(scan.nextLine().charAt(0)) == 'y') {
						automatic = true;
					}
					System.out.println("How much storage space in meters squared?");
					int storage = Integer.parseInt(scan.nextLine());
					car tempcar = new car(manufacturer, make, fueltype, maxSpeed, seatNum, automatic, storage);
					garage1.addGarage(tempcar);
					break;
				case 2:
					System.out.println("What is its mileage?");
					int mileage = Integer.parseInt(scan.nextLine());
					boolean turbo = false;
					System.out.println("Does it have turbocharge, y/n?");
					if (Character.toLowerCase(scan.nextLine().charAt(0)) == 'y') {
						turbo = true;
					}
					System.out.println("What is its function?");
					String function = scan.nextLine();
					motorbike tempbike = new motorbike(manufacturer, make, fueltype, maxSpeed, mileage, function, turbo);
					garage1.addGarage(tempbike);
					break;
				case 3: 
					System.out.println("What is its maximum altitude?");
					int maxAlt = Integer.parseInt(scan.nextLine());
					System.out.println("How many seats does it have?");
					int seats = Integer.parseInt(scan.nextLine());					
					System.out.println("What sound does it make?");
					String sound = scan.nextLine();
					helicopter tempchopper = new helicopter(manufacturer, make, fueltype, maxSpeed, maxAlt, seats, sound);
					garage1.addGarage(tempchopper);
					break;
				default:
					System.out.println("Error, vehicle not a valid type");
					break;
						
				}
				break;

			case 2:
				garage1.printGarage();
				break;

			case 3:
				System.out.println("Input the manufacturer of who you want to search for.");
				String manufacture = scan.nextLine();
				System.out.println("Input the make of who you want to search for.");
				String make1 = scan.nextLine();
				String manMake = manufacture + " " + make1;
				if( garage1.returnID(manMake) == 9999) {
					System.out.println("Not found. ");
					break;
				} else {
				System.out.println(garage1.inGarage.get(garage1.returnID(manMake)));
				break;
				}
			case 4:
				garage1.repairCosts();
				break;
			case 5:
				System.out.println("Input the manufacturer of who you want to search for.");
				String manufacture1 = scan.nextLine();
				System.out.println("Input the make of who you want to search for.");
				String make2 = scan.nextLine();
				String manMake1 = manufacture1 + " " + make2;
				if( garage1.returnID(manMake1) == 9999) {
					System.out.println("Not found. ");
					break;
				} else {
				garage1.removeGarage(garage1.returnID(manMake1));
				System.out.println("Item removed");
				break;
				}
			case 6:
				System.out.println("Input the manufacturer of who you want to search for.");
				String manufacture2 = scan.nextLine();
				System.out.println("Input the make of who you want to search for.");
				String make3 = scan.nextLine();
				String manMake2 = manufacture2 + " " + make3;
				if( garage1.returnID(manMake2) == 9999) {
					System.out.println("Not found. ");
					break;
				} else {
				System.out.println(garage1.fix(garage1.returnID(manMake2)));
				break;
				}
			case 7:
				System.out.println("Are you sure? y/n");
				char remove = scan.nextLine().charAt(0);
				if (Character.toLowerCase(remove) == 'y') {
					garage1.emptyGarage();
					System.out.println("Garage emptied. ");
					break;
				} else {
					System.out.println("Action cancelled.");
					break;
				}
			case 8:
				System.out.println("Do you want to remove all 1. cars, 2. motorbikes 3. helicopters or 4. cancel");
				int choice3 = Integer.parseInt(scan.nextLine());
				switch (choice3) {
				case 1:
					garage1.emptyType("car");
					System.out.println("Cars have been removed from the garage.");
					break;
				case 2:
					garage1.emptyType("motorbike");
					System.out.println("Motorikes have been removed from the garage.");
					break;
				case 3:
					garage1.emptyType("helicopter");
					System.out.println("Helicopters have been removed from the garage.");
					break;
				case 4:
					System.out.println("Action cancelled.");
					break;
					default:
						System.out.println("Input error");
						break;
				}
				break;
			case 9:
				System.out.println("input a vehicle type");
				String input = scan.nextLine();
				garage1.outType(input);
				break;
				
			default:
				System.out.println("Please input the number of the option you want.");
			}

			System.out.println("Do you want to return to menu or exit? y/n");
			char exit = scan.nextLine().charAt(0);
			if (Character.toLowerCase(exit) == 'y') {
				continue;
			} else if (Character.toLowerCase(exit) == 'n') {
				break;
			} else {
				System.out
						.println("Please input either y or n (if neither is detected, this will automatically exit).");
				char exit2 = scan.nextLine().charAt(0);
				if (Character.toLowerCase(exit2) == 'y') {
					continue;
				} else {
					break;
				}
			}
		}
	}
}
