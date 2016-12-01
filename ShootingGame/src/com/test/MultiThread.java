package com.test;
class MultiThread implements Runnable {
	String name;

	public MultiThread(String name) {
		System.out.println(name + " 스레드가 생성되었습니다.");
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(Thread.currentThread().getName() + " (" + name + ")");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

class TutorialThread
{
	public static void main(String[] args)
	{
		MultiThread mt1 = new MultiThread("Thread1");
		MultiThread mt2 = new MultiThread("Thread2");
		MultiThread mt3 = new MultiThread("Thread3");
		Thread tr1 = new Thread(mt1);
		Thread tr2 = new Thread(mt2);
		Thread tr3 = new Thread(mt3);

		tr1.start();
		tr2.start();
		tr3.start();
	}
}