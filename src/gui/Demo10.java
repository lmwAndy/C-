/*
 * qq�������
 * 
 * �£�JTextArea �����ı���
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
		
		//�������
		jta=new JTextArea();
		js=new JScrollPane(jta);
		jp1=new JPanel();
		
		
		String []chatter={"����","����"};
		jcb=new JComboBox(chatter);
		jb=new JButton("����");
		jtf=new JTextField(10);
		
		//���ò���
		
		
		//������
		jp1.add(jcb);
		jp1.add(jtf);
		jp1.add(jb);
		
		//����JFrame
		this.add(js);
		this.add(jp1,BorderLayout.SOUTH);
		
		//��������
		this.setIconImage((new ImageIcon("picture/timg.jpg")).getImage());
				this.setTitle("qq����");
				this.setSize(500,300);
				this.setLocation(500, 200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				
				//��ʾ����
				this.setVisible(true);
		
	}
	
	
	

}
