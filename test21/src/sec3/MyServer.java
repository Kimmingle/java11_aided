package sec3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class MyServer {

	public static void main(String[] args) {  //서버를 만들기 위해선 포트번호 필요
		BufferedReader in = null;  //(네트워크에 통신데이터를) 읽는 스트림 -입력
		PrintWriter out = null;		//(네트워크에 통신데이터를) 쓰는 스트림 -출력
		
		ServerSocket server = null;  		//서버소켓
		Socket socket = null;				//일반소켓
		
		Scanner sc = new Scanner(System.in);    //키보드로 채팅 입력받음
		
		try {	//외부장치는 try/catch로 감싸줘야한다
			server = new ServerSocket(6005);
			System.out.println("[Server 실행] : Client 연결 대기중입니다. ");
			socket = server.accept();  	//클라이언트가 연결이 가능한 상태
			System.out.println("[Client 연결]");  //Client가 Server를 호출하고 포트번호를 넣어주면 연결
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				String inMsg = in.readLine();
				if ("quit".equalsIgnoreCase(inMsg)) break;  //equalsIgnoreCase:inMsg가 대소문자 상관없이 
					
				System.out.println("[From Client: ]" +inMsg);
				System.out.println("전송>>>");
				
				String outMsg = sc.nextLine(); 
				out.println(outMsg);
				out.flush(); //비우기
				
				if("quit".equalsIgnoreCase(outMsg)) break; 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {  //역순으로 닫기
			sc.close();
			try {
				socket.close();
				server.close();
				System.out.println("연결 종료");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("소켓 통신 종료 오류");
			}
			
		}
		
	}

}
