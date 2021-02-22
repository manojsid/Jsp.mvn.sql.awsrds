package tk.manojsid.web.dao;
import tk.manojsid.web.model.Alien;
import java.sql.*;


public class AlienDao {
	
	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		//String url = 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://manojsidtk.clsca7wzimqv.us-east-1.rds.amazonaws.com:3306/sample","admin","rootadmin");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setatech(rs.getString("atech"));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		return a;
		
	}

}
