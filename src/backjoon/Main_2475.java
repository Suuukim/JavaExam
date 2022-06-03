package backjoon;

import java.util.Scanner;

public class Main_2475 {
	public static void main(String[] args) {
		//백준 2475번 문제
		//문제 : 첫째 줄에 검증수를 출력한다.
		Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            sum += temp * temp;
        }

        int result = sum % 10;
        System.out.println(result);
		
	}
}
