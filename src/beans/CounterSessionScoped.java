package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CounterSessionScoped {
	private int counterValue = 0;
	
	public String incrementCounter() {
		counterValue++;
		return "PageSessionScoped.xhtml";
	}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}

}
