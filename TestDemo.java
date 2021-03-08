import java.util.Scanner;
public class TestDemo{
	
/**
 * 
 * 输出1到100之间的素数
 * @param args [description]
 */
	public static void main(String[] args) {
		int i=1;
	   
		for(;i<101;i++){ 
			boolean Hl = true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					Hl = false;
					break;
				}
			}
			if(Hl){
				System.out.println(i);
		}
	}

}

/**
 * 判断一个数是不是素数
 * 
 * @param args [description]
 */

	public static void main4(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input  = sc.nextInt();
		int i=2;
		for(;i<input;i++){
			if(input%i==0){
				System.out.println("是素数");
				System.exit(0);
			}

		}
		System.out.println("不是素数");
		sc.close();


	}
/**
 * 
 * 输入年龄，输出年龄段
 * @param args [description]
 */



     public static void main3(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if(age<19){
		System.out.println("少年");
	}else if(age>18 & age<29){
		System.out.println("青年");
	}else if(age>28 & age<56){
		System.out.println("中年");
	}else 
	    System.out.println("老年");
	    sc.close();

}
/**
 * 
 * 实现求三个数的最大值
 * @param args [description]
 */

public static void main2(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int max=a>b?a:b;
		max=max>c?max:c;
		
		System.out.println(max);
	}	

/**
 * 实现，a，b变量的值交换
 * @param args [description]
 */



	public static void main1(String[] args) {
		int a=10;
		int b=20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}