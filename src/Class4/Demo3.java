/*
 * �����߳�ͬʱ���еİ���
 */



package Class4;


public class Demo3 {
	public static void main(String[] args)
	{
		Bird b=new Bird(10);
		Pig p=new Pig(10);
		Thread t1=new Thread(b);
		Thread t2=new Thread(p);

		
		t1.start();
		t2.start();
	}

}




class Bird implements Runnable
{
	int n=0;
	int res=0;
	int times=0;
	public Bird(int n)
	{
		this.n=n;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true)
		{
			try{
				Thread.sleep(1000);
			}catch (Exception e)
			{
				
			}
			
			res+=(++times);
			System.out.println("��ǰ����ǣ�"+res);
			if(times==n)
			{
				System.out.println("�������"+res);
				break;
			}
		}
	}
}

//��ӡ
class Pig implements Runnable
{
	int n=0;
	int times=0;
	public Pig(int n)
	{
		this.n=n;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true)
		{
			try{
				Thread.sleep(1000);
				
			}catch (Exception e){
				
			}
			times++;
			System.out.println("�����̣߳�������ڣ�"+times+"��  ��ã�����");
			if(times==n)
			{
				break;
			}
	}
	}
	
}

