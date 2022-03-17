package StudentPortal;

public class UserRegistration
{
	private String username;
    private String userCountry;

    public UserRegistration(String username,String userCountry) {
	this.setUsername(username);
	this.setUserCountry(userCountry);
    }
    
    public String getUsername() {
    	return username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }
    
    public String getUserCountry() {
    	return userCountry;
    }

    public void setUserCountry(String userCountry) {
    	this.userCountry = userCountry;
    }
    

public void registerUser(UserRegistration user)throws InvalidCountryException
{
	try {
		if(user.getUserCountry()=="India") System.out.println("user Registration done successfully");
		else throw new InvalidCountryException("User Outside India cannot be registered");
	}
	catch(Exception f)
	{
	throw new InvalidCountryException(f.getMessage());
	}
}
public static void main(String gg[]) 
{
	UserRegistration user_1=null;
	try
	{
	user_1=new UserRegistration("Anamika Tripathi","India");
	user_1.registerUser(user);
	}
	catch(InvalidCountryException g)
	{
		System.out.println(g.getMessage());
	}
	System.out.println("Username : "+user_1.getUsername()+", Country : "+user_1.getUserCountry());
	}


}