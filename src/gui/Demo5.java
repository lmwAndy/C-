 /*
  * ���ֲ��ֹ�������ʹ��
  * JPnael���÷�
  * 1.JPanel��JComponent������
  * 2.������������������Լ��������
  * 3.Ĭ�ϲ��ֹ���������ʽ���֣�FlowLayout��
  * 
  */


package gui;

import java.awt.*;

import javax.swing.*;

public class Demo5 extends JFrame {
	
	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args)
	{
		Demo5 d=new Demo5();
	}
	
	public Demo5()
	{
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("����");
		jb2=new JButton("ƻ��");
		jb3=new JButton("��֦");
		jb4=new JButton("����");
		jb5=new JButton("����");
		jb6=new JButton("����");
		
		//��������
		
		//���JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//��JPamel����JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//������������
				this.setTitle("��ϲ��ְ���");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//��ֹ�û��ı䴰���С
				this.setResizable(false);
				
				//��ʾ����
				this.setVisible(true);
		
	}

}
