package app;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ex5 extends JFrame implements ActionListener{
	JLabel id_la, pw_la;
	JTextField id_tf, pw_tf;
	JButton login, join;
	public Ex5() {
		super("GUI");
		id_la = new JLabel("ID"); 
		pw_la = new JLabel("PW");
		id_tf = new JTextField(); 
		pw_tf = new JTextField();
		login = new JButton("로그인");
		join = new JButton("회원가입");
		Panel p = new Panel();
		Panel p2 = new Panel(new GridLayout(2, 2));
		p.setLayout(new GridLayout(1, 2));
		p.add(login);
		p.add(join);
		p2.add(id_la);
		p2.add(id_tf);
		p2.add(pw_la);
		p2.add(pw_tf);
		add(p, "South");
		add(p2, "Center");
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		login.addActionListener(this);
	}
	public static void main(String[] args) {
		new Ex5();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("확인");
	}
}
