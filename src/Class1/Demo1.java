/*
 * 功能：java绘图原理
 * 
 */


package Class1;
import java.awt.*;
import javax.swing.*;
public class Demo1 extends JFrame {
	
	MyPanel mp=null;
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
	}
	
	public Demo1()
	{
		mp=new MyPanel();
		
		this.add(mp);
		
		this.setSize(1200,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

}


//定义做一个MyPanel(我自己的面板,s是用于绘图和显示回填土的区域)
class MyPanel extends JPanel
{
	//覆盖JPanel的paint方法
	//Graphics 是绘图的重要类，你可以把它理解成一直画笔
	public void paint(Graphics g)
	{
		//1.条用父类函数完成初始化任务
		//这句话不能少
		super.paint(g);
		//先画一个圆
		//g.drawOval(10, 10, 30, 30);.
		//画直线
		//g.drawLine(10, 10, 100, 100);
		
		//矩形边框
		//g.drawRect(10, 10, 40, 60);
		
		//填充矩形,设置颜色
		/*g.setColor(Color.DARK_GRAY);
		g.fillRect(10, 10, 60, 60);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(80, 80, 60, 60);*/
		
		//在面板上会图片
//		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/496122017.jpg"));
//		//实现
//		g.drawImage(im, 50, 50, 800, 800, this);
//		
		//如何画出字
		g.setColor(Color.GRAY);
		g.setFont(new Font("华文彩云",Font.BOLD,30));
		g.drawString("啦啦啦", 100, 100);
		
	}
}