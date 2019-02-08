package _11.multiple.dropdown;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="multi")
public class MultipleDropdownBean {

	private String[] languages;

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	private String[] years;

	public String[] getYears() {
		return years;
	}

	public void setYears(String[] years) {
		this.years = years;
	}
	
	public String[] getPreparentYear() {
		return new String[]{"2015", "2016", "2017", "2018","2019"};
		
	}
}
