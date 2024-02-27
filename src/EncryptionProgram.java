import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram {
	
	private Scanner scan;
	private Random random;
	private ArrayList<Character> list;
	private ArrayList<Character> shuffledList;
	private char character;
	private String line;
	private char[] letters;
	private char[] secretLetters;

	EncryptionProgram(){
		scan = new Scanner(System.in);
		random = new Random();
		list = new ArrayList();
		shuffledList = new ArrayList();
		character = ' ';
		
		generateKey();
		getUserAction();
	}
	
	private void getUserAction(){
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("What do you want to do? ");
			System.out.println("[1] Generate new key");
			System.out.println("[2] Retrieve key");
			System.out.println("[3] Encrypt key");
			System.out.println("[4] Decrypt key");
			System.out.println("[5]Exit");
			
			System.out.print("\nENTER YOUR CHOICE: ");
			int userResponse = scan.nextInt();
			
			switch(userResponse) {
				case 1:
					generateKey();
					break;
				case 2:
					retrieveKey();
					break;
				case 3:
					encryptKey();
					break;
				case 4:
					decryptKey();
					break;
				case 5:
					quit();
					break;
				default:
					System.out.println("Invalid Input. Try again.");
			}
		}
		
	}
	
	private void generateKey() {
		character = ' ';
		list.clear();
		shuffledList.clear();
		
		for(int i = 32; i<127; i++) {
			list.add(Character.valueOf(character));
			character++;
		}
		
		shuffledList = new ArrayList(list);
		Collections.shuffle(shuffledList);
		System.out.println("A new key has been generated.");
		System.out.println("List: " + list);
		System.out.println("Shuffled List: " + shuffledList);
		
		
	}
	
	private void retrieveKey() {
		System.out.println("Key: ");
		
		for(Character x: list) {
			System.out.print(x);
		}
		System.out.println();
		for(Character x: shuffledList) {
			System.out.print(x);
		}
		System.out.println();
	}
	
	private void encryptKey() {
		
	}
	
	private void decryptKey() {
		
	}
	
	private void quit() {
		
	}
}
