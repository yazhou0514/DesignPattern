package com.yazhou.watcher;

/**
 * 强盗
 * @author Wang Yazhou
 *
 */
public class Thief implements Watcher {
     @Override  
     public void update() {  
          System.out.println("运输车有行动，强盗准备动手");  
     }  
}