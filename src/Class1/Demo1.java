/*
 * ���ܣ�java��ͼԭ��
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


//������һ��MyPanel(���Լ������,s�����ڻ�ͼ����ʾ������������)
class MyPanel extends JPanel
{
	//����JPanel��paint����
	//Graphics �ǻ�ͼ����Ҫ�࣬����԰�������һֱ����
	public void paint(Graphics g)
	{
		//1.���ø��ຯ����ɳ�ʼ������
		//��仰������
		super.paint(g);
		//�Ȼ�һ��Բ
		//g.drawOval(10, 10, 30, 30);.
		//��ֱ��
		//g.drawLine(10, 10, 100, 100);
		
		//���α߿�
		//g.drawRect(10, 10, 40, 60);
		
		//������,������ɫ
		/*g.setColor(Color.DARK_GRAY);
		g.fillRect(10, 10, 60, 60);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(80, 80, 60, 60);*/
		
		//������ϻ�ͼƬ
//		Image im=Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/496122017.jpg"));
//		//ʵ��
//		g.drawImage(im, 50, 50, 800, 800, this);
//		
		//��λ�����
		g.setColor(Color.GRAY);
		g.setFont(new Font("���Ĳ���",Font.BOLD,30));
		g.drawString("������", 100, 100);
		
	}
}