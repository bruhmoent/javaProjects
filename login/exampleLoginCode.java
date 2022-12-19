//You also need the mysql-connector-java-(ver).jar file to perform these requests
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.EventQueue;
import com.mysql.cj.xdevapi.Statement;
public void actionPerformed(ActionEvent e) {
	//Example code how to handle SQL requests in eclipse with Jframe (the code should be put inside of a button's action handler)	
				try
				{	
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://yourlocalhost/database", "myusername", "mypassword");
				java.sql.Statement stm=con.createStatement();
				String sql = "Select * from yourTableName WHERE field1='"+yourInputField.getText()+"' AND field2 = '"+yourInputField2.getText()+"';";
				ResultSet rs = stm.executeQuery(sql);
					
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null, "Your Message");
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Your Message");
					con.close();
				}
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
					System.out.print("Your Message");
				}
			}
		});
