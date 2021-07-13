package LoginSuite;

import java.sql.*;


public class DataBaseConnectivity {
	
	
	
	public void makeConnectionWithDB() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("sql-app-qa-eus2-01.database.windows.net,1433","nipun.verma@svclnk.com","Hanumanji@263$$");
		Statement SS = con.createStatement();
	
		System.out.print(SS);
	
		}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DataBaseConnectivity DBC = new DataBaseConnectivity();
		DBC.makeConnectionWithDB();
	}
	

}
