/*
 * �ܽ�-�¼���̲���
 * 1.��д�¼�������
 * 2.����������¼�������ʵ�ּ������ӿ�
 * 3.���¼�����������д��ʵ�֣����¼�����ĺ���
 * 4.���¼�Դ����ָ�����¼��ļ���������Ӧ�ߣ���˭����ע�����
 * 
 * 
 */
package Class3;
/*
 * ʵ�ֶ��������
 * 
 */

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

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
		
		//ע�����
		this.addMouseListener(mp);
		this.addKeyListener(mp);
		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		
		
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

//1��MyPanel֪����갴�µ���Ϣ������֪�������λ�ã�x��y��
//2.��MyPanel֪���Ǹ�������
//3.��MyPanel֪������ƶ�����ק
//4.��MyPanel֪�����ڵı仯���رգ���С������󻯣�
class MyPanel extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
	}

	//1.�����
	public void mouseClicked(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("�������x="+arg0.getX()+" y="+arg0.getY());
	}

	//2.����ƶ���MyPanel
	public void mouseEntered(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	//3.����뿪
	public void mouseExited(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	//��갴��
	public void mousePressed(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	//
	public void mouseReleased(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	
	
	
	
	
	
	
	//������
	public void keyPressed(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println(arg0.getKeyChar()+"��������");
	}

    //���ɿ�
	public void keyReleased(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	//������wf
	public void keyTyped(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	
	
	
	

	
	public void mouseDragged(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("��굱ǰ����"+arg0.getX());
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	
	
	
	
	
	
	
	
	public void windowActivated(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڼ���");
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("���ڹر���");
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		System.out.println("������С��");
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
}
