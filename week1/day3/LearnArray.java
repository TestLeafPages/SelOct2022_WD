package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] score= {80,78,9,45,9,8,87,89,90,1,4,6,
				8,4,7,9,0,4,6,8,9,5,9,34,56,9,23,243,46657,77,76,9,68,657};
		/*
		 * //length---.property or vaiable
		 * 
		 * int length = score.length; System.out.println("total values: " +length);
		 * 
		 * //get the first value
		 * 
		 * System.out.println("myfirst values : "+score[0]); // get the last value
		 * 
		 * System.out.println("mylast values :"+score[length-1]);
		 */
		Arrays.sort(score);
//		for(int i=score.length-1;i>=0;i-- ) {
//			System.out.println(score[i]);
//		}
		
//		for(int i=0;i<=score.length-1;i++) {
//			System.out.println(score[i]);
//		}
		///how many 9 in array
		int find=9;
int count=0;
int length = score.length;

for(int i=0;i<length;i++) {
	if(score[i]==find) {
		count++;
		// break;
	}
}
		System.out.println("total num of 9 present in it :"+count);
		
	}

}
