/*
 * ���񲼾���ʾ
 * 
 */


package gui;

import java.awt.*;

import javax.swing.*;

public class Demo4 extends JFrame{
	
	int size=10;
	//�������,������
	JButton arr[]=new JButton[size];
	
	public static void main(String[] args)
	{
		Demo4 d=new Demo4();
	}
	
	//���캯��
	public Demo4()
	{
		//�������,������
		for(int i=0;i<size;i++)
		{
			arr[i]=new JButton(String.valueOf(i));
			
			this.add(arr[i]);
		}
		
				
				
				
				//�������񲼾ֹ�����
				this.setLayout(new GridLayout(4,3,10,10));
				
				//������������
				this.setTitle("���񲼾ְ���");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//��ֹ�û��ı䴰���С
				this.setResizable(false);
				
				//��ʾ����
				this.setVisible(true);
				
	}

}
