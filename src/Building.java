import java.util.List;

public class Building extends Location{

	protected int buildingID;
	private int buildingNumber;
	private String buildingDescription;
	private List<Floor>floorAll;
	
	public Building(int n, String d){
		counterBuildingID();
		buildingNumber = n;
		LocationID.buildingNum = buildingNumber;
		buildingDescription = d;
	}
	
	private void counterBuildingID(){
		buildingID++;
	}
	
	@Override
	public void description() {
		System.out.println(buildingID);
		System.out.println(buildingNumber);
		System.out.println(buildingDescription);
	}
	
	@Override
	public int compareTo(Location o){
		return 0;
	}

}
