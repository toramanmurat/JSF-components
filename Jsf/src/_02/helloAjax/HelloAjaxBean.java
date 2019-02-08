package _02.helloAjax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloAjaxBean {
	
	private String name;
	private String surname;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSayWelcome() {
		if("".equals(name) || name==null) {
			return "";
		}
		else {
			
			return "Ajax message : Welcome " + name + " , surname " + surname;
		}
		
		
	}
	
	
	
	
	
}
