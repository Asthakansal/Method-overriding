package Monday;
import java.util.Scanner;
public class Employee {
	
	private String name;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public String getname()
	{
		return name;
	}
	
public void setname(String name)
{
	this.name=name;
}

public int getsalary()
{
	return salary;

}
public void setsalary(int salary)
{
	this.salary=salary;
}

public String toString() {
	return "Employee [name=" + name + ",salary=\" + salary +]";
}
	
public void login()
{
	Scanner sc=new Scanner(System.in);
	Scanner scStr=new Scanner(System.in);
	System.out.println("enter the name");
	String name=scStr.nextLine();
	System.out.println("enter the salary");
	int salary=sc.nextInt();
	
}

}
