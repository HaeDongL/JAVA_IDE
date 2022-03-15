package shop.service.user;



public class Client {
		
	private String name;
	String hp;
	protected String job;
	public boolean gender;
	public static final String nationality = "¥Î«—¥‘±π";
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(String name, String hp, String job, boolean gender) {
		super();
		this.name = name;
		this.hp = hp;
		this.job = job;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public String getJob() {
		return job;
	}
	public boolean isGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", hp=" + hp + ", job=" + job + ", gender=" + gender + "]";
	}

}
