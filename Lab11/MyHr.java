package ie.ITCarlow.OOSD.Lab11;

public class MyHr {

	public static void main(String[] args) {
		int index=0;
		
		
		Office office1=new Office();
		Office office2=new Office();
		Office office3=new Office();
		
		Address ad1 = new Address( "Agra", "UP", "India");
		Employee emp1=new Employee("john", ad1/*,office1*/);
		
		Address ad2 = new Address( "Agra", "UP5656788", "India");
		Employee emp2=new Employee("mark", ad2/*, office2*/);
		
		Address ad3 = new Address( "Agrffvfvva", "UP5656788", "India");
		Employee emp3=new Employee("Jim", ad3/*, office3*/);											//Employees&addresses
		
		Address ad4 = new Address( "Agradhjfjhnf", "UP5656788", "Indiana");
		Employee emp4=new Employee("Sarah", ad4/*, office1*/);
		
		Address ad5 = new Address( "Agrahfhjhfef", "UP5656788", "South Africa");
		Employee emp5=new Employee("Louisa",ad5/*, office2*/);
		
		System.out.println(emp1.empAddr.getAddress()); //This Works
		System.out.println(emp2.empAddr.getAddress()); //This Works
		System.out.println(emp3.empAddr.getAddress()); //This Works
		System.out.println(emp4.empAddr.getAddress()); //This Works
		System.out.println(emp5.empAddr.getAddress()); //This Works
		emp1.assignToOffice(office1);
		emp2.assignToOffice(office3);
		//emp3.assignToOffice(office3);
		emp4.assignToOffice(office2);
		System.out.println(Office.getOffRec());
		System.out.println(emp1.getEmpInOff());
	}

}
