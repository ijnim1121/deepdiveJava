package expDeepdive0826;

public class Employee {
	
	private String name;
	private double salary;
	private String position;
	
	public Employee(String name, double salary, String position) {
		super();
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", position=" + position + "]";
	}

	public void increaseSalary(double percentage) {
        this.salary *= (1 + percentage / 100);
        System.out.printf("%s의 급여가 %.1f%% 인상되었습니다. 현재 급여: %.0f%n", this.name, percentage, this.salary);
    }

}
