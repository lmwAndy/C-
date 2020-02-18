/*
 * 演示使用线程的注意事项
 * 
 */



package Class5;

public class Demo1 {
	public static void main(String[] args)
	{
		Cat cat1=new Cat();
		cat1.start();
		Dog dog1=new Dog();
		Thread t=new Thread(dog1);
		t.start();
		System.out.println("我是英雄");
	}
}


//猫类
class Cat extends Thread
{
	public void run()
	{
		System.out.println("11");
	}
}

//狗类
class Dog implements Runnable
{
	public void run()
	{
		System.out.println("22");
	}
}