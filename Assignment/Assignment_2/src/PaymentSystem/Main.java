package PaymentSystem;

public class Main {

	public static void main(String[] args) {
		Employee employee=new
				CommissionEmployee(101, "anamika", 2.1, 5000000);
		Invoice invoice=new Invoice("A125", "Electronic25", 20, 3000);
		
		PaymentProcSys.processPayment(employee);
	}
}
