package reward.gifts;

public class Gift {
	private int id;
	private String gift;
//	private int points;
	
	public Gift(int id, String gift) {
		super();
		this.id = id;
		this.gift = gift;
	//	this.points = points;
	}

	public Gift() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}
	

//	public int getPoints() {
//		return points;
//	}
//
//	public void setPoints(int points) {
//		this.points = points;
//	}

	@Override
	public String toString() {
		return "Gift [id=" + id + ", gift=" + gift + "]";
	}
}
