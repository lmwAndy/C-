/*
 * ��ѡ��͵�ѡ����
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
		//�������
		jp1=new JPanel();
		jp2=new JPanel();
		jp3=new JPanel();
		
		jb1=new JButton("ע���û�");
		jb2=new JButton("ȡ��ע��");
		
		jl1=new JLabel("����ϲ��������");
		jl2=new JLabel("����Ա�");
		
		jr1=new JRadioButton("��");
		jr2=new JRadioButton("Ů");
		
		jc1=new JCheckBox("����");
		jc2=new JCheckBox("����");
		jc3=new JCheckBox("����");
		
		bt=new ButtonGroup();
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,1));
		
		//������
		
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
		
		//���JPanel
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//��������
		this.setTitle("��ѡ��͵�ѡ����");
		this.setSize(500,300);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		
		//��ʾ����
		this.setVisible(true);
		
	}

}
