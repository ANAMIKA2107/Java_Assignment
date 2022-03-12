package PaymentSystem;

public class PaymentProcSys {

	public static void processPayment(Payable payable) {
		//logic to process payment to database
		//
		System.out.println("payment of total: "+ payable.getPayment()+" is processed");
	}

}
