package koreait.day0127;

import java.util.Scanner;

public class Main_10869 {
	public static void main(String[] args) {
		//백준 10869번 문제
		//문제 : 두 자연수 A와 B가 주어진다. 이떄, A+B, A-B, A*B, A/B(몫),
		//     A%B(나머지)를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
}