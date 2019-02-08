package fibonacci;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;


@ManagedBean
@SessionScoped

public class ManagedBeanController implements Serializable{
	private static final long serialVersionUID = 8150756503956053844L;
	
	private int numFibonacci;
	private long result;
	
	public ManagedBeanController() {
		
		numFibonacci=0;
		result=0;
	}

	public int getNumFibonacci() {
		return numFibonacci;
	}

	public void setNumFibonacci(int numFibonacci) {
		this.numFibonacci = numFibonacci;
	}

	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}
	
	private long getFibonnaciNumber(int param) {
		
		if(param==1 || param==2) {
			return 1;
		}
		long actual=1;
		long next=1;
		long sum=0;
		for(int i=2;i<param;i++) {
			
			sum=next+actual;
			actual=next;
			next=sum;
		}
		return next;
	}
	
	public void performFibonnaciOperation() {
		if(numFibonacci<=0) {
			setResult(0L);
		}
		else {
			
			setResult(getFibonnaciNumber(numFibonacci));
		}
		FacesMessage facesMsg=new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Fibonacci Calculation for the" + numFibonacci 
				+" number was: " + result ," Fibonacci Calculation"
				
				);
		FacesContext.getCurrentInstance().addMessage(null, facesMsg);
	}
	
	public void ajaxPerformFibonacciOperation(final AjaxBehaviorEvent event) {
		if(numFibonacci<=0) {
			setResult(0L);
		}
		else {
			
			setResult(getFibonnaciNumber(numFibonacci));
		}
		FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Fibonacci Calculation for the  " + " "+ numFibonacci
				+ " number was: " + result, "Fibonacci Calculation");
				FacesContext.getCurrentInstance().addMessage(null, facesMsg);
		
	}
}
