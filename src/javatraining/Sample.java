package javatraining;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		knock7(0,100);
		maxInThreeInt(3, 2, 1);
		decimalToBinary(23123);
		squareRoot(12);
		divisors(12);
		tellEvenOrOdd();
	}
	
	//1. 输出1到100中能被7整除或者个位数是7的数字
	static void knock7(int start_num, int end_num){
		
		for (int i = start_num; i <= end_num; i++) {
			if (i != 0 && (i%7 == 0 || i%10 == 7)){
				System.out.printf("%d ",i);
			}
		}
		
	}
	
	//2. 有3个整型变量a,b,c，编写程序求3个数中的最大值
	static void maxInThreeInt(int one, int two, int three){
		
		int max = one;
		
		if (max < two) {
			max = two;
		}
		if (max < three) {
			max = three;
		}
		
		System.out.println(max);
	}
	
	//3. 编写一个程序把十进制的数转换成一个二进制的数
	static void decimalToBinary(int decimal){
		
		String binary = "";
		
		for (int i = decimal; i != 0; i/=2) {
			binary = i%2 + binary ;	
		}
		
		//System.out.println(Integer.toBinaryString(decimal));
		System.out.println(binary);
		
	}
	
	//4. 编写一个程序计算正整数的平方根
	static void squareRoot(int num){
		
		System.out.println(Math.sqrt(num));
		
	}
	
	//5. 编写一个程序计算正整数的约数
	static void divisors(int num){
		
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				System.out.printf("%d ",i);
			}
		}
		
	}
	
	//6. 根据用户输入，输出“偶数”或者“奇数”
	static void tellEvenOrOdd(){
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while(true){
			
			System.out.println("Input an integer(input -1 to quit):");
			num = scanner.nextInt();
			if (num == -1) {
				return;
			}
			if(num%2 == 0){
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

	}
	
}
