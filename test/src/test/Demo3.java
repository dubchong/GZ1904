package test;

/**
 * 用函数递归计算如下的通式。
	 1 - 1/3 + 1/5 - 1/7 + 1/9 ... + 1/n;

 * @author dubai
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		Demo3 d = new Demo3();

		System.out.println(d.Sum(1000));
		
		System.out.println("====用非递归验证用函数递归计算结果====");
			double result = 0;
			for(int i = 1, j = 1; i <= 1000; i++){
			if(i % 2 == 0){
			result = result - 1/(double)j;
			}else{
			result = result + 1/(double)j;
			}
			j = j + 2;
			}
			System.out.println(result);

		
	}

	public double Sum(double i) {
		double sum = 0;
		if (i == 1) {
			sum = 1;
		} else {

			if (i%4 == 1 ) {
				sum = (1 / i + Sum(i - 1));
			}else{
				if (i % 2 == 1) {
					sum = (-1 / i + Sum(i - 1));
				}else {
					sum =  Sum(i - 1);
				}
			}
		}

		return sum;

	}
	

	
}
