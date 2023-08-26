package reward.user;

public class UserData {
	private int id;
	private String name;
	private int password;
	
	public UserData(int id, String name, int password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password +  "]";
	}
}
