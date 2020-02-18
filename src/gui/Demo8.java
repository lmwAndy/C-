/*
 * 下拉框组件，列表框组件，滚动窗格组件案例
 * 
 */


package gui;
import java.awt.*;

import javax.swing.*;

public class Demo8 extends JFrame{
	JComboBox jc;
	JList jl;
	JScrollPane js;
	JLabel jb1,jb2;
	JPanel jp1,jp2;
	public static void main(String[] args)
	{
		Demo8 d=new Demo8();
	}
	
	public Demo8()
	{
		//创建组件
		String []jg={"北京","上海","天津","武汉","重庆"};
		String []dd={"香港","纽约","伦敦","洛杉矶"};
		jc=new JComboBox(jg);
		jl=new JList(dd);
		jl.setVisibleRowCount(2);//设置你希望显示多少个选项
		js=new JScrollPane(jl);
		
		
		
		jb1=new JLabel("你的籍贯");
		jb2=new JLabel("旅游地点");
		
		jp1=new JPanel();
		jp2=new JPanel();
		
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		jp1.add(jb1);
		jp1.add(jc);
		
		jp2.add(jb2);
		jp2.add(js);
		
		//添加JPanel
				this.add(jp1);
				this.add(jp2);
		
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
