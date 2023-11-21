class Employee {
    String name, lastName;
    float salary;

    public Employee(String n, String l, float s) {
        name = n;
        lastName = l;
        salary = s;
    }

    float raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    public String toString() {
        return "Name: " + name + " " + lastName + "\nSalary: " + salary;
    }
}

class Manager extends Employee {
    public Manager(String n, String l, float s) {
        super(n, l, s);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }
}

class Secretary extends Employee {
    Manager manager;

    public Secretary(String n, String l, float s, Manager m) {
        super(n, l, s);
        this.manager = m;
    }

    @Override
    public String toString() {
        return super.toString() + "\nManager: " + manager.name + " " + manager.lastName;
    }
}

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("Bob", "Smith", 30000);
        Secretary secretary = new Secretary("Anna", "jones", 10000, manager);

        System.out.println("Manager: ");
        System.out.println("Name: " + manager.name);
        System.out.println("Last Name: " + manager.lastName);
        System.out.println("Salary: " + manager.salary);
        System.out.println("********************");
        System.out.println("Secretary: ");
        System.out.println("Name: " + secretary.name);
        System.out.println("Last Name: " + secretary.lastName);

        float newSalary = secretary.raiseSalary(10);
        System.out.println("Salary: " + newSalary);
        System.out.println("Manager is: " + secretary.manager.name);

    }
}
