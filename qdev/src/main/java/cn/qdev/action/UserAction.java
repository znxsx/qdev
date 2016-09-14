package cn.qdev.action;

import cn.qdev.entity.User;
import cn.qdev.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements  ModelDriven<User>{
	private UserService userService = new UserService();
	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	public String login(){
		this.user = userService.login(user);
		if(this.user!=null){
			return Action.SUCCESS;
		}else {
			return Action.LOGIN;
		}
		
		
	}
}
