package aula14Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Lamp {
	/**
	 * The fields of the lamp
	 */
	private final short watts;
	private final String name;
	private final String description;

	/**
	 *
	 * @param watts power of the lamp
	 * @param name of the lamp
	 * @param description of the lamp
	 */
	public Lamp(short watts, String name, String description) {
		this.watts = watts;
		this.name = name;
		this.description = description;
	}

	/**
	 * Getters
	 * @return the information saved inside the different fields of our lamp
	 */
	public short getWatts() {
		return watts;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	/**
	 *
	 * @return a string with all of the information of the lamp formatted in a way that will be easy to split into later on
	 */
	public String toFileFormatted(){
		return getName()+";"+getDescription()+";"+getWatts();
	}

	/**
	 *
	 * @return the information of the lamp formatted in a user friendly way
	 */
	@Override
	public String toString() {
		return getName()+" |\tDescription: "+getDescription()+" |\tWatts: "+getWatts();

	}

	public static void main(String[] args) {
		//We create a list of lamps
		List<Lamp> list = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		int amount;
		// We are going to ask the user too input a number, that's why we encapsulated  the whole
		//operation inside a while, so we keep asking the user till they put a valid answer
		while (true) {
			try {
				//We ask for the amount of lamps to be put into our array
				System.out.println("How many lamps do you wish to insert?");
				//We save it into a variable
				amount = scanner.nextInt();
				//We stop the loop now we have a valid amount
				break;
			} catch (InputMismatchException e) {
				//if they don't insert a valid input we ask for it again
				System.out.println("Invalid input, try again");
				scanner.nextLine();
			}
		}
		// We made a for that will keep looping till we have asked the user all the information
		//Of all the lamps they want to insert into the program
		for (int i = 1; i <= amount; i++) {
			//We reset the scanner
			scanner.nextLine();
			//We create our variables
			String name;
			String description;
			short watts;
			//We do the same process we did while asking for the amount but now for the name
			while(true){
				try {
					System.out.println("Insert the name of the lamp #"+i+": ");
					name = scanner.nextLine();
					break;
				}catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					scanner.nextLine();
				}
			}
			//We do the same process we did while asking for the amount but now for the description
			while(true){
				try {
					System.out.println("Insert the description of the lamp #"+i+": ");
					description = scanner.nextLine();
					break;
				}catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					scanner.nextLine();
				}
			}
			//We do the same process we did while asking for the amount but now for the watts
			while(true){
				try {
					System.out.println("Insert the watts of the lamp #"+i+": ");
					watts = scanner.nextShort();
					break;
				}catch (InputMismatchException e){
					System.out.println("Invalid input, try again");
					scanner.nextLine();
				}
			}
			// we add each lamp into our array
			list.add(new Lamp(watts,name,description));
		}
		//Now we have all our lamps in our array we will save them into a file
		try{
			//We create a new file pointer
			File file = new File("lamps.txt");
			//We check if the file already exist and if it does we delete it to avoid corruption
			if (file.exists()){
				if (file.delete()){
					System.out.println();
				}
			}
			//We create a new file
			if (file.createNewFile()){
				System.out.println();
			}
			//We instantiate a writer
			PrintWriter writer = new PrintWriter(file);
			//We iterate all the elements inside of our list of lamps
			for (Lamp lamp:list) {
				//we insert each lamp into our file using the formatting method inside the Lamp class
				writer.println(lamp.toFileFormatted());
			}
			//We close our file to avoid corruption
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//We now read our file
		try{
			//We create a new scanner
			Scanner scanner1 = new Scanner(new File("lamps.txt"));
			//We print a separator
			System.out.println("---------------------------- File of lamps ------------------------------\n");
			//We iterate each line of our file
			while (scanner1.hasNext()){
				//We split it using the regex ";" reason for the method toFileFormatted in the Lamp class
				String[] split = scanner1.nextLine().split(";");
				//We then use each element of our array to print the information of our lamps in a user friendly way
				System.out.println(split[0]+" |\tDescription: "+split[1]+" |\tWatts: "+split[2]);
			}
			//We announce the end of our file
			System.out.println("\n---------------------------- End of file ------------------------------");
			//We close our file to avoid corruption
			scanner1.close();
		}catch (FileNotFoundException e){
			System.out.println("File not found");
		}

	}
}
