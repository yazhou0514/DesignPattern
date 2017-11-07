package com.yazhou.singleton;


public class 双重校验锁 {  
    
	private volatile static 双重校验锁 singleton;
    
	private 双重校验锁 (){}
    
	public static 双重校验锁 getSingleton() {
	    if (singleton == null) {
	        synchronized (双重校验锁.class) {
		        if (singleton == null) {
		            singleton = new 双重校验锁();
		        }  
	        }  
	    }  
	    return singleton;
    }
	
	public void method() {
    	System.out.println("枚举方式单例在执行操作...");
    }
}

class Test双重校验锁 {
	public static void main(String[] args) {
		双重校验锁.getSingleton().method();
	}
}
