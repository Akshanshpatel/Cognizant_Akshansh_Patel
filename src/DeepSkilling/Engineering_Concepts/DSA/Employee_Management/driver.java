package DeepSkilling.Engineering_Concepts.DSA.Employee_Management;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void display() {
        System.out.println(employeeId + " | " + name + " | " + position + " | ₹" + salary);
    }
}

class EmployeeManagement {

    Employee[] employees;
    int size;

    EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }
    // initializing starting array


    void addEmployee(Employee e) {

        if (size == employees.length) {
            System.out.println("Array is Full!");
            return;
        }

        employees[size] = e;
        size++;

        System.out.println("Employee Added Successfully.");
    }


    void searchEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {
                System.out.println("\nEmployee Found:");
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }


    void traverseEmployees() {

        if (size == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }


    void deleteEmployee(int id) {

        int index = -1;

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        // Shift elements left
        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("\nEmployee Deleted Successfully.");
    }
}

public class driver {

    public static void main(String[] args) {

        EmployeeManagement company = new EmployeeManagement(5);

        company.addEmployee(new Employee(101, "Aman", "Manager", 70000));
        company.addEmployee(new Employee(102, "Riya", "Developer", 50000));
        company.addEmployee(new Employee(103, "Karan", "Tester", 40000));

        company.traverseEmployees();

        company.searchEmployee(102);

        company.deleteEmployee(102);

        company.traverseEmployees();
    }
}