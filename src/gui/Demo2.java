/*
 * BorderLayout��ʾ(���ַ�ʽ)
 * 1.�̳�JFrame
 * 2.������Ҫ�����
 * 3.������������캯����
 * 4.���������������ӵ�Ӧ���ŵ�λ��ȥ
 * 5.���ô�������
 * 6.��ʾ����
 */


package gui;
import java.awt.*;
import javax.swing.*;

public class Demo2 extends JFrame {
	
	//�������
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args)
	{
		Demo2 d=new Demo2();
		
	}
	
	public Demo2()
	{
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("����");
		jb4=new JButton("�ϲ�");
		jb5=new JButton("����");
		
		//��Ӹ������
		this.add(jb1,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.EAST);
		this.add(jb4,BorderLayout.SOUTH);
		this.add(jb5,BorderLayout.WEST);
		
		//���ô�������
		this.setTitle("�߽粼�ְ���");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ʾ����
		this.setVisible(true);
	}

}
