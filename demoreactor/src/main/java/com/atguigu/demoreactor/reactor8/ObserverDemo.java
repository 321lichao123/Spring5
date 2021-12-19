package com.atguigu.demoreactor.reactor8;

import java.util.Observable;

/**
 * @ClassName ObserverDemo
 * @Description
 * @Author 12468
 * @Date 2021/12/19 10:57
 * @Version 1.0
 */
public class ObserverDemo extends Observable {
    public static void main(String[] args) {
        ObserverDemo observer = new ObserverDemo();
        // 添加观察者
        observer.addObserver((o, arg) -> {
            System.out.println("发生变化");
        });
        observer.addObserver((o, arg) -> {
            System.out.println("手动被观察者通知，准备变化");
        });

        observer.setChanged(); // 数据变化
        observer.notifyObservers(); // 通知
    }
}
