/*
 * ���ܣ���ʽ���ְ���
 * 
 * 
 */


package gui;

import java.awt.*;
import javax.swing.*;


public class Demo3 extends JFrame{
	
	//�������
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args)
	{
		Demo3 d=new Demo3();
	}
	
	//���캯��
	public Demo3()
	{
		//�������
		jb1=new JButton("·��");
		jb2=new JButton("��¡");
		jb3=new JButton("����");
		jb4=new JButton("ɽ��");
		jb5=new JButton("ƭ�˲�");
		
		//������
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		
		
		//���ò��ֹ�����
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//������������
		this.setTitle("��ʽ���ְ���");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		
		//��ʾ����
		this.setVisible(true);
		
	}

}

