/*
 * 网格布局演示
 * 
 */


package gui;

import java.awt.*;

import javax.swing.*;

public class Demo4 extends JFrame{
	
	int size=10;
	//定义组件,用数组
	JButton arr[]=new JButton[size];
	
	public static void main(String[] args)
	{
		Demo4 d=new Demo4();
	}
	
	//构造函数
	public Demo4()
	{
		//创建组件,添加组件
		for(int i=0;i<size;i++)
		{
			arr[i]=new JButton(String.valueOf(i));
			
			this.add(arr[i]);
		}
		
				
				
				
				//设置网格布局管理器
				this.setLayout(new GridLayout(4,3,10,10));
				
				//窗口属性设置
				this.setTitle("网格布局案例");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//禁止用户改变窗体大小
				this.setResizable(false);
				
				//显示窗口
				this.setVisible(true);
				
	}

}
