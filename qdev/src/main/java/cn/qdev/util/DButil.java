package cn.qdev.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;




public class DButil {
	
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL= "jdbc:mysql://localhost:3306/db_qdev?characterEncoding=utf8";
    private final String USERNAME = "root";
    private final String PWD = "123456";



    private Connection connection;
    private PreparedStatement ps;
    protected ResultSet rs;

    public void getConnection(){
        try {
            Class.forName(DRIVER);
            // 2在网络中查找数据库，创建连接对象
            connection = DriverManager.getConnection(
                    URL, USERNAME,PWD);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //return connection;
    }

    public void closeAll(){
        try {
            // 释放资源
            if (rs != null)
                rs.close();
            if (ps != null)
                ps.close();
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * 不定参数查询方法
     * @param sql
     * @param name
     * @param pwd
     * @return 
     */
    public ResultSet executeQuery(String sql,Object... object){
        try {
            getConnection();
            ps = connection.prepareStatement(sql);
            if(object.length>0){
            	for (int i = 1; i <= object.length; i++) {
            		ps.setObject(i,object[i-1]);
				}
                 
            }
           
            return ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return rs;
    }

    /**
     * 增、删、改
     * @param sql
     * @param params
     * @return
     */
    public int executeUpdate(String sql , Object... object){
    	int result = -1;        
        try {
        	getConnection();
			ps = connection.prepareStatement(sql);
			if(object.length>0){
	        	for (int i = 1; i <= object.length; i++) {
	        		ps.setObject(i,object[i-1]);
	        		}
	        	
	        	}
			result = ps.executeUpdate();
        }    	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll();
		}
        

		return result;
       
    }
    public static void main(String[] args) {
		DButil util = new DButil();
		String sql = "select * from t_users";
		System.out.println(util.executeQuery(sql));
	}
}

