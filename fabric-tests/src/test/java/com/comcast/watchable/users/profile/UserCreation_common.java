package com.comcast.watchable.users.profile;

public class UserCreation_common {

	private String userName;
	private String email;
	private String password;

	public UserCreation_common()
	{
		createUser();
	}

	public String createUser() 
	{
		this.userName = "test_watchable" + System.currentTimeMillis();
		getEmail();
		getEmail();
		return this.userName;
	}

	public String getEmail() {
		if (this.userName != null) {

			this.email = this.userName + "@gmail.com";

		} 
		else 
		{
			throw new RuntimeException("call getUser before calling getEmail");
		}
		return email;
	}

	public String getPassword() 
	{
		this.password = "Demo1111";
		return password;
	}
	
	public String getUserName()
	{
		return this.userName;
	}

	/*
	 * public static void main(String[] args) { User user =new User();
	 * System.out.println(user.getUser()); System.out.println(user.getEmail());
	 * 
	 * System.out.println(user.getPassword()); }
	 */

}
