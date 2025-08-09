package mypack;

public class StringBuffer_all_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Length: " + sb.length());
		System.out.println("Append: " + sb.append(" World"));
		System.out.println("Insert: " + sb.insert(0, "Java "));
		System.out.println("Delete: " + sb.delete(0, 4));
		System.out.println("Replace: " + sb.replace(0, 6, "JAVA"));
		System.out.println("Insert: " + sb.insert(10," MADAM "));
		System.out.println("Delete: " + sb.delete(10, 16));
		System.out.println("Replace: " + sb.replace(11,16,"GOD"));
		System.out.println("Substring:(first index,last index) = " + sb.substring(5,10));
		System.out.println("Substring: (first index) =" + sb.substring(11));
		System.out.println("Delete charAt: " + sb.deleteCharAt(10));
		System.out.println("Capacity: " + sb.capacity());
		 sb.setCharAt(4, 'k');
		System.out.println("SetCharAt: " + sb );
		System.out.println("CharAt: " + sb.charAt(2));
		System.out.println("toString() : " + sb.toString());
		System.out.println("Reverse: " + sb.reverse());
		sb.ensureCapacity(50);
		System.out.println("ensureCapacity(): " + sb.capacity());
		sb.setLength(5);
		System.out.println("setLength(): " + sb);
		

	}

}
