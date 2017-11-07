package com.yazhou.singleton;

/**
 * 饿汉式单例，静态内部类方式
 * 
 * 这样，通过静态内部类的方法就实现了lazy loading，很好地将懒汉式和饿汉式结合起来，既实现延迟加载，保证系统性能，也能保证线程安全。
 * @author Wang Yazhou
 *
 */
public class 饿汉静态内部类 {

    private 饿汉静态内部类() {
	}
    
    private static class SingletonHolder{
        private static 饿汉静态内部类 instance = new 饿汉静态内部类();
    }
    
    public static 饿汉静态内部类 getInstance(){
        return SingletonHolder.instance;
    }
    
    public void method() {
    	System.out.println("饿汉静态内部类   方式单例在执行操作...");
    }
}

class Test饿汉静态内部类 {
	public static void main(String[] args) {
		饿汉静态内部类.getInstance().method();
	}
}