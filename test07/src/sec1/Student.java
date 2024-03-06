package sec1;


//번호, 국어점수, 영어점수, 수학점수
//사용자 정의 메소드 : getter, setter, 평균, 총점, 학점
public class Student {
	
	int num ;
	int kor ;
	int eng ;
	int mat ;
	
	
	private static Student instance;		//정적 객체 선언
	private Student() {}					// 외부에서 생성할 수 없도록 private
	public static synchronized Student getInstance() {	
		if (instance == null) instance = new Student();
		return instance;
	}
	
	public void tot(){
		int tot = (num+kor+eng+mat);
		System.out.println("총점 : "+tot);
	}
	
	public double avg(){
		double avg = (num+kor+eng+mat)/4;
		return avg;
		
	}
	
	public String hak(){
		String h = "e";
		if(this.avg() >= 90) h = "A";
		else if (this.avg() >= 80) h = "B";
		else if (this.avg() >= 70) h = "C";
		else if (this.avg() >= 60) h = "D";
		else h = "F";
		return h;
		
		//System.out.println("학점 : "+h);
	}
	
	
	public Student(int num, int kor, int eng, int mat) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	

	public void print() {
		System.out.println();
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "Studnt [num=" + num + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
	
	
	

}
