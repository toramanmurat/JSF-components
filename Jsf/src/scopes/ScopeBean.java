package scopes;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
//tek bir istek boyunca yasar.
// @SessionScoped
//HTTP session boyunca yasar.
//@ApplicationScoped
//tum proje boyunca gecerlidir.tek bir bean olusur.
public class ScopeBean {

	private String name;
	private String surname;
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
	
}
