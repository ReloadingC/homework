package solid;

public class SingleResponsibility {
    public static void main(String[] args) {
        Customer customer = new Customer("Max", 2000);
        BillGeneration bill = new BillGeneration();
        PaymentDAO dao = new PaymentDAO();

        bill.calculatePay(customer);
        dao.saveToDatabase(customer);



    }
}

class Customer {
    private String name;
    private int paymentAmount;

    public Customer(String name, int paymentAmount) {
        this.name = name;
        this.paymentAmount = paymentAmount;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }
}
class BillGeneration {
    public void calculatePay(Customer customer) {
        System.out.println("Your payment is " + customer.getPaymentAmount());
    }
}

class PaymentDAO {
    public void saveToDatabase(Customer customer) {
        System.out.println("Payment has been successfully saved to the database");
    }
}


