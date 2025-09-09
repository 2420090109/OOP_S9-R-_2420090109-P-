package mypack;
/*Create a class Employee with data members id, name, and salary. 
In the constructor, use parameter names same as instance variable names 
and resolve ambiguity using the this keyword. Display employee details.*/
class Employees{
	int id;
	String name;
	double salary;

Employees(int id,String name,double salary){
	this.id=id;
	this.name =name;
	this.salary =salary;
	
}
void display(){
	System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary);
	
}
}
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e = new Employees(120,"Musaib",1200);
		Employees e1 = new Employees(190,"rohan",1900);
		System.out.println("---- Employee Details-----");
		e.display();
		e1.display();
		
		

	}

}
