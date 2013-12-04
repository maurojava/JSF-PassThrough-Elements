package it.strazz.jsf.passthrough;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIInput;

@ManagedBean
@RequestScoped
public class Bean {
	private UIInput email;
	private UIInput password;
	private UIInput date;

	public UIInput getEmail() {
		return email;
	}

	public void setEmail(UIInput email) {
		this.email = email;
	}

	public UIInput getPassword() {
		return password;
	}

	public void setPassword(UIInput password) {
		this.password = password;
	}

	public UIInput getDate() {
		return date;
	}

	public void setDate(UIInput date) {
		this.date = date;
	}

	public UIInput getInput() {
		return date;
	}

	public void setInput(UIInput input) {
		this.date = input;
	}
	
	public void register(){
		//TODO: do something useful
		System.out.println("Email: " + email.getValue());
		System.out.println("Password: " + password.getValue());
		System.out.println("Date: " + date.getValue());
	}
}
