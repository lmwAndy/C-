/*
 * ���ܣ�gui���濪����ʾ����swing���
 * ���裺
 * 1.�̳�JFrame
 * 2.������Ҫ�����
 * 3.�������
 * 4.���ò��ֹ�����
 * 5.������
 * 6.��ʾ����
 * .���ֹ������������������еĿؼ���
 */


package gui;

//�����
import java.awt.*;
import javax.swing.*;  
public class Demo1 extends JFrame {
	
	//����Ҫ��swing�������������,�ɳ�ʼ�����ڹ��췽���� 
	JButton jb1=null;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	//���캯��
	public Demo1()
	{
		
				//����һ��Button��ť
				jb1=new JButton("���ǰ�ť");
				
				//���JButton���
				this.add(jb1);
				
				//���������ñ���
				this.setTitle("MyFrist Gui!");
				
				//���ô�С,������
				this.setSize(800,600);
				
				//���ó�ʼλ��
				this.setLocation(500, 200);
				
				//���õ��رմ��ڵ�ʱ�򣬱�֤jvmҲ�˳�
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//��ʾ
				this.setVisible(true);
				
	}

}
