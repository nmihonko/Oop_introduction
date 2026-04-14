package app;

// Виправте цей клас
public class Main {

    public static void main(String[] args) {

        Customer Oleg = getCustomer(getData("Oleg", "+2983918312983"));
        Customer Masha = getCustomer(getData("Masha", "+2983918312983"));
        Customer Nazar = getCustomer(getData("Nazar", "+2983918312983"));
        getOutput(Oleg);
        getOutput(Masha);
        getOutput(Nazar);
    }

    public static String[] getData(String name, String phone) {
        return new String[]{name, phone};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(Customer customer) {
        System.out.println("Customer: " + customer.getName() +
                ", phone " + customer.getPhone());
    }
}