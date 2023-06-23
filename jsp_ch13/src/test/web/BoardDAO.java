package test.web;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	Connection con;
	DataSource dataFactory;
	ResultSet rs;
	public BoardDAO() {
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			dataFactory = (DataSource) envCtx.lookup("jdbc/EmployeeDB");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public ArrayList list() {
		ArrayList list = new ArrayList();
		try {
			con = dataFactory.getConnection();
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM board";
			
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String num = Integer.toString(rs.getInt("num"));
				String author = Integer.toString(rs.getInt("author"));
				String title = Integer.toString(rs.getInt("title"));
				String email = Integer.toString(rs.getInt("email"));
				Timestamp writeday = rs.getTimestamp("writeday");
				BoardTO data = new BoardTO();
				data.setNum(num);
				data.setAuthor(author);
				data.setTitle(title);
				data.setEmail(email);
				data.setWriteday(writeday);
				list.add(data);
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}