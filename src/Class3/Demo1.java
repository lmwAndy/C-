/*
 * 总结-事件编程步骤
 * 1.编写事件处理类
 * 2.根据需求给事件处理类实现监听器接口
 * 3.在事件处理类中重写（实现）其事件处理的函数
 * 4.在事件源类中指定该事件的监听器（响应者）是谁，即注册监听
 * 
 * 
 */
package Class3;
/*
 * 实现多个监听者
 * 
 */

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Demo1 extends JFrame {
	
	MyPanel mp=null;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	public Demo1()
	{
		
		mp=new MyPanel();
		
		this.add(mp);
		
		//注册监听
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

//1让MyPanel知道鼠标按下的消息，并且知道点击的位置（x，y）
//2.让MyPanel知道那个键按下
//3.让MyPanel知道鼠标移动，拖拽
//4.让MyPanel知道窗口的变化（关闭，最小化，最大化）
class MyPanel extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
	}

	//1.鼠标点击
	public void mouseClicked(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("鼠标点击了x="+arg0.getX()+" y="+arg0.getY());
	}

	//2.鼠标移动到MyPanel
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	//3.鼠标离开
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	//鼠标按下
	public void mousePressed(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	//
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	
	
	
	
	
	
	
	//键按下
	public void keyPressed(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println(arg0.getKeyChar()+"键被按下");
	}

    //键松开
	public void keyReleased(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	//键输入wf
	public void keyTyped(KeyEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	
	
	
	

	
	public void mouseDragged(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("鼠标当前坐标"+arg0.getX());
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	
	
	
	
	
	
	
	
	public void windowActivated(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("窗口激活");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("窗口关闭了");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		System.out.println("窗口最小化");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}
