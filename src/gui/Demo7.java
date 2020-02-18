/*
 * 复选框和单选框案例
 * 
 */

package gui;
import java.awt.*;

import javax.swing.*;

public class Demo7 extends JFrame {
	
	JCheckBox jc1,jc2,jc3;
	JRadioButton jr1,jr2;
	JButton jb1,jb2;
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2;
	ButtonGroup bt;
	public static void main(String[] args)
	{
		Demo7 d=new Demo7();
	}
	
	public Demo7()
	{
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jb1=new JButton("注册用户");
		jb2=new JButton("取消注册");
		
		jl1=new JLabel("你最喜欢的足球");
		jl2=new JLabel("你的性别");
		
		jr1=new JRadioButton("男");
		jr2=new JRadioButton("女");
		
		jc1=new JCheckBox("足球");
		jc2=new JCheckBox("篮球");
		jc3=new JCheckBox("网球");
		
		bt=new ButtonGroup();
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		
		bt.add(jr1);
		bt.add(jr2);
		
		jp1.add(jl1);
		jp1.add(jc1);
		jp1.add(jc2);
		jp1.add(jc3);
		
		jp2.add(jl2);
		jp2.add(jr1);
		jp2.add(jr2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//添加JPanel
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//创建窗口
		this.setTitle("复选框和单选框案例");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		
		//显示窗口
		this.setVisible(true);
		
	}

}
