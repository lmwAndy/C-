/*
 * ������������б����������������������
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
		//�������
		String []jg={"����","�Ϻ�","���","�人","����"};
		String []dd={"���","ŦԼ","�׶�","��ɼ�"};
		jc=new JComboBox(jg);
		jl=new JList(dd);
		jl.setVisibleRowCount(2);//������ϣ����ʾ���ٸ�ѡ��
		js=new JScrollPane(jl);
		
		
		
		jb1=new JLabel("��ļ���");
		jb2=new JLabel("���εص�");
		
		jp1=new JPanel();
		jp2=new JPanel();
		
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,1));
		
		//������
		jp1.add(jb1);
		jp1.add(jc);
		
		jp2.add(jb2);
		jp2.add(js);
		
		//���JPanel
				this.add(jp1);
				this.add(jp2);
		
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
