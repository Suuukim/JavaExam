package backjoon;

import java.util.Scanner;

public class Main_11654 {
	public static void main(String[] args) {
		//백준 11654번 문제
		//문제 : 입력으로 주어진 아스키 코드 값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int result = st.charAt(0);
		
		System.out.println(result);
	}
}
