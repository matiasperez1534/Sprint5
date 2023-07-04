package cl.servicios;

public class ServicioLogin {
	private final String USERNAME = "admin";
	private final String PASSWORD = "1234";
	
	
	public boolean login(String username, String password) {
		
		if (username.equals(USERNAME) && password.equals(PASSWORD)) {
			return true;
		}
		
		return false;
	}
}
