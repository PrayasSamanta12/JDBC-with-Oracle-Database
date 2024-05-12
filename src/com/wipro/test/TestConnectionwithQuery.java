package com.wipro.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnectionwithQuery {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			/*Load and Register Driver class*/
			Class.forName("oracle.jdbc.OracleDriver");
			
			/*Create connection with Database*/
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Bantu");
			/*create statement object*/
			if(con!=null) {
				st=con.createStatement();
			}
			/*Execute the select Query*/
			if(st!=null) {
				rs=st.executeQuery("SELECT NAME,SECTION FROM STUDENT");
//				Here according to query Name -> column 1 and Section -> column 2
			}
			/*Process result from ResultSet*/
			if(rs!=null){
				while(rs.next()){
					System.out.println(rs.getString(1)+"\t"+rs.getString(2));
				}
			}
			
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
//			Close all the connections
			if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}

	}

}
