
public abstract class Location {
	
	public static int locationID = 0;
	public int buildingID;
	public int floorID;
	public int roomID;
	
	protected static void counterID(){
		locationID++;
	}
	
	protected abstract void opis();	
}
