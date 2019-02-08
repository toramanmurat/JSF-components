package _09.radiobutton;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class RadioButtonBean {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	private String marialStatus;

	public String getMarialStatus() {
		return marialStatus;
	}

	public void setMarialStatus(String marialStatus) {
		this.marialStatus = marialStatus;
	}
	
	public String[] getPreparedMaritalStatus() {
		return new String[]{"Married","Engaged","Single"};
		
	} 
	
	private String job;

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public Map<String,String> getPreparedJobs(){
		Map<String, String> jobsMap=new LinkedHashMap<String,String>();
		jobsMap.put("Engineer", "Software Engineer");
		jobsMap.put("Architect", "Decorator");
		jobsMap.put("Doctor", "heart doctor");
		return jobsMap;
	}
	
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public RadioButtonModel[] getPreparedDepartments() {
		RadioButtonModel[] departmentRadioButtonModel=new RadioButtonModel[3];
		departmentRadioButtonModel[0]=new RadioButtonModel("IT","software Deptarment");
		departmentRadioButtonModel[1] = new RadioButtonModel("Director", "Manager");
		departmentRadioButtonModel[2] = new RadioButtonModel("Accountant", "Accountant");
		return departmentRadioButtonModel;
	}
}

