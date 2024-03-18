package sec2;

import java.awt.Toolkit;

//스레드(thread): 현재 컴퓨터에서 실행중인 프로그램 (작업)
//스레드는 발생(new Thread) -> 실행대기(Runnable()) -> cpu에 점유(실행되기 위해서)(run) -> 대기(Runnable()) -> 종료
//실행상태에서 실행 대기모드로 바뀜 : sleep 
//실행대기에서 실행상태로 바뀌면 : wake up(run)
public class ThreadExam1 {

	public static void FirstThread() {
		System.out.println("첫 번째 쓰레드");
	}
	
	public static void SecondThread() {
		System.out.println("두 번째 쓰레드");
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {   //0~9까지 카운트할거임
			System.out.println(i);
//			toolkit.beep();
			try {
				Thread.sleep(1000);  //1초 지연 (실행에서 실행 대기로)
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {  //생성(new Thread) 후 실행대기(Runnable)

			@Override
			public void run() {
				FirstThread();  //실행할(run(실행 대기에서 실행으로)) 내용 (여기선 따로 뺌)
			}
			
		});		//실행가능한 작업
		
		thread1.run();
		thread1.start();
		System.out.println(thread1.getName());
		
		Thread thread2 = new Thread( new Runnable() {  		//Runnable로 run
			
			@Override
			public void run() {
				SecondThread();
			}
		});
		thread1.start();  //스레드 시작
	}

}
