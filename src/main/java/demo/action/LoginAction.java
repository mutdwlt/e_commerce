package demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String email;
	private String password;
	
	public String execute(){
		if(getEmail().equals("Thinh") && getPassword().equals("123456")){
			return SUCCESS;
		}
		return LOGIN;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
