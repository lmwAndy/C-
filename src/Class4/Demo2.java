package Class4;

public class Demo2 {
	public static void main(String[] args)
	{
		//ע������
		Dog dog=new Dog();
		//����һ��Thread����
		Thread t=new Thread(dog);
		t.start();
		
	}

}

class Dog implements Runnable
{
	int times=0;
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