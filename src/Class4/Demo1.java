/*
 * 线程：概念
 * 1.线程是轻量级的进程（用户开启一个进程，操作系统就为其分配一个内存空间）
 * 2.线程没有独立的地址空间
 * 3.线程是由进程创建的（寄生在进程）
 * 4.一个进程可以拥有多个线程-》这就是我们常说的多线程编程
 * 5.线程有几种状态：
 * a.新建状态
 * b.就绪状态
 * c.运行状态
 * d.阻塞状态
 * e.死亡状态
 *
 */

/*
 * 演示如何通过继承Thread来开发线程
 */

package Class4;

public class Demo1 {
	public static void main(String[] args)
	{
		 //创建一个cat对象
		Cat cat=new Cat();
		//启动线程，会导致run函数的运行
		cat.start();
	}

}

class Cat extends Thread
{
	int times=0;
	//重写run函数
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



