package dataaccesslayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class GetHotel
{
	public static void main (String[] args) throws SQLException
	{
	
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet result = null;
		try	
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel?user=root&password=21420500chr");
			preparedStatement = conn.prepareStatement("SELECT * FROM Hotel");
			result = preparedStatement.executeQuery();
		
			while(result.next())
			{
				int no = result.getInt("hotelNo");
				String name = result.getString("hotelName");
				String adr = result.getString("city");
				
				System.out.println(no + ", " + name + ", " + adr);
				
				ArrayList<String> hotels = new ArrayList<String>();
			}
		}
		catch (SQLException e)
		{
			System.err.println(e);
		}
		finally
		{
			if (conn != null)
			{
				conn.close();
			}
		}
	}
	
	class Guest
	{
		
	}
}