package test02;

public class maopao {

	public static void main(String[] args) {
		/*int[] arr= {6,3,8,2,9,1};
		
		System.out.println("����ǰ����Ϊ��");
		
		for (int num:arr){
			System.out.print(num+" ");
		}
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
		
		System.out.println();
		
		System.out.println("����������Ϊ��");
		
		for(int num:arr){
			System.out.print(num+ " ");
		}
*/
		
		System.out.println("=========");
		
		int[] arr ={8,5,2,1,4};
		System.out.print("����ǰ�����飺");
		for(int num:arr){
			System.out.print(num+" ");
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("���������飺");
		for(int num:arr){
			System.out.print(num+" ");
		}
	}

}
