package sec3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
//배열은 직열 -> array
public class StreamExam {
//Stream : 입출력방식의 제어
	public static void main(String[] args) {
		int[] arr = {95, 80, 100, 85, 90};
		
		int sum = Arrays.stream(arr).sum();
		OptionalDouble avg = Arrays.stream(arr).average();
		OptionalInt max = Arrays.stream(arr).max();
		OptionalInt min = Arrays.stream(arr).min();

		int cnt = (int) Arrays.stream(arr).count();
		
		System.out.println("arr의 합 :" +sum);
		System.out.println("arr의 평균 :" +avg);
		System.out.println("arr의 개수 :" +cnt);
		System.out.println("arr의 최대 :" +max);
		System.out.println("arr의 최소 :" +min);
		
	}
}
