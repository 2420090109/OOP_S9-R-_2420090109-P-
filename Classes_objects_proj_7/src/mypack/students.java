package mypack;


		// TODO Auto-generated method stub
		class Student{
			 int rollno;
			 String name;
			 double marks;
		 
		 Student(int rollno,String name,double marks){
			 this.rollno = rollno;
			 this.name =name;
			 this.marks = marks;
			 
		 }
		 void display(){
			 System.out.println("Student name: " + name + " roll no: " + rollno + " Marks: "+ marks);
			 
		 }
		 }
		public class students {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
			
				
				Student s1 = new Student(243,"Musaib",89.6);
				s1.display();
				Student s2 = new Student(102,"Satya",78.9);
				s2.display();
				Student s3 = new Student(115,"Pranay",99.0);
				s3.display();
			        
				
				
				
		

			}

		}


