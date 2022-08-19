public class Manager extends Employee {
	
	public static void main(String[] args) {
		Employee emp = new Manager();
		double sal = emp.getSalary();
		System.out.println(sal);

	}
  public static double getSalary(){
    return 20000;
  }
  
}