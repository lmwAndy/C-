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

//售票窗口类
class TicketWindow implements Runnable
{
	private int nums=2000;
	
	public void run()
	{
		while(true)
		{
			//认为if else要保证其原子性[同步代码块]
			synchronized(this)//this的标志位就是对象锁
			{
			//先判断是否还有票
			if(nums>0)
			{
				//显示售票信息
				//Thread.currentThread().getName()是当前线程的名字
				System.out.println(Thread.currentThread().getName()+"在售出第 "+nums+"票");
				// 出票的速度是一秒一张
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				nums--;
			}else{
				//售票啊结束
				break;
			}
		}
	  }
    }
}