public class CustomerMain {
    double calculate(Customer customer) {
        return customer.calculate();
    }

    interface Customer {
        double calculate();
    }

    class RegularCustomer implements Customer {
        public double calculate() {
            return 5.0;
        }
    }

    class PremiumCustomer implements Customer {
        public double calculate() {
            return 10.0;
        }
    }

    
    public static void main(String[] args) {
        CustomerMain customerMain = new CustomerMain();
        RegularCustomer regularCustomer = customerMain.new RegularCustomer();
        PremiumCustomer premiumCustomer = customerMain.new PremiumCustomer();
        System.out.println(customerMain.calculate(regularCustomer)); 
        System.out.println(customerMain.calculate(premiumCustomer));
    }
}