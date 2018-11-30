
/**
 * 测试while嵌套
 * @author Administrator
 *
 */

public class TestWhileQianTao {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {		
				System.out.print(i+"\t");				//ln换行
			}
			System.out.println();
		}
		
		System.out.println("####################");
		/**打印99乘法表**/
		for (int n = 1; n <=9; n++) {				//外循环			
			for (int m = 1; m <=n; m++) {			//内循环			当m>n时跳出换行
				System.out.print(m+"*"+n+"="+(m*n)+"\t");
			}
			System.out.println();
		} 
		
		System.out.println("####################");
		/**求100以内奇偶数之和**/
		int sum01 = 0;
		int sum02 = 0;
		
		for (int i = 0 ;i<=100; i++) {
			if (i % 2==0) {
				System.out.println(sum01=sum01+i);
			}else {
				System.out.println(sum02=sum02+i);
			}
		}
		System.out.println("偶数和："+sum01);
		System.out.println("奇数和："+sum02);
		
		/**用while循环打印0-1000能被五整除的数，每行输出五个**/
		int count = 0;			 //count作为计数器 
		
		for (int i = 1; i <=1000; i++) {
			if (i%5==0) {
				System.out.print(i+"\t");
				count++;
			}
			/*
			if (i%25==0) {
				System.out.println();
			}
			*/
			
			if (count==5) {
				System.out.println();
				count=0;
			}
			
		}
	}
}
