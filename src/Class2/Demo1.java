/*
 * �����¼�������ƣ�һ���¼������ж��������,һ���Ƕ���
 * 1.һ����Ҫʵ�ּ����Ĳ���
 * a.ʵ����Ӧ�Ľӿ�{KeyListener,MouseListener,ActiongListener,WindowListener}
 * b.�ɽӿڵĴ�����������Ҫ���±�д��Override��
 * c.���¼�Դ��ע�����
 * d.�¼������ǿ��¼���
 * 
 */

package Class2;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class Demo1 extends JFrame implements ActionListener{
	//����һ��panel
	JPanel mp=null;
	JButton jb1,jb2;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	public Demo1()
	{
		mp=new JPanel();
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		
		//����è�����
		Cat cat=new Cat();
		
		//ע�����,����ע����������
		jb1.addActionListener(this);
		jb1.addActionListener(cat);
		//ָ��action����
		jb1.setActionCommand("��ɫ");
		jb2.addActionListener(this);
		jb2.addActionListener(cat);
		jb2.setActionCommand("��ɫ");
		
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//���¼�����ķ���
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		System.out.println("ok");
		
		//�ж����ĸ���ť�����
		if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("������ɫ��ť��");
			mp.setBackground(Color.black);
			
			
		
	}else if(e.getActionCommand().equals("��ɫ"))
	{
		System.out.println("�����˺�ɫ��ť");
		mp.setBackground(Color.red);
	}else{
		System.out.println("��֪��");
	}

}
}
	
	
//����è�������
class  Cat extends JFrame implements ActionListener 
{
	
	JPanel mp=new JPanel();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getActionCommand().equals("��ɫ"))
		{
			System.out.println("è��Ҳ֪�������ɫ��ť��Ŷ��");
			
			mp.setBackground(Color.black);
			
		
	}else if(e.getActionCommand().equals("��ɫ"))
	{
		System.out.println("è���ҿ���֪�������˺�ɫ��ťŶ��");
		mp.setBackground(Color.red);
	}else{
		System.out.println("��֪��");
	}
	}
	
}

/*class MyPanel extends JPanel
{
	public void paint(Graphics g)
	{
		super.paint(g);
		g.fillRect(0, 0, arg2, arg3);
		
	}*/
	
