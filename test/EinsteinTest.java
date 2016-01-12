package test.EinsteinTest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import src.Einstein;

public class EinsteinTest {
    @Test
    public void TimeDialationFactor_StandardTest() {
    	double velocity = 0.5;
    	
        double timeDialation = Einstein.GetTimeDialationFactor(velocity);
        assertEquals(1.1547005383792517, timeDialation, 1e-10);
    }
    
    @Test
    public void RoundTripTravelTime_StandardTest() {
    	double velocity = 0.5;
    	double distance = 0.5;
    	
        double travelTime = Einstein.GetRoundTripTravelTime(distance, velocity);
        assertEquals(2.0, travelTime, 1e-10);
    }
    @Test
    public void AgeDifference_StandardTest() {
    	
    	double gamma = 1.1547005383792517;
    	double travelTime = 2.0;
    	
        double ageDifference = Einstein.GetAgeDifference(travelTime, gamma);
        assertEquals(0.26794919243112303, ageDifference, 1e-10);
    }
    
    
}