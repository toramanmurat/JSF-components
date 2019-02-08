package _02.helloAjax;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AjaxBean {
	
	private String key;
	private String value;
	private String selectedFramework;
	private Map<String, Object> frameworkMap;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSelectedFramework() {
		return selectedFramework;
	}

	public void setSelectedFramework(String selectedFramework) {
		this.selectedFramework = selectedFramework;
	}

	public Map<String, Object> getFrameworkMap() {
		return frameworkMap;
	}

	public void setFrameworkMap(Map<String, Object> frameworkMap) {
		this.frameworkMap = frameworkMap;
	}

	@PostConstruct
	public void init() {
		
		frameworkMap = new LinkedHashMap<String, Object>();
		frameworkMap.put("Servlet", "Servlet");
		frameworkMap.put("JSP", "JSP");
		frameworkMap.put("Hibernate", "Hibernate");
		frameworkMap.put("Jpa", "JPA");

	}

	public void addFramework(String key, String value) {
			
		if (key != null && value!=null) {
			frameworkMap.put(key, value);
		}
	}

}
