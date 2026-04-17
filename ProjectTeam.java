import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printTeamMembers() {
        System.out.println("Project: " + projectName);
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public double calculateTotalCost() {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.calculateMonthlyCost(); // polymorphism
        }
        return sum;
    }

    public Employee findById(String id) {
        for (Employee e : employees) {
            if (e.getEmployeeId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void printDevelopers() {
        for (Employee e : employees) {
            if (e instanceof Developer) {
                System.out.println(e);
            }
        }
    }

    public void printAutomationTesters() {
        for (Employee e : employees) {
            if (e instanceof Tester) {
                Tester t = (Tester) e;
                if (t.isAutomationTester()) {
                    System.out.println(t);
                }
            }
        }
    }
}