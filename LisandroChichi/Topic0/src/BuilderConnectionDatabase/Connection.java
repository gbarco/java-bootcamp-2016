package BuilderConnectionDatabase;

public class Connection {

	String driver;
	String url;
	String user;
	String pass;
	
	Connection(String driver,String url, String user, String pass) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
		this.url= url;
		this.user=user;
		this.pass= pass;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}
	
	
}
