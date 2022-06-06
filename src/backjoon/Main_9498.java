package backjoon;

import java.util.Scanner;

public class Main_9498{

	public static void main(String[] args) {
		//백준 : 9498번 문제
		//문제 : 시험성적을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if (score >= 90) {
			System.out.println('A');
		} else if (score >= 80) {
			System.out.println('B');
		} else if (score >= 70) {
			System.out.println('C');
		} else if (score >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}
}
