/*
 * �̣߳�����
 * 1.�߳����������Ľ��̣��û�����һ�����̣�����ϵͳ��Ϊ�����һ���ڴ�ռ䣩
 * 2.�߳�û�ж����ĵ�ַ�ռ�
 * 3.�߳����ɽ��̴����ģ������ڽ��̣�
 * 4.һ�����̿���ӵ�ж���߳�-����������ǳ�˵�Ķ��̱߳��
 * 5.�߳��м���״̬��
 * a.�½�״̬
 * b.����״̬
 * c.����״̬
 * d.����״̬
 * e.����״̬
 *
 */

/*
 * ��ʾ���ͨ���̳�Thread�������߳�
 */

package Class4;

public class Demo1 {
	public static void main(String[] args)
	{
		 //����һ��cat����
		Cat cat=new Cat();
		//�����̣߳��ᵼ��run����������
		cat.start();
	}

}

class Cat extends Thread
{
	int times=0;
	//��дrun����
	public void run()
	{
		while(true)
		{
			//����һ��
			//1000��ʾ1000����,sleep�ͻ��ø��߳̽��뵽����״̬
			//���ͷ���Դ
			try{
			Thread.sleep(1000);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			times++;
			System.out.println("��ã�����"+times);
			if(times==10)
			{
				//�˳�
				break;
			}
		}
	}
}



