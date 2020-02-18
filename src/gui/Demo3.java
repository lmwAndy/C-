/*
 * 功能：流式布局案例
 * 
 * 
 */


package gui;

import java.awt.*;
import javax.swing.*;


public class Demo3 extends JFrame{
	
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5;
	public static void main(String[] args)
	{
		Demo3 d=new Demo3();
	}
	
	//构造函数
	public Demo3()
	{
		//创建组件
		jb1=new JButton("路飞");
		jb2=new JButton("索隆");
		jb3=new JButton("娜美");
		jb4=new JButton("山治");
		jb5=new JButton("骗人布");
		
		//添加组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		
		
		//设置布局管理器
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		//窗口属性设置
		this.setTitle("流式布局案例");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		
		//显示窗口
		this.setVisible(true);
		
	}

}

