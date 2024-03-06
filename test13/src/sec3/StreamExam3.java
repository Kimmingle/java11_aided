package sec3;

import java.util.Arrays;
import java.util.function.BinaryOperator;



class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		
		if (s1.getBytes().length >= s2.getBytes().length) return s1;
		
		else return s2;
	}
	
	
	
	
}



public class StreamExam3 {
//reduce() 활용하기
// 예시 )여러 문자열의 배열에서 가장 글자수가 많은 (2진수값이 가장 큰)문자열을 찾아 반환하는 
//binaryOPeratorm : 문자든 숫자든 모두 2진수로 변환하여 비교하거나 처리할때 사용되는 인터페이스 
	

	public static void main(String[] args) {
		String[] arr = {"sssd", "efefef", "ewdwdw", "sfwwe"};
		System.out.println(Arrays.stream(arr).reduce("", (s1, s2)-> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		}));
		System.out.println("바이너리 오퍼레이터를 활용한 리듀스 ");
		String res = Arrays.stream(arr).reduce(new CompareString()).get();
		System.out.println(res);
	}

}
