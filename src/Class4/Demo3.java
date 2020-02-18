/*
 * 两个线程同时运行的案例
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
		// TODO 自动生成的方法存根
		while(true)
		{
			try{
				Thread.sleep(1000);
			}catch (Exception e)
			{
				
			}
			
			res+=(++times);
			System.out.println("当前结果是："+res);
			if(times==n)
			{
				System.out.println("最后结果是"+res);
				break;
			}
		}
	}
}

//打印
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
		// TODO 自动生成的方法存根
		while(true)
		{
			try{
				Thread.sleep(1000);
				
			}catch (Exception e){
				
			}
			times++;
			System.out.println("我是线程，在输出第："+times+"个  你好，世界");
			if(times==n)
			{
				break;
			}
	}
	}
	
}

