package mypack;
import java.util.Scanner;

public class string_display_thru_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to display string value through string object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		
		String str_obj = new String(str);
		System.out.println(str_obj);
		/*char ch[] = {'M','u','s','a','i','b'};
		String str1_obj = new String(ch,1,5);
		System.out.println(str1_obj);*/
	}

}
