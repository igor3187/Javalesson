package com.company.lesson20;


public class NewThreadDemo {
    public void main(String[] args) {

        NewThread newThread = new NewThread();

        newThread.start(newThread);
    }
}

