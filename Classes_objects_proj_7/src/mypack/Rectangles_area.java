package mypack;
/*Write a class Rectangle with data members length and breadth. 
  Add methods to calculate and return the area and perimeter.
   Create objects of Rectangle and demonstrate the results.
 */
class Rectangle{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length =length;
		this.breadth = breadth;
		
	}
	double area() {
		double res = length*breadth;
		return res;
	}
	double perimeter() {
		double per = (2*(length + breadth));
		return per;
	}
	
}


public class Rectangles_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle(12,10);
		double area = r.area();
		Rectangle r1 =new Rectangle(12,10);
		double per = r1.perimeter();
		Rectangle r2 =new Rectangle(1.0,5.0);
		double area1 = r2.area();
		Rectangle r3 =new Rectangle(4.0,5.0);
		double per1 = r3.perimeter();
		System.out.println("Area of Rectangle: " + area);
		System.out.println("Perimeter of Rectangle: " + per);
		System.out.println("Area of Rectangle: " + area1);
		System.out.println("Perimeter of Rectangle: " + per1);
		

	}

}
