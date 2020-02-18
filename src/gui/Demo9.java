/*
 * 拆分窗格
 * JSplitpane属于容器类组件
 * 
 */


package gui;
import java.awt.*;

import javax.swing.*;
public class Demo9 extends JFrame{
	//定义组件
	JSplitPane jsp;
	JList jl;
	JLabel jll;
	
	public static void main(String[] args)
	{
		Demo9 d=new Demo9();
	}
	
	public Demo9()
	{
		//创建组件
		String[] words={"boy","girl","bird"};
		jl=new JList(words);
		
		jll=new JLabel(new ImageIcon("picture/496122017.jpg"));
		//创建可拆分窗格
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jl,jll);
		
		//可以变化
		jsp.setOneTouchExpandable(true);
		
		//设置布局管理器
		
		//添加组件
		this.add(jsp);
		
		//创建窗口
		this.setTitle("拆分窗格");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//禁止用户改变窗体大小
		this.setResizable(false);
		
		//显示窗口
		this.setVisible(true);
	}

}
