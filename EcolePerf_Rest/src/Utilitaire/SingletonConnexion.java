package Utilitaire;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnexion {
	
	private static Connection connexion;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbecoleperf?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					System.out.println("Connexion établie");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{ 
		return connexion;
		}


}







