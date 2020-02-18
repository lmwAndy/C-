/*
 * 加深对事件处理机制的理解
 * 1.通过上下左右键，来控制一个先求的位置
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
	
	
	
	
	//构造
	public Demo2()
	{
		mp=new MyPanel();
		
		//mp加入到JFrame
		
		this.add(mp);
		
		this.addKeyListener(mp);
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}


//定义自己的面板,也是监听者
class MyPanel extends JPanel implements KeyListener
{
	int x=10;
	int y=10;
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.fillOval(x, y, 15, 15);
	}

	//键被按下
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		//System.out.println("被按下"+e.getKeyCode());
		
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
		//调用repaint();
		this.repaint();
	}

	//键被释放
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

	//键的一个值被输出
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}
}
