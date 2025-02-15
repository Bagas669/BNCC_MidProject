package database;

import java.util.ArrayList;
import java.util.Scanner;

public class Database {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void inputEmployees(Employee employee) {
		employees.add(employee);
	}
	
	public void viewEmployees() {
		if (employees.isEmpty()) System.out.println("Data kosong");
		else {
			for (int i = 0; i < employees.size(); i++) {
				System.out.println(i+1 + "  " + employees.get(i).name + "  " + employees.get(i).gender + "  " + employees.get(i).job);
			}
		}
	}
	
	public void updateEmployees(int x, Employee employee) {
		employees.set(x, employee);
	}
	
	public void deleteEmployees(int x) {
		employees.remove(x);
		
		System.out.println("Karyawan berhasil dihapus");
	}
}
