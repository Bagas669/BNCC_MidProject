package main;

import java.util.Scanner;
import database.Database;
import database.Employee;

public class Main {
	
	public Main() {
		Scanner scan = new Scanner(System.in);
		Database database = new Database();
		
		int option = 0;
		do {
			System.out.println("Menu:");
			System.out.println("1. Input Data");
			System.out.println("2. View Data");
			System.out.println("3. Update Data");
			System.out.println("4. Delete Data");
			System.out.println("5. Exit");
			option = scan.nextInt();
			
			switch (option) {
			case 1: {
				String name;
				System.out.print("Input nama karyawan [>= 3]: ");
				scan.nextLine();
				name = scan.nextLine();
				
				String gender;
				System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case sensitive): ");
				gender = scan.nextLine();
				
				String job;
				System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case sensitive): ");
				job = scan.nextLine();
				
				Employee employee = new Employee(name, gender, job);
				database.inputEmployees(employee);
				break;
			}
			case 2: {
				database.viewEmployees();
				break;
			}
			case 3: {
				database.viewEmployees();
				System.out.println("Input nomor urutan karyawan yang ingin diupdate: ");
				
				int update = scan.nextInt();
				scan.nextLine();
				
				String name;
				System.out.print("Input nama karyawan [>= 3]: ");
				name = scan.nextLine();
				
				String gender;
				System.out.print("Input jenis kelamin [Laki-laki | Perempuan] (Case sensitive): ");
				gender = scan.nextLine();
				
				String job;
				System.out.print("Input jabatan [Manager | Supervisor | Admin] (Case sensitive): ");
				job = scan.nextLine();
				
				Employee employee = new Employee(name, gender, job);
				database.updateEmployees(update-1, employee);
				break;
			}
			case 4: {
				database.viewEmployees();
				System.out.println("Input nomor karyawan yang ingin dihapus");
				
				int remove = scan.nextInt();
				scan.nextLine();
				database.deleteEmployees(remove-1);
				break;
			}
			case 5: {
				System.out.println("Terima kasih!");
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
			}
			
		} while(option < 5 && option > 0);
	}

	public static void main(String[] args) {
		new Main();

	}

}
