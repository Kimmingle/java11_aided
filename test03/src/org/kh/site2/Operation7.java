package org.kh.site2;

public class Operation7 {

	public static void main(String[] args) {
		//대입 연산자 : +=, -=, *=, /=, &=, |=, >>=, <<=, >>>=, ^=, 
		//비트 연산자 : &, |, ~, ^, >>(오른쪽 시프트), <<(왼쪽 시프트)              참고)<<<는 없음
		int a = 20;
		int b = 15;
		int tmp;
		a += b;  // 두개를 더해서 a에 넣어주니까 35
		b -= a;  // a가 35였으니까 15-35 = 20
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		//a와 b의 값을 맞교환
		tmp = a;   
		a = b;
		b = tmp;
		System.out.println("교환 후----------");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		//비트(2진수)연산
		int x = 0b01101;
		int y = 0b01011;
		System.out.println(x);  //이렇게 쓰면 2진수로 안나오니까 
		System.out.println("x="+Integer.toBinaryString(x));	  //이렇게 써줌 toBinaryString는 2진수를 문자열로 바꿔주는 함수임
		System.out.println("y="+Integer.toBinaryString(y));
		System.out.println("x & y : "+Integer.toBinaryString(x & y));
		System.out.println("x | y : "+Integer.toBinaryString(x | y));
		System.out.println("x: "+Integer.toBinaryString(x));
		System.out.println("~x: "+Integer.toBinaryString(~x));  	//not 연산자
		System.out.println("x ^ y : "+Integer.toBinaryString(x ^ y));  //XOR 입력이 서로 다를때만 1
		System.out.println("x >> 2 : "+Integer.toBinaryString(x >> 2));  //오른쪽 시프트 : 오른쪽으로 두번 밀어줌(결과값은 한번 밀때마다 나누기2 한것과 같음)
		System.out.println("x << 2 : "+Integer.toBinaryString(x << 2));  //오른쪽 시프트 : 오른쪽으로 두번 밀어줌(결과값은 한번 밀때마다 나누기2 한것과 같음)


		System.out.println("대입연산자--------------");  
		int i = 25;		//11001
		int j = 30;		//11110
		i &= j;   	//and 연산하면 11000이니까 10진수로 24
		System.out.println("i: "+Integer.toBinaryString(i));
		System.out.println("x &= j : "+i);
		
		i = 25;
		i |= j;    
		System.out.println("i: "+Integer.toBinaryString(i));
		System.out.println("i =| j : "+i);
		
		i = 25;
		i ^= j;    //XOR연산하면 00111
		System.out.println("i: "+Integer.toBinaryString(i));
		System.out.println("i ^= j : "+i);
		
		j  >>= 2;   //1111000
		System.out.println("i: "+Integer.toBinaryString(j));
		System.out.println("i >>= j : "+j);
		
		j = 30;
		j  <<= 2;	
		System.out.println("i: "+Integer.toBinaryString(j)); 
		System.out.println("i <<= j : "+j);
		
		j = 30;
		j  >>>= 2;  
		System.out.println("i: "+Integer.toBinaryString(j));
		System.out.println("i >>>= j : "+j);
		
	}

}
