package cn.qdev.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.qdev.entity.User;
import cn.qdev.util.DButil;

public class UserDao extends DButil{
	
	//用户登录
	public User login(User u){
		
		String sql ="select * from t_users where email=? and pwd =?";
		ResultSet rs = this.executeQuery(sql,u.getEmail(),u.getPwd());
		try {
			if(rs.next()){
				return new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getInt(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.closeAll();
		}
		
		return null; 
	}
	//用户注册
	
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		User user = new User("znxsx@qq.com", "e10adc3949ba59abbe56e057f20f883e");
		if(dao.login(user)!=null){
			System.out.println(dao.login(user).getCreateDate());
		}else {
			System.out.println("bye");
		}
		
	}
}
