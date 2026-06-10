package Projects.Encapsulation;

public class Company {
    public static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            setSalary(salary);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            this.salary = salary;
        }

        public void displayDetails() {
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        }

        public void appraisal(double percentage) {
            if (percentage <= 0) {
                System.out.println("Appraisal percentage must be positive.");
                return;
            }

            salary = salary + (salary * percentage / 100);
            System.out.println(name + " received " + percentage + "% appraisal.");
        }
    }

    public static class Manager extends Employee {
        private int teamSize;

        public Manager(int id, String name, String department, double salary, int teamSize) {
            super(id, name, department, salary);
            setTeamSize(teamSize);
        }

        public int getTeamSize() {
            return teamSize;
        }

        public void setTeamSize(int teamSize) {
            if (teamSize < 0) {
                System.out.println("Team size cannot be negative.");
                return;
            }

            this.teamSize = teamSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Team Size: " + teamSize);
        }

        public void managerAppraisal(double percentage, double bonus) {
            appraisal(percentage);

            if (bonus < 0) {
                System.out.println("Bonus cannot be negative.");
                return;
            }

            setSalary(getSalary() + bonus);
            System.out.println(getName() + " received manager bonus: " + bonus);
        }
    }
}
