/*
 * qq聊天界面
 * 
 * 新：JTextArea 多行文本框
 */

package gui;
import java.awt.*;

import javax.swing.*;
public class Demo10 extends JFrame{
	
	JTextArea jta;
	JScrollPane js;
	JPanel jp1;
	JComboBox jcb;
	JTextField jtf;
	JButton jb;
	
	public static void main(String[] aegs)
	{
		Demo10 d=new Demo10();
	}
	
	public Demo10()
	{
		
		//创建组件
		jta=new JTextArea();
		js=new JScrollPane(jta);
		jp1=new JPanel();
		
		
		String []chatter={"马云","马化腾"};
		jcb=new JComboBox(chatter);
		jb=new JButton("发送");
		jtf=new JTextField(10);
		
		//设置布局
		
		
		//添加组件
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		//加入JFrame
		this.add(js);
		this.add(jp1,BorderLayout.SOUTH);
		
		//创建窗口
		this.setIconImage((new ImageIcon("picture/timg.jpg")).getImage());
				this.setTitle("qq聊天");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				//显示窗口
				this.setVisible(true);
		
	}
	
	
	

}
