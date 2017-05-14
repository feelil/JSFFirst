package com.ilhanaksu;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@SuppressWarnings("serial")
@ManagedBean(name="login")
@SessionScoped
public class Login implements Serializable {
	private String userName;
	private String passWord;

	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	@PostConstruct
	private void init() {

		userName = "ilhan";
		passWord = "1";
	}
	public String validateUsernamePassword() throws IOException{
		if(userName.equals("ilhan") && passWord.equals("1")){
		return "moneyorder";
			//FacesContext.getCurrentInstance().getExternalContext().dispatch("order");
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		 facesContext.addMessage("loginForm:username", new FacesMessage("Username or password is incorrect"));
		return "Login";
		
		
		
	}
}
