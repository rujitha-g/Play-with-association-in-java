public class Main {
    public static void main(String[] args) {

        Address address = new Address("Chennai", "Tamil Nadu");

        Employee emp = new Employee("Rujitha", address);

        emp.display();
    }
}