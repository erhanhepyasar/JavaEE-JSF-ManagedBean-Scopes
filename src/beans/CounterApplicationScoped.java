package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
@javax.faces.bean.ApplicationScoped
public class CounterApplicationScoped {
	private int counterValue = 0;
	
	public String incrementCounter() {
		counterValue++;
		return "PageApplicationScoped";
	}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}

}
