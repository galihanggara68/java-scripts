package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Executor {
	private Connection connection;
	
	public Executor(){
		Connector connector = new Connector();
		connection = connector.getCon();
	}
	
	public void insert(){
		try {
			Statement insert = connection.createStatement();
			String query = "insert into copy_employees(employee_id, first_name, last_name) values(909, 'Test', 'Test Last')";
			insert.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(){
		try {
			Statement update = connection.createStatement();
			String query = "update copy_employees set first_name = 'Galih Test', last_name = 'Test Last' where employee_id = 909";
			update.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Employee> select(){
		List<Employee> returnValue = new ArrayList<Employee>();
		try {
			Statement select = connection.createStatement();
			String query = "select employee_id, first_name, last_name from copy_employees";
			ResultSet employees = select.executeQuery(query);
			while(employees.next()){
				Employee emp = new Employee();
				emp.setEmployeeId(employees.getInt("employee_id"));
				emp.setFirstName(employees.getString("first_name"));
				emp.setLastName(employees.getString("last_name"));
				returnValue.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnValue;
	}
}
