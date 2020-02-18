/*
 * 
 * 用户登录界面
 */


package gui;
import java.awt.*;
import javax.swing.*;
public class Demo6 extends JFrame {
	
	JPanel jp1,jp2,jp3;//定义容器组件
	JLabel jlb1,jlb2;//标签组件
	
	JButton jb1,jb2;//按钮组件
	JTextField jt1;//文本框组件
	JPasswordField jpd;//密码框组件
	public static void main(String[] args)
	{
		Demo6 d=new Demo6();
	}
	
	public Demo6()
	{
		//创建组件
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jlb1=new JLabel("用户名");
		jlb2=new JLabel("密   码");
		
		jb1=new JButton("登录");
		jb2=new JButton("注册");
		
		jt1=new JTextField(10);
		
		jpd=new JPasswordField(10);
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,1));
		
		//把非容器组件添加到JPanel组件中
		jp1.add(jlb1);
		jp1.add(jt1);
		
		jp2.add(jlb2);
		jp2.add(jpd);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//把JPanel添加到JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//创建窗口
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
