package _01.hello;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
//Default olarak personBean gelir.
//@ManagedBean(name="person") kullanarak adini değiştirebiliriz.  
@SessionScoped
public class PersonBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
