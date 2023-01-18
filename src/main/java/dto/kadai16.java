package dto;

public class kadai16 {
	private String name;
	private int age;
	private String gender;
	private int tel;
	private String mail;
	private String password;
	private String hashedpw;
	private String salt;
	
	public kadai16(String name,int age,String gender, int tel,String mail,String password,String hashedpw,String salt) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = tel;
		this.mail = mail;
		this.password = password;
		this.hashedpw = hashedpw;
		this.salt = salt;
		
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPw(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getHashedpw() {
		return hashedpw;
	}

	public void setHashedpw(String hashedpw) {
		this.hashedpw = hashedpw;
	}
	

}
