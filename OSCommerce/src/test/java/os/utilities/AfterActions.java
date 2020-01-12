package os.utilities;

import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void afterActions(){
		SetupDrivers.tearDownDriver();
		System.out.println(" tear down  ");
	}

}
