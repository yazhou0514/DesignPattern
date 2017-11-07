package com.yazhou.singleton;

/**
 * 懒汉式单例
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 * @author Wang Yazhou
 *
 */
public class 懒汉式 {  
	
	private static 懒汉式 instance;
	
	private 懒汉式 (){}
	
	public static synchronized 懒汉式 getInstance() {
		if (instance == null) {
			instance = new 懒汉式();
		}
		return instance;  
    }
	
	public void method() {
    	System.out.println("懒汉方式单例在执行操作...");
    }
}

class Test懒汉式 {
	public static void main(String[] args) {
		懒汉式 instance = 懒汉式.getInstance();
		instance.method();
	}
}