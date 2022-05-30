package koreait.day0127;

import java.util.Arrays;

public class ProgramTest1 {
	public static void main(String[] args) {
		// 최대값 찾는 코딩.
		int[] iarr = {67,45,98,34,83}; 
		int max = 0;
		for(int i=0;i<iarr.length;i++) {
			if(max < iarr[i])
				max = iarr[i];
		}
		System.out.println("iarr 배열에 저장된 최대값 : " + max);
		
	}
}