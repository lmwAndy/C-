package Class6;

public class Demo1 {
	public static void main(String[] args)
	{
		TicketWindow tw1=new TicketWindow();
		//TicketWindow tw2=new TicketWindow();
		//TicketWindow tw3=new TicketWindow();
		
		Thread t1=new Thread(tw1);
		Thread t2=new Thread(tw1);
		Thread t3=new Thread(tw1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}

//��Ʊ������
class TicketWindow implements Runnable
{
	private int nums=2000;
	
	public void run()
	{
		while(true)
		{
			//��Ϊif elseҪ��֤��ԭ����[ͬ�������]
			synchronized(this)//this�ı�־λ���Ƕ�����
			{
			//���ж��Ƿ���Ʊ
			if(nums>0)
			{
				//��ʾ��Ʊ��Ϣ
				//Thread.currentThread().getName()�ǵ�ǰ�̵߳�����
				System.out.println(Thread.currentThread().getName()+"���۳��� "+nums+"Ʊ");
				// ��Ʊ���ٶ���һ��һ��
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				nums--;
			}else{
				//��Ʊ������
				break;
			}
		}
	  }
    }
}