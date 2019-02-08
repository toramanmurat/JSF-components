package _19.datatable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DatatablePersonDataBean {
	
	private String name;
	private String surname;
	private int age;
	private int phoneNumber;
	private List<DatatablePersonBean> persons;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<DatatablePersonBean> getPersons() {
		return persons;
	}
	public void setPersons(List<DatatablePersonBean> persons) {
		this.persons = persons;
	}
	
	@PostConstruct
	public void initialize() {
		persons=new ArrayList<DatatablePersonBean>();
		persons.add(new DatatablePersonBean("murat","toraman",26,5025696));
		persons.add(new DatatablePersonBean("firat","abc",27,5024696));
		persons.add(new DatatablePersonBean("ayse","asd",28,50225956));
		persons.add(new DatatablePersonBean("xxx","yyyy",25,5534646));
	
	}
	
	public void addPerson() {
		DatatablePersonBean person=new DatatablePersonBean(name,surname,age,phoneNumber);
		persons.add(person);
	}
	
	public void deletePerson(DatatablePersonBean person) {
		persons.remove(person);
		
	}
	
	

}
