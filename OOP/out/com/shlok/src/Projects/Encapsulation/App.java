package Projects.Encapsulation;

public class App {
    public static void main(String[] args) {
        Company.Employee employee = new Company.Employee(101, "Shlok", "Development", 45000);
        Company.Manager manager = new Company.Manager(201, "Rahul", "Engineering", 85000, 8);

        System.out.println("Employee Details Before Appraisal");
        employee.displayDetails();

        employee.setDepartment("Backend Development");
        employee.appraisal(10);

        System.out.println();
        System.out.println("Employee Details After Appraisal");
        employee.displayDetails();
        System.out.println("Employee Name using getter: " + employee.getName());

        System.out.println();
        System.out.println("Manager Details Before Appraisal");
        manager.displayDetails();

        manager.setTeamSize(10);
        manager.managerAppraisal(15, 10000);

        System.out.println();
        System.out.println("Manager Details After Appraisal");
        manager.displayDetails();
        System.out.println("Manager Team Size using getter: " + manager.getTeamSize());
    }
}
