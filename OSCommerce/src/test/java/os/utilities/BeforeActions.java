package os.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before
	
	public void beforeActions(Scenario scen){
		System.out.println("Initializing Chrome driver");
		SetupDrivers.setupDrivers();
		System.out.println(scen.getName());
	}

}
