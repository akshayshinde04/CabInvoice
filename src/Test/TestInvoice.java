package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bl.InvoiceGenrator;
import com.bl.Rides;

public class TestInvoice {
	@Test
	public void distanceAndTimeShouldReturnFare () {
		InvoiceGenrator invoiceGen = new InvoiceGenrator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGen.CalculateFare(distance, time);
		assertEquals(25,fare,0.0);
	}
	@Test
	public void distanceAndTimeShouldReturnMinFare() {
		InvoiceGenrator invoiceGen = new InvoiceGenrator();
		double distance = 1.5;
		int time = 10;
		double fare = invoiceGen.CalculateFare(distance,time);
		assertEquals(25, fare, 0.0);
	}
	@Test
	public void distanceAndTimeShouldReturnMultipleRides() {
		InvoiceGenrator invoiceGen = new InvoiceGenrator();
		Rides [] ride = {new Rides(2.0,5),
						new Rides(0.1,1) };
		double fare = invoiceGen.calculateFare(ride);
		assertEquals(30,fare,0.0);
		}
}
	

