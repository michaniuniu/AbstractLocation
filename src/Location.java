
public abstract class Location implements Comparable<Location>{
	
	public static int locationID = 0;
	public int buildingID;
	public int floorID;
	public int roomID;
	
	protected static void counterLocationID(){
		locationID++;
	}
	public static class LocationID{
		static int buildingNum;
		static int floorNum;
		static int roomNum;
	}
	public abstract void description();	
	
}
