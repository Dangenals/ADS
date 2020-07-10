package com.company;

public class Main {

    public static void main(String[] args) {
	Queue queue = new Queue();
	queue.push(7);
	queue.push(8);
	queue.push(9);
		System.out.println(queue.empty());
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println(queue.remove());
    }
}
