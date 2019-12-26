package jdbc;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Executor executor = new Executor();
		List<Employee> employees = executor.select();
		for(int i = 0; i < employees.size(); i++){
			Employee emp = employees.get(i);
			System.out.println(emp.getEmployeeId());
			System.out.println(emp.getFirstName());
		}
	}

}
