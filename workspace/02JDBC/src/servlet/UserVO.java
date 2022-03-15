package servlet;

/*
 * FileName : UserVO.java
 * 1.Client Data 를 Object Modeling
 * 2.Value Object (Value Object Pattern) : Data를 갖는 객체
 */

public class UserVO {
	///Field
	private String id;
	private String pwd;
	private boolean active;
	
	///Constructor
		public UserVO() {
			
		}
		
	///Method
	
	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public boolean isActive() {
		return active;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", action=" + active + "]";
	}

	
}
