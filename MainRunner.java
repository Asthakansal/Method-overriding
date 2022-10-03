package Monday;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accountant accountant=new Accountant("Astha",1500,"TaxFile");
		accountant.worksOnTaxFile();
		
		Project facebook=new Project("facebooks Advertisements",15);
		Developer developer=new Developer(facebook,"Meta","Ramesh",1500);
		developer.worksOnProject();
		
		Manager manager=new Manager("ABC",10,"XYZ",3000);
		manager.setsalary(200);
		int s=manager.getsalary();
		System.out.println(s);
		

	}

}
