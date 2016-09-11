package java.stack;
import static org.junit.Assert.*;

import org.junit.Test;
public class RideTest {
	@Test
	public void testEnterRide() {
		Ride r=new Ride();
		r.enterRide(4);
		//ls.delete();
		assertEquals(4, r.top.number);
	}
	@Test
	public void testExitRide(){
		Ride r=new Ride();
		r.enterRide(2);
		//r.enterRide(7);
		int actual = r.top.number;
		int deleted = r.exitRide();
		assertEquals(deleted, actual);
	}
}
