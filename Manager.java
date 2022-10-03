package Monday;

public class Manager extends Employee {
	String product;
	int noofsales;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String product,int noofsales,String name,int salary) {
		super(name,salary);
		this.product = product;
		this.noofsales=noofsales;
		
	}
	
	public String getproduct()
	{
		return product;
	}
	
	public void setproduct(String product)
	{
		this.product=product;
	}
	public int getnoofsales()
	{
		return noofsales;
	}
	public void setnoofsales(int noofsales)
	{
		this.noofsales=noofsales;
	}
	
	public String toString() {
		return "Manager [product=" + product + ",noofsales=\" + noofsales +]";
	}
	
	@Override
	public void setsalary(int incentive) {
		int previousSalary = super.getsalary();
		
		super.setsalary(super.getsalary()+incentive);
}
	
}
