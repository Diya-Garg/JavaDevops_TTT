package com.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dao.UserDAO;
import com.model.User;



public class UserDAOImpl implements UserDAO{

	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void register(User user) {
		String sql="insert into user_tab values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[]{
				user.getUserName(),user.getPassword(),
				user.getFirstName(),user.getLastName(),
				user.getEmail(),user.getPhone()
		});
		
	}
	
	public User validateUser(String userName,String userPass){
		
		//String sql="select * from user_tab where username='"+userName+"' and password='"+userPass+"'";
		String sql="select * from user_tab where username=? and password=?";
		List<User> users=jdbcTemplate.query(sql,new UserMapper(),new Object[]{userName,userPass});
		System.out.println(users.size());
		return users.size()>0?users.get(0):null;
	}
}
	class UserMapper implements RowMapper<User>{
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			
			User user=new User();
			user.setUserName(rs.getString(1));
			user.setPassword(rs.getString(2));
			user.setFirstName(rs.getString(3));
			user.setLastName(rs.getString(4));
			user.setEmail(rs.getString(5));
			user.setPhone(rs.getString(6));
			
			return user;
			
		}
		
	}

