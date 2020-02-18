/*
 * 讲解事件处理机制，一个事件可以有多个监听者,一般是对象
 * 1.一个类要实现监听的步骤
 * a.实现相应的接口{KeyListener,MouseListener,ActiongListener,WindowListener}
 * b.吧接口的处理方法根据需要重新编写（Override）
 * c.在事件源上注册监听
 * d.事件传递是靠事件类
 * 
 */

package Class2;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class Demo1 extends JFrame implements ActionListener{
	//定义一个panel
	JPanel mp=null;
	JButton jb1,jb2;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	public Demo1()
	{
		mp=new JPanel();
		jb1=new JButton("黑色");
		jb2=new JButton("红色");
		
		//创建猫咪对象
		Cat cat=new Cat();
		
		//注册监听,可以注册多个监听者
		jb1.addActionListener(this);
		jb1.addActionListener(cat);
		//指定action命令
		jb1.setActionCommand("黑色");
		jb2.addActionListener(this);
		jb2.addActionListener(cat);
		jb2.setActionCommand("红色");
		
		
		this.add(jb1,BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp,BorderLayout.CENTER);
		this.add(jb2,BorderLayout.SOUTH);
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//对事件处理的方法
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		System.out.println("ok");
		
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("黑色"))
		{
			System.out.println("你点击黑色按钮了");
			mp.setBackground(Color.black);
			
			
		
	}else if(e.getActionCommand().equals("红色"))
	{
		System.out.println("你点击了红色按钮");
		mp.setBackground(Color.red);
	}else{
		System.out.println("不知道");
	}

}
}
	
	
//创建猫咪监听者
class  Cat extends JFrame implements ActionListener 
{
	
	JPanel mp=new JPanel();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		if(e.getActionCommand().equals("黑色"))
		{
			System.out.println("猫咪也知道点击黑色按钮了哦！");
			
			mp.setBackground(Color.black);
			
		
	}else if(e.getActionCommand().equals("红色"))
	{
		System.out.println("猫咪我可是知道你点击了红色按钮哦！");
		mp.setBackground(Color.red);
	}else{
		System.out.println("不知道");
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
	
