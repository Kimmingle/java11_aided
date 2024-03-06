package sec2;

public class StudentExample {

	public static void main(String[] args) {
		//실행하는 클레스 
		
		Student s1 = new Student("김민아", 1, 100000);
		Student s2 = new Student("김민희", 2, 200000);
		Student s3 = new Student("김민경", 3, 300000);
		
		Bus b1 = new Bus(010);
		s1.takeBus(b1);
		s1.print();
		b1.show();
		
		//이원석 학생이 버스 (101)를 두번 이용하고, 지하철을 2호선을 세번 이용하였을 경우 
		//이원석 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력하라
		
	}

}
