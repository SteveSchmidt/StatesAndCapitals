
// State object used to pass data between JSPs and Servlets.
package StatesAndCapitals.dto;

public class StateCapital {

	String stateId;
	String stateCapital;
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}
}
