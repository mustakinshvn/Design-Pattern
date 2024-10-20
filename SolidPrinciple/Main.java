package SolidPrinciple;

public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager();
        manager.addEmployee(new Developer("John", 25));
        manager.addEmployee(new Designer("Jane", 30));
        manager.addEmployee(new Developer("Doe", 35));
        for(Employee employee: manager.getEmployees()){
            employee.work();
           // System.out.println(employee.getName() + " is " + employee.getAge() + " years old");
        }
    }
}
