import java.util.ArrayList;

public class Hotel {
  static ArrayList <Room> RoomsList = new ArrayList<>();
  
  
  public static void BookARoom(Client C,String number) {
	  for (int i = 0; i < RoomsList.size(); i++) {
		if (RoomsList.get(i).number.equals(number) && RoomsList.get(i).Booked == false) {
			RoomsList.get(i).Booked = true;
			RoomsList.get(i).BookedBy = C;
			System.out.println("Room "+RoomsList.get(i).number+" Booked!");
			break;
		}
		else if (number.equals(RoomsList.get(i).number) && RoomsList.get(i).Booked == true) {
			System.out.println("Room Already Booked!");
			break;
		}
		else if (i == RoomsList.size()) {
			System.out.println("Room Not Found");
		}
	}
  }
  
  
  public static void BookTwoRooms (Client C,String number1,String number2) {
	  BookARoom(C,number1);
	  BookARoom(C,number2);
  }
  
  
  public static void UnoccupiedRooms () {
	  for (int i = 0; i < RoomsList.size(); i++) {
		if (RoomsList.get(i).Booked == false ) {
			System.out.println("Room "+RoomsList.get(i).number+" is unoccupied");
		}
	}
  }
  
  
  public static void OccupiedRooms() {
	  for (int i = 0; i < RoomsList.size(); i++) {
		if (RoomsList.get(i).Booked == true) {
			System.out.println("Room "+RoomsList.get(i).number+" is occupied by "+RoomsList.get(i).BookedBy.name);
		}
	}
  }
  
  
  public static void help() {
	  System.out.println("Option 1 books a room for a client");
	  System.out.println("Option 2 books two adjoining rooms for a client");
	  System.out.println("Option 3 shows you unoccupied rooms");
	  System.out.println("Option 4 shows you occupied rooms");
	  System.out.println("Option 6 gives you unoccupied percentage of the hotel");
	  System.out.println("Option 7 exits you from the software");
  }
  
  
  public static void PercentageOfUnoccupation() {
	  double count = 0 ;
	  for (int i = 0; i < RoomsList.size(); i++) {
		if (RoomsList.get(i).Booked == false) {
			count++;
		}	
	 }
	  double percent = (count/(double)RoomsList.size())*100;
	  
	  System.out.println("Percentage of unoccupied rooms is "+percent+"%");
  }
  
   
}