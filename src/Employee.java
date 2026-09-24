class Employee {
    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Employee name:"+name);
        System.out.println("Employee address:"+address.city+" "+address.state);
    }
}