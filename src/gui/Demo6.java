/*
 * 
 * �û���¼����
 */


package gui;
import java.awt.*;
import javax.swing.*;
public class Demo6 extends JFrame {
	
	JPanel jp1,jp2,jp3;//�����������
	JLabel jlb1,jlb2;//��ǩ���
	
	JButton jb1,jb2;//��ť���
	JTextField jt1;//�ı������
	JPasswordField jpd;//��������
	public static void main(String[] args)
	{
		Demo6 d=new Demo6();
	}
	
	public Demo6()
	{
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jlb1=new JLabel("�û���");
		jlb2=new JLabel("��   ��");
		
		jb1=new JButton("��¼");
		jb2=new JButton("ע��");
		
		jt1=new JTextField(10);
		
		jpd=new JPasswordField(10);
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,1));
		
		//�ѷ����������ӵ�JPanel�����
		jp1.add(jlb1);
		jp1.add(jt1);
		
		jp2.add(jlb2);
		jp2.add(jpd);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		//��JPanel��ӵ�JFrame
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//��������
		this.setTitle("��ϲ��ְ���");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		
		//��ʾ����
		this.setVisible(true);
	}

}
