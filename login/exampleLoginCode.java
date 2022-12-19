//Example code how to handle SQL requests in eclipse with Jframe (the code should be put into a button)	
public void actionPerformed(ActionEvent e) {
				try
				{
					
				Class.forName("com.mysql.cj.jdbc.Driver");
		
				Connection con = DriverManager.getConnection("jdbc:mysql://yourlocalhost/database", "myusername", "mypassword");
				java.sql.Statement stm=con.createStatement();
				String sql = "Select * from tblogin WHERE username='"+yourInputField.getText()+"' AND password = '"+YourPassWord.getText()+"';";
				ResultSet rs = stm.executeQuery(sql);
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null, "Your Message");
				}
				else {
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
