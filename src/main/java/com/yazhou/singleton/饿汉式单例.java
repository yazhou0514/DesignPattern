package com.yazhou.singleton;

/**
 * 饿汉式单例
 * 虽然饿汉式单例是线程安全的，但也有其不足之处。饿汉式单例在类被加载时就创建单例对象并且长驻内存，不管你需不需要它；如果单例类占用的资源比较多，就会降低资源利用率以及程序的运行效率。
 * @author Wang Yazhou
 *
 */
public class 饿汉式单例 {

	private static 饿汉式单例 instance = new 饿汉式单例();
	
	private 饿汉式单例 (){
	}
	
	public static 饿汉式单例 getInstance(){
		return instance;
	}
	
	public void method() {
    	System.out.println("饿汉式单例   方式单例在执行操作...");
    }
	
}


class Test饿汉式单例 {
	public static void main(String[] args) {
		饿汉式单例.getInstance().method();
	}
}