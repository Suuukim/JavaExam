package backjoon;

import java.util.Scanner;

public class Main_2739{

	public static void main(String[] args) {
		//백준 : 2739번 문제
		//문제 : 출력형식과 같게 N*1 부터 N*9까지 출력한다.
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		sc.close();
		
		for(int i=1;i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
			
		}
		
	}
}
