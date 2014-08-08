package examples;

public class MyString {

	public static void main(String[] args) {
		String str0 = new String("Hello World!");
		String str1 = "A";
		String str2 = "a";
		String str3 = "I am Jack";
		
		
		
		System.out.println("str0: " + str0 + ", str1: " + str1 + ", str2: " + str2 + ", str3: " + str3);
		System.out.println("str0.charAt(4): " + str0.charAt(4));
		System.out.println("str0.codePointAt(4): " + str0.codePointAt(4));
		System.out.println("str1.compareTo(str2): " + str1.compareTo(str2) + " if<0 - A < a");
		System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2) + " if=0 - A = a");
		System.out.println("str0.concat(str3) " + str0.concat(str3));
		System.out.println("str3.contains(str2) " + str3.contains(str2));
		
		System.out.println("String: " + str0);

	}

}
