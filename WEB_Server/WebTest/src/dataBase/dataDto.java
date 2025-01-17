package dataBase;

import java.util.Date;

public class dataDto {
	private String id;
	private String nickname;
	private String name;
	private String pw;
	private String gender;
	private String tel;
	private String phone;
	private String email ;
	private String addr;
	private Date regDate ;



	public dataDto(String id, String pw,String nickname, String name,  String gender,String tel, String phone, String email,
			String addr, Date regDate) {
		
		this.id = id;
		this.nickname = nickname;
		this.name = name;
		this.pw = pw;
		this.gender=gender;
		this.tel = tel;	
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.regDate=regDate;
	}



	public String getId() {
		return id;
	}



	public Date getRegDate() {
		return regDate;
	}



	public String getNickname() {
		return nickname;
	}



	public String getName() {
		return name;
	}



	public String getPw() {
		return pw;
	}

	public String getGender() {
		return gender;
	}


	public String getTel() {
		return tel;
	}



	public String getPhone() {
		return phone;
	}



	public String getEmail() {
		return email;
	}



	public String getAddr() {
		return addr;
	}

	public boolean matchPassword(String pwd) {
		return pw.equals(pwd);
		
	}
}
