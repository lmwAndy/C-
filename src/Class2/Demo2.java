/*
 * ������¼�������Ƶ����
 * 1.ͨ���������Ҽ���������һ�������λ��
 * 
 */

package Class2;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class Demo2 extends JFrame {
	MyPanel mp=null;
	public static void main(String[] args)
	{
		Demo2 d=new Demo2();
	}
	
	
	
	
	//����
	public Demo2()
	{
		mp=new MyPanel();
		
		//mp���뵽JFrame
		
		this.add(mp);
		
		this.addKeyListener(mp);
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}


//�����Լ������,Ҳ�Ǽ�����
class MyPanel extends JPanel implements KeyListener
{
	int x=10;
	int y=10;
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.fillOval(x, y, 15, 15);
	}

	//��������
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
		//System.out.println("������"+e.getKeyCode());
		
		if(e.getKeyCode()==KeyEvent.VK_DOWN)
		{
			y+=10;
		
		}else if(e.getKeyCode()==KeyEvent.VK_UP)
		{
			y-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT)
		{
			x-=10;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			x+=10;
		}
		//����repaint();
		this.repaint();
	}

	//�����ͷ�
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	//����һ��ֵ�����
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������
		
	}
}
