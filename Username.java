/*PP 3.1 Write an application that prompts for and reads the user’s first
and last name (separately). Then print a string composed of the
first letter of the user’s first name, followed by the first five characters
of the user’s last name, followed by a random number in
the range 10 to 99. Assume that the last name is at least five letters
long. Similar algorithms are sometimes used to generate usernames
for new computer accounts.*/

import java.util.Scanner;
import java.util.Random;

public class Username {

	public static void main(String[] args) {
		
		String firstName, lastName;
		int num;
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("Enter your first name");
		firstName = scan.nextLine();
		System.out.println("Enter your surname");
		lastName = scan.nextLine();
		num = ran.nextInt(90)+10;
		System.out.println(firstName.substring(0, 1) + lastName.substring(0,5) + num );
	}

}
