package EscapingReferences;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));
        //records.getCustomers().clear(); Fatal khi minh sua no
        for (Customer next : records.getCustomers().values())
        {
            System.out.println(next);
        }

        Customer john = records.getCustomerByName("John");
        System.out.println(john.getName());
        john.setName("Derek");
        System.out.println(john.getName());

        for (Customer next : records.getCustomers().values())
        {
            System.out.println(next);
        }

    }

}