package principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

// 客戶端
public class Demeter1 {

	public static void main(String[] args) {

		System.out.println("~~使用迪米特法則的改進~~");
		// 創建了一個 schoolManager 對象
		SchoolManager schoolManager = new SchoolManager();
		// 輸出學院的員工id 和 學校總部的員工訊息
		schoolManager.printAllEmployee(new CollegeManager());
	}
}

// 學校總部員工類
class Employee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

// 學院員工類
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

// 管理學院員工的管理類
class CollegeManager {
	// 返回學院的所有員工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
		for (int i = 0; i < 10; i++) { // 這裡我們增加了10個員工到 list
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("學院員工id= " + i);
			list.add(emp);
		}
		return list;
	}

	// 輸出學院員工的信息
	public void printEmployee() {
		// 獲取到學院員工
		List<CollegeEmployee> list1 = getAllEmployee();
		System.out.println("-------------學院員工-------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

// 學校管理類
class SchoolManager {
	// 返回學校總部的員工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();

		for (int i = 0; i < 5; i++) { // 這裡我們增加了5個員工到 list
			Employee emp = new Employee();
			emp.setId("學校總部員工id= " + i);
			list.add(emp);
		}
		return list;
	}

	// 該方法輸出學校總部和學院員工訊息(id)
	void printAllEmployee(CollegeManager sub) {

		// 分析問題
		// 1. 將輸出學院員工方法，封裝到 CollegeManager
		sub.printEmployee();

		// 獲取到學校總部員工
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("-------------學校總部員工-------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}

}