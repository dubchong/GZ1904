package test;

public class Demo2 {
	public static void main(String[] args) {
		int y;
		for (int i = 1; i <=100; i++) {
			y = i%2;
			if (y==1) {
				System.out.println("奇数："+i);
			}else {
				System.out.println("偶数："+i);
			}
		}
	}
}
