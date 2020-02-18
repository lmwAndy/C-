/*
 * 功能：gui界面开发演示，用swing框架
 * 步骤：
 * 1.继承JFrame
 * 2.定义需要的组件
 * 3.创建组件
 * 4.设置布局管理器
 * 5.添加组件
 * 6.显示窗口
 * .布局管理器是用来管理窗口中的控件的
 */


package gui;

//引入包
import java.awt.*;
import javax.swing.*;  
public class Demo1 extends JFrame {
	
	//把需要的swing的组件定义在这,吧初始化放在构造方法中 
	JButton jb1=null;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	//构造函数
	public Demo1()
	{
		
				//创建一个Button按钮
				jb1=new JButton("我是按钮");
				
				//添加JButton组件
				this.add(jb1);
				
				//给窗体设置标题
				this.setTitle("MyFrist Gui!");
				
				//设置大小,按像素
				this.setSize(800,600);
				
				//设置初始位置
				this.setLocation(500, 200);
				
				//设置当关闭窗口的时候，保证jvm也退出
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//显示
				this.setVisible(true);
				
	}

}
