package com.company.lesson16;

import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox1> stack = new java.util.ArrayDeque<>();
        Deque<HeavyBox1> queue = new java.util.ArrayDeque<>(2);
        stack.offer(new HeavyBox1());
        stack.offer(new HeavyBox1(1, 1, 1, 1));
        stack.offer(new HeavyBox1(4, 4, 4, 4));
        stack.offer(new HeavyBox1(2, 2, 2, 2));
        while (!stack.isEmpty()) {
            System.out.print(stack.poll() + " ");
        }
        System.out.println();

        queue.add(new HeavyBox1());
        queue.add(new HeavyBox1(1, 1, 1, 1));
        queue.add(new HeavyBox1(2,2,2,2));
        queue.add(new HeavyBox1(4,4,4,4));
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
