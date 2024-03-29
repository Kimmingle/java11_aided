package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

   public static void main(String[] args) {
	   
      Scanner sc = new Scanner (System.in);
      ArrayList <String> nameList = new ArrayList<String>();  
      
      while(true) {
         System.out.print("추가할 이름을 입력하세요 : ");
         String name = sc.next();
         
         if (name.equals("clear")) { 			//== x  string 비교는 equals()써야함 
            System.out.println("이름 목록을 초기화 합니다.");  //순서
            nameList.clear();
            continue;  //실행 부분보다 앞서있어서 뒷 문장이 실행되지 않는다. 
         }
         
         if (name.equals("exit")) {			//if x
            System. out.println("<<입력 종료>>");
            
            break;			//return;하면 exit가 입력될 경우 main 함수의 밖으로 탈출해버림
         }
         if(nameList.contains(name)) {
            System. out.println("<이미 존재하는 이름입니다>");
         }
         else {
            System. out.println(name +" 추가 완료.");
            nameList.add(name);  		//이름 목록nameList에 이름을 추가하는 구현코드 누락으로 인해 추가하지 못함
         }
      }
      
      for(String name : nameList) {
         System.out.println(name);
      }
   }
}
