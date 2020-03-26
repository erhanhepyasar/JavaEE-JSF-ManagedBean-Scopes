package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CounterRequestScoped {
	private int counterValue = 0;
	
	public String incrementCounter() {
		counterValue++;
		return "PageRequestScoped";
	}

	public int getCounterValue() {
		return counterValue;
	}

	public void setCounterValue(int counterValue) {
		this.counterValue = counterValue;
	}

}
