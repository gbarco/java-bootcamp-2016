package ProxyPatternConnection;

public class MainConnection {

	public static void main(String[] args) {
		
		
		ConnectionManager proxyCon = new ProxyConnection();
		
		proxyCon.dataBaseConnection();
		proxyCon.CreateQuery();
		
		
		
	}
	
	
}
