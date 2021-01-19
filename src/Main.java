import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Person person = new Person();
		Numbers numbers = new Numbers();
		Address addresses = new Address();
		
		
		System.out.println("- Phone Search - ");
		System.out.println("Available operations : ");
		System.out.println("  1 - Add number");
		System.out.println("  2 - Search for a number");
		System.out.println("  3 - Search for a person by phone number");
		System.out.println("  4 - Add an address");
		System.out.println("  5 - Search for personal information");
		System.out.println("  6 - Delete personal information");
		System.out.println("  7 - Filtered listing");
		System.out.println("  x - Quit");
		System.out.println();
		
		while(true) {
			System.out.print(" Command : ");
			String command = reader.nextLine();
			
			if(command.equals("1")) {
				System.out.print("whose number : ");
				String name = reader.nextLine();
				System.out.print("number : ");
				String number = reader.nextLine();	
				person.add(name, number);
				numbers.add(number, name);	
			}
			
			else if(command.equals("2")) {
				System.out.print("whose number :");
				String name = reader.nextLine();
				if(person.personList.containsKey(name)) {
					System.out.println(person.personList.get(name));
				}
				else {
					System.out.println("not found");
				}
			}
		
			else if(command.equals("3")) {
				System.out.println("number : ");
				String number = reader.nextLine();
				if(numbers.numberList.containsKey(number)){
					System.out.println(numbers.numberList.get(number));
				}
				else {
					System.out.println("not found");
				}
			}
			
			else if(command.equals("4")) {
				System.out.println("whose address : ");
				String name = reader.nextLine();
				System.out.println("street : ");
				String street = reader.nextLine();
				System.out.println("city : ");
				String city = reader.nextLine();
				addresses.add(name, street + " " + city);
			}
			
			else if(command.equals("5")) {
				System.out.println("whose information : ");
				String name = reader.nextLine();
				if(addresses.addressList.containsKey(name) || person.personList.containsKey(name)) {
					System.out.println("address : " + addresses.addressList.get(name));
					System.out.println("phone numbers :" + person.personList.get(name));
				}
				else {
					System.out.println("not found");
				}
			}
			
			else if(command.equals("6")) {
				System.out.println("whose information : ");
				String name = reader.nextLine();
				if(person.personList.containsKey(name) || addresses.addressList.containsKey(name)) {
					person.personList.remove(name);
					numbers.numberList.remove(name);
					addresses.addressList.remove(name);
				}
				else {
					System.out.println("not found");
				}
			}
			
			else if(command.equals("7")) {
				System.out.println("enter keyword (if empty,list all): ");
				String keyword = reader.nextLine();
				
				for(Entry<String, String> p : person.personList.entrySet()) {
					if(p.getKey().contains(keyword)) {
						System.out.println(p.getKey());
						System.out.println("numbers : " + p.getValue());
						
					}
					else if(p.getKey().equals("")) {
						System.out.println(p.getKey());
						System.out.println("numbers : " + p.getValue());
					}
				}
				
				for(Entry<String, String> a : addresses.addressList.entrySet()) {
					if(a.getKey().contains(keyword)) {
						System.out.println(a.getKey());
						System.out.println("address : " + a.getValue());
					}
					else if(a.getKey().equals("")) {
						System.out.println(a.getKey());
						System.out.println("address : " + a.getValue());
					}
				}
			}
			
			
			else if(command.equals("x")) {
				System.out.println("program closing..");
				break;
			}
		} 
	}
}