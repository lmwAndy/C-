package Class4;

public class Demo2 {
	public static void main(String[] args)
	{
		//注意启动
		Dog dog=new Dog();
		//创建一个Thread对象
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
			//休眠一秒
			//1000表示1000毫秒,sleep就会让该线程进入到阻塞状态
			//并释放资源
			try{
			Thread.sleep(1000);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			times++;
			System.out.println("你好，世界"+times);
			if(times==10)
			{
				//退出
				break;
			}
		}
	}
}