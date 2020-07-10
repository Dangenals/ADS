package com.company;

public class Stack{
    private class Node{
        private int data;
        private Node next;

        private Node(){
            next=null;
        }

        private Node(int data){
            this.data = data;
            next=null;
        }
    }
    private Node last;
    int s;
    public Stack(){
        last=null;
        s=0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = last;
        last = newNode;
        s++;
    }

    public int pop(){
        int data = last.data;
        last=last.next;
        s--;
        return data;
    }

    public int top(){
        return last.data;
    }

    public boolean isEmpty(){
        if(last==null)
            return true;
        return false;
    }

    public int size(){
        return s;
    }
}