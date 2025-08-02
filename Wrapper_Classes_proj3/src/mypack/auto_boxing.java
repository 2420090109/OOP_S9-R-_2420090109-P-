package mypack;

public class auto_boxing {
	public static void main(String[] args) {
		int a =789;
		Integer i = Integer.valueOf(a);
		  System.out.println("Wrapper class usage - auto boxing: " + i);
		Double d = Double.valueOf(123.567);
		  System.out.println("Wrapper class usage - auto boxing: " + d);
	}

}
