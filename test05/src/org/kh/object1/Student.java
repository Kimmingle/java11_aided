package org.kh.object1;

public class Student {

	String name;
	int kor, eng, mat ;								// 여기서 디폴트 값을 지정할 수도 있음. studentEx에서 값을 새로 지정해주면 바뀜.
	//int tot = 1;												// 쇼핑몰에 기본 수량 1 되어있는게 이런 원리.
	
	
	
	public int tot() {
		return this.kor + this.mat + this.eng;
	}
	public float avg() {
		return (this.kor + this.mat + this.eng) / 3.0f;
	}
	
	
	void resulting() {
		
		System.out.println( this.name+"의 국어 점수: "+this.kor);
		System.out.println(this.name+"의 영어 점수: "+this.eng);
		System.out.println(this.name+"의 수학 점수: "+this.mat);
		System.out.println(this.name+"의 총점수: "+tot());
		System.out.println(this.name+"의 평균: "+avg());
		
		
		
	}
	



}
