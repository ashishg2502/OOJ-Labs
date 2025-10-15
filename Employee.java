public class Employee 
{
    int empId;
    String name;
    double salary;

    public Employee(int id, String n, double sal) 
    {
        empId = id;
        name = n;
        salary = sal;
    }

    public void display() 
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) 
    {
        Employee emp = new Employee(101, "Alice", 50000);
        emp.display();
    }
}


