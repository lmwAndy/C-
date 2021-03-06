 /*
  * 多种布局管理器的使用
  * JPnael的用法
  * 1.JPanel是JComponent的子类
  * 2.属于容器类组件，可以加入别的组件
  * 3.默认布局管理器是流式布局（FlowLayout）
  * 
  */


package gui;

import java.awt.*;

import javax.swing.*;

public class Demo5 extends JFrame {
	
	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	public static void main(String[] args)
	{
		Demo5 d=new Demo5();
	}
	
	public Demo5()
	{
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		
		jb1=new JButton("西瓜");
		jb2=new JButton("苹果");
		jb3=new JButton("荔枝");
		jb4=new JButton("葡萄");
		jb5=new JButton("桔子");
		jb6=new JButton("桃子");
		
		//创建布局
		
		//添加JPanel
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		//吧JPamel加入JFrame
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//窗口属性设置
				this.setTitle("组合布局案例");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//禁止用户改变窗体大小
				this.setResizable(false);
				
				//显示窗口
				this.setVisible(true);
		
	}

}
