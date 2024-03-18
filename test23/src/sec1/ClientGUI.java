package sec1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginGUI extends JFrame implements ActionListener, KeyListener{
	
	JPanel  port_log = new JPanel();
	JLabel port_user = new JLabel("유저 입력");
	JTextField port_num1 = new JTextField(20);
	JLabel port_port = new JLabel("포트 입력");
	JTextField port_num2 = new JTextField(20);
	JLabel port_addr = new JLabel("주소 입력");
	JTextField port_num3 = new JTextField(20);
	JButton port_btn = new JButton("접속!");
	
	
	public LoginGUI() {
		setTitle("로그인 화면");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
		setResizable(true);
		
		port_btn.addActionListener(this);
		port_num1.addKeyListener(this);
		port_log.add(port_user);
		port_log.add(port_num1);
		port_num1.addKeyListener(this);
		port_log.add(port_port);
		port_log.add(port_num2);
		port_num2.addKeyListener(this);
		port_log.add(port_addr);
		port_log.add(port_num3);
		port_num3.addKeyListener(this);
		port_log.add(port_btn);
		add(port_log);
		setResizable(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


public class ClientGUI {

	public static void main(String[] args) {
		new LoginGUI();
	}

}
