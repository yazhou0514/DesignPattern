package com.yazhou.watcher;

/**
 * 警察
 * @author Wang Yazhou
 *
 */
public class Police implements Watcher {  
     @Override  
     public void update() {  
          System.out.println("运输车有行动，警察护航");  
     }  
}  
