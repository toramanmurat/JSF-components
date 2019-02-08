package _10.dropdown;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DropdownBean {
	private String languages;

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	
	public String year;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public String[] getPreparedYears() {
		return new String[] {"2015","2016","2017","2018","2019"};
		
	}
	
	
}
