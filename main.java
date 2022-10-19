import java.util.Scanner;
public class main {
   public static void main(String[] args) {
	Scanner x = new Scanner(System.in);   
	
	Room R1 = new Room("001");
	Room R2 = new Room("002");
	Room R3 = new Room("003");
	Room R4 = new Room("004");
	Room R5 = new Room("005");
	Room R6 = new Room("101");
	Room R7 = new Room("102");
	Room R8 = new Room("103");
	Room R9 = new Room("104");
	Room R10 = new Room("105");
	
	Hotel.RoomsList.add(R1);
	Hotel.RoomsList.add(R2);
	Hotel.RoomsList.add(R3);
	Hotel.RoomsList.add(R4);
	Hotel.RoomsList.add(R5);
	Hotel.RoomsList.add(R6);
	Hotel.RoomsList.add(R7);
	Hotel.RoomsList.add(R8);
	Hotel.RoomsList.add(R9);
	Hotel.RoomsList.add(R10);
	
	
	int pick;
	 do {  
	System.out.println("Please Pick an operation: ");
	System.out.println("1. Book one room");
	System.out.println("2. Book two adjoining rooms");
	System.out.println("3. List unoccupied rooms");
	System.out.println("4. List occupied rooms with name of person");
	System.out.println("5. List info about available functions");
	System.out.println("6. Percent of occupation and unoccupation in the hotel");
	System.out.println("7. quit the program");
	
	System.out.print("Your Pick: ");
	pick = x.nextInt();
	System.out.println("");
	
	
		if (pick == 1) {
			System.out.println("Please enter Room Number:");
			String number = x.next();
			while (number.equals("")) {
				number = x.next();
			}
			System.out.print("Please enter client name and age: ");
			String name = x.nextLine();
			while(name.equals("")) {
				name = x.nextLine();
			}
			int age = x.nextInt();
			Client C = new Client(name,age);
			
			Hotel.BookARoom(C,number);
			System.out.println();
		}
		
		else if (pick == 2) {
			
			System.out.println("Please enter first Room Number:");
			String number1 = x.next();
			while (number1.equals("")) {
				number1 = x.next();
			}
			
			System.out.println("Please enter second Room Number:");
			String number2 = x.next();
			while (number2.equals("")) {
				number2 = x.next();
			}
			
			System.out.print("Please enter client name and age: ");
			String name = x.nextLine();
			while(name.equals("")) {
				name = x.nextLine();
			}
			int age = x.nextInt();
			Client C = new Client(name,age);
			
			Hotel.BookTwoRooms(C,number1,number2);
			System.out.println();
		}
		
		else if (pick == 3) {
			Hotel.UnoccupiedRooms();
			System.out.println();
		}
		
		else if (pick == 4) {
			Hotel.OccupiedRooms();
			System.out.println();
		}
		
		else if (pick == 5) {
			Hotel.help();
			System.out.println();
		}
		
		else if (pick == 6) {
			Hotel.PercentageOfUnoccupation();
			System.out.println();
		}
		
		
  }while(pick != 7);
	 System.out.println("Thank You!");
 }
}