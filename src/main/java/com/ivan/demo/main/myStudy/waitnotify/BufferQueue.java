package com.ivan.demo.main.myStudy.waitnotify;

/**
 * 一个简单的wait/notify
 */
public class BufferQueue {

    /** Field description */
    boolean valueSet = false;

    /** Field description */
    int n;

    /**
     * Method description
     *
     *
     * @param n
     */
    synchronized void put(int n) {
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        this.n   = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }

    /**
     * Method description
     *
     *
     * @return
     */
    synchronized int get() {
        if (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();

        return n;
    }
}