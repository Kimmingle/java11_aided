package sec1;

public class Scanner01 {
	
	int no;
	int kor;
	int eng;
	int mat;
	
	public Scanner01() {}
	
	public Scanner01(int no, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	
	
	public String hh(){					//학점
		String hh = "e";
		if(this.avg() >= 90) hh = "A";
		else if (this.avg() >= 80) hh = "B";
		else if (this.avg() >= 70) hh = "C";
		else if (this.avg() >= 60) hh = "D";
		else hh = "F";
		return hh();
		
	}
	
	public int tot(){					//총점
		//int tot = (this.kor+this.eng+this.mat);
		return (this.kor+this.eng+this.mat);
		//System.out.println("총점 : "+tot);
	}
	
	public double avg(){					//평균
		//double avg = (kor+eng+mat)/3;
		return (this.tot()/3.0f);
		//System.out.println("평균 : "+avg);
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

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
	
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\n%d\n%.1f%s\n", this.no, this.kor, this.eng, this.mat, this.tot(), this.avg(), this.hh());
		
	}

}
