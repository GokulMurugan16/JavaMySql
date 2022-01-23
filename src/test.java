import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.vo.User;

public class test {
	
	
	public static String Insert_Querry = "insert into test.user_details(user_id,username,first_name,last_name,password,gender,status) values(?,?,?,?,?,?,?)";
	public static String Select_Querry = "Select * from test.user_details where user_id=?";
	
	
	public static void selectUser(int id) {
		try {
			ArrayList<User> a = new ArrayList<User>();
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "Gokul16.619");
			PreparedStatement p = connection.prepareStatement(Select_Querry);
			p.setInt(1, id);
			ResultSet r = p.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt("user_id"));
				System.out.println(r.getString("username"));
				System.out.println(r.getString("first_name"));
				System.out.println(r.getString("last_name"));
				System.out.println(r.getString("gender"));
				System.out.println(r.getString("password"));
				System.out.println(r.getInt("status"));
				System.out.println("");
			}
			connection.close();
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void add(User user) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "Gokul16.619");
			PreparedStatement p = connection.prepareStatement(Insert_Querry);
			p.setInt(1, user.getUser_id());
			p.setString(2, user.getUser_nmae());
			p.setString(3, user.getFirst_nmae());
			p.setString(4, user.getLast_nmae());
			p.setString(5, user.getGender());
			p.setString(6, user.getPassword());
			p.setInt(7, user.getStatus());
			
			int no = p.executeUpdate();
			if(no == 1) {
				System.out.println("Success");
			}
			
			connection.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		User user = new User(11,"Gokul Murugan", "Gokul", "Murugan", "MAle","123456",1);
		//add(user);
		selectUser(11);
	}

}
