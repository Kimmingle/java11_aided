package sec3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();  //IPInfo객체를 관리하는 ArrayList
		//리스트는 인터페이스니까 객체 못만듦 - ArrayList로 생성해야 하지만, null로 대입하였으므로 
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.111.222", "어쩌고"));  //하나 빠짐
		ipInfoList.add(new IPInfo("111.151.155.333", "고길순"));
		
		
		
		System.out.println("ip 입력  :");
		double ip = sc.nextInt();
		
		if (ip == ipInfoList.indexOf(0)) {
			System.out.println("홍길동");
			System.out.println("일치하는  ip사용자가 있습니다.");
		} else if (ip == ipInfoList.indexOf(1)) {
			System.out.println("어쩌고");
			System.out.println("일치하는  ip사용자가 있습니다.");
		} else if (ip == ipInfoList.indexOf(2)) {
			System.out.println("고길순");
			System.out.println("일치하는  ip사용자가 있습니다.");
		}
	
		
		
//		for(int i=0; i<ipInfoList.size(); i++) {
//			if(ipInfoList.get(i).getIp().equals(ip)) { 		   
//				System.out.println("일치하는  ip사용자가 있습니다.");
//				System.out.println(ipInfoList.get(i));
//				break;
//				
//			}else {
//				System.out.println("일치하는  ip사용자가 없습니다.");
//				break;
//			}
//		}	
	}
}
