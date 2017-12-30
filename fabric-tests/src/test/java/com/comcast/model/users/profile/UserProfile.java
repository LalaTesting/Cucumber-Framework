package com.comcast.model.users.profile;

public class UserProfile {
	
    
private String mobileStatus;

private String registrationDate;

private String email;

private String userId;

private String userName;

private String emailStatus;

public String getMobileStatus ()
{
    return mobileStatus;
}

public void setMobileStatus (String mobileStatus)
{
    this.mobileStatus = mobileStatus;
}

public String getRegistrationDate ()
{
    return registrationDate;
}

public void setRegistrationDate (String registrationDate)
{
    this.registrationDate = registrationDate;
}

public String getEmail ()
{
    return email;
}

public void setEmail (String email)
{
    this.email = email;
}

public String getUserId ()
{
    return userId;
}

public void setUserId (String userId)
{
    this.userId = userId;
}

public String getUserName ()
{
    return userName;
}

public void setUserName (String userName)
{
    this.userName = userName;
}

public String getEmailStatus ()
{
    return emailStatus;
}

public void setEmailStatus (String emailStatus)
{
    this.emailStatus = emailStatus;
}

@Override
public String toString()
{
    return "ClassPojo [mobileStatus = "+mobileStatus+", registrationDate = "+registrationDate+", email = "+email+", userId = "+userId+", userName = "+userName+", emailStatus = "+emailStatus+"]";
}
}
		
		