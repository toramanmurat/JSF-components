package _08.checkbox;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CheckboxBean {

	private boolean contanctme;

	public boolean isContanctme() {
		return contanctme;
	}

	public void setContanctme(boolean contanctme) {
		this.contanctme = contanctme;
	}
	
	private String[] progLanguages;

	public String[] getProgLanguages() {
		return progLanguages;
	}

	public void setProgLanguages(String[] progLanguages) {
		this.progLanguages = progLanguages;
	}
	
	private String[] jpaFrameworks= {"Hibernate"};

	public String[] getJpaFrameworks() {
		return jpaFrameworks;
	}

	public void setJpaFrameworks(String[] jpaFrameworks) {
		this.jpaFrameworks = jpaFrameworks;
	}
	
	public String[] getPreparedJpaFrameworks() {
		return new String[] {"EclipseLink","Hibernate","OpenJPA","DataStruct"};
		
	}
	
	private String[] mvcFrameworks;

	public String[] getMvcFrameworks() {
		return mvcFrameworks;
	}

	public void setMvcFrameworks(String[] mvcFrameworks) {
		this.mvcFrameworks = mvcFrameworks;
	}
	
	public Map<String, String> getPreparedMVCFrameworks(){
		Map<String,String> mvcFrameworksMap=new LinkedHashMap<String,String>();
		mvcFrameworksMap.put("JSF Framework", "JSF");
		mvcFrameworksMap.put("Spring Framework", "Spring");
		mvcFrameworksMap.put("Vaadin Framework", "Vaadin");
		return mvcFrameworksMap;
		
	}
	
	private String[] databases;

	public String[] getDatabases() {
		return databases;
	}

	public void setDatabases(String[] databases) {
		this.databases = databases;
	}
	
	public CheckboxModel[] getPraparedDatabases() {
		CheckboxModel[] databasesCheckBoxModel = new CheckboxModel[3];
		databasesCheckBoxModel[0] = new CheckboxModel("Oracle", "Oracle RDBMS");
		databasesCheckBoxModel[1] = new CheckboxModel("MSSQL", "MSSQL RDBMS");
		databasesCheckBoxModel[2] = new CheckboxModel("MySQL", "MySQL RDBMS");
		return databasesCheckBoxModel;
		
		
	}
	
	
	
}
