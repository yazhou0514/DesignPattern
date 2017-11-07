package com.yazhou.singleton;

public enum 枚举 {
	
    INSTANCE;
    
	public void method() {
    	System.out.println("枚举方式单例在执行操作...");
    }
}


class Test枚举 {
	public static void main(String[] args) {
		枚举.INSTANCE.method();
	}
}