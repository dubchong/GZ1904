package day2;

/**
 * Âß¼­ÔËËã·û
 * @author dubai
 *
 */

public class Demo8 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println((a>b)||(c>b));  //false||true   true
		
		System.out.println((a>b)&&(c>b));  //false&&true   false
		
		System.out.println("======");
		
		boolean d = true;
		
		System.out.println(!d);
		
		System.out.println("======");
		
		System.out.println((a>b)^(b>c));
		
		System.out.println((a>b)^(c>b));
				
	}

}
