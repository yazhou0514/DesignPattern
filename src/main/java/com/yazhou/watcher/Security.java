package com.yazhou.watcher;

/**
 * 具体的观察者    保镖
 * @author Wang Yazhou
 *
 */
public class Security implements Watcher {  
	@Override  
	public void update() {  
          System.out.println("运输车有行动，保安贴身保护"); 
	}  
}