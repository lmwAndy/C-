/*
 * ��ִ���
 * JSplitpane�������������
 * 
 */


package gui;
import java.awt.*;

import javax.swing.*;
public class Demo9 extends JFrame{
	//�������
	JSplitPane jsp;
	JList jl;
	JLabel jll;
	
	public static void main(String[] args)
	{
		Demo9 d=new Demo9();
	}
	
	public Demo9()
	{
		//�������
		String[] words={"boy","girl","bird"};
		jl=new JList(words);
		
		jll=new JLabel(new ImageIcon("picture/496122017.jpg"));
		//�����ɲ�ִ���
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jl,jll);
		
		//���Ա仯
		jsp.setOneTouchExpandable(true);
		
		//���ò��ֹ�����
		
		//������
		this.add(jsp);
		
		//��������
		this.setTitle("��ִ���");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		
		//��ʾ����
		this.setVisible(true);
	}

}
