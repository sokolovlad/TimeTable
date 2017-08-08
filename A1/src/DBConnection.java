import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://localhost:3306/timetable";
		String user = "root";
		String password = "";
		
		try {
			//1. established  the connection
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			
			//2. create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. execute the query
			ResultSet myRs = myStmt.executeQuery("select * from Student");
			
			//4. process the resultset object
			while(myRs.next()){
				System.out.println(myRs.getString("student_name")+ " "+ myRs.getString("Student_ID"));
			}
			
			myStmt.close();
			myStmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
