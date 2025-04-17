public class Employee {
    private String name;
    private int age;
    private int salary;
    private int yearsOfService;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public int calculateBonus() {
        if (yearsOfService > 5) {
            return (salary * 10 / 100);
        }
        return 0;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(30);
        employee.setSalary(50000);
        employee.setYearsOfService(6);

        int bonus = employee.calculateBonus();
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bonus: " + bonus);
    }
}
