package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.bl.InvoiceGenrator;

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
}

