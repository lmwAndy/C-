/*
 * ��ʾʹ���̵߳�ע������
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
		System.out.println("����Ӣ��");
	}
}


//è��
class Cat extends Thread
{
	public void run()
	{
		System.out.println("11");
	}
}

//����
class Dog implements Runnable
{
	public void run()
	{
		System.out.println("22");
	}
}