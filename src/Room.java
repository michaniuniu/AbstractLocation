
public class Room extends Location{

	private int roomID;
	private int roomNum;
	private String roomDescription;
	
	public Room(int n, String d){
		counterRoomID();
		roomNum = n;
		LocationID.roomNum = roomNum;
		roomDescription = d;
		
	}
	
	private void counterRoomID(){
		roomID++;
	}
	
	@Override
	public void description() {
		System.out.println(roomID);
		System.out.println(roomNum);
		System.out.println(roomDescription);
	}
	
	@Override
	public int compareTo(Location o){
		return 0;
	}
}
