import java.util.Scanner;
import java.io.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;



public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("(Unless prompted, press the Enter key to progress through the program. It is recommended to run this program as an administrator)");
		System.out.println("");
		System.out.println("You awake, tired-eyed and aching but feeling oddly rested enough for another day.");
		Enter.EnterKey();
		System.out.println("Seems like just another morning; same shit, different day. At least there's some sun out today, say what you want about the dusty clouds.");
		Enter.EnterKey();
		System.out.println("Also nice to have a roof over the head at least. Enough of that though, let's tidy up and get some grub.");
		Enter.EnterKey();
		System.out.println("Better check the home system first though to make sure nothing got fiddled with...");
		Enter.EnterKey();
		System.out.println("Alright, powered on my phone and opening the Task Manager. Now, time to put in my username and password...what were they again?");
		Enter.EnterKey();
		System.out.println("You head over to your work desk to retrieve the username and password written down on a piece of paper...");
		Enter.EnterKey();
		System.out.println("What are they? (Create username (asdf) first, select Enter, and then do the same for your password (asdf).)");
		UsernamePassword up = new UsernamePassword();
		System.out.println("Right, my username was " + up.getNUser() +", and my password was " + up.getNPass());
		Enter.EnterKey();
		System.out.println("Ok, inputting " + up.getNUser() + " and " + up.getNPass() + " into the phone");
		Enter.EnterKey();
		PasswordGUI.PGUI();
		Enter.EnterKey();
//		Programs.TaskManager();
//		Enter.EnterKey();
		System.out.println("No issues? Alright, good to know.");
		Enter.EnterKey();
		System.out.println("Now then, let's get some breakfast.");
		Enter.EnterKey();
		System.out.println("So what do we want to have today?");
		boolean brkfst1 = true;
		while(brkfst1) {
			System.out.println("1 for Eggs & Bacon, 2 for Cereal, 3 for Oatmeal.");
			String meal = scan.nextLine();
			switch(meal) {
			case "1":
				System.out.println("Always love me some eggs and bakey, let's fry it up!");
				brkfst1 = false;
				break;
			case "2":
				System.out.println("Nothing like a good ol' bowl of cereal. Let's get some milk and Cinnamon Toast Crunch!");
				brkfst1 = false;
				break;
			case "3":
				System.out.println("Ah yes, a hearty bowl of oatmeal. I mean literally, these meals are great for your heart!");
				brkfst1 = false;
				break;
			default:
				System.out.println("Uh, yeah, don't have any of that.");
				continue;
			}
		}
		Enter.EnterKey();
		System.out.println("Any beverages?");
		boolean brkfst2 = true;
		while(brkfst2) {
			System.out.println("1 for Coffee, 2 for Orange Juice, 3 for Milk.");
			String bvrge = scan.nextLine();
			switch(bvrge) {
			case "1":
				System.out.println("Nothing like a nice cup of Joe to get your day going!");
				brkfst2 = false;
				break;
			case "2":
				System.out.println("Love a nice juicy drink in the morning. Let's whip out some OJ");
				brkfst2 = false;
				break;
			case "3":
				System.out.println("Gotta build strong bones, right? Let's get some milk for that nice calcium in our diet!");
				brkfst2 = false;
				break;
			default:
				System.out.println("Uh, yeah, don't have any of that.");
				continue;
			}
		}
		Enter.EnterKey();
		System.out.println("While we're having breakfast, let's check out some YouTube.");
		Enter.EnterKey();
		Programs.YouTube();
		Enter.EnterKey();
		System.out.println("That was a good breakfast! Now, let's work more on that GUI we'd been messing with.");
		System.out.println("TO BE CONTINUED...Thanks for playing!");
		System.exit(0);
		scan.close();
	}

}
