package com.company;

public class Queue {
    private class Node{
        private int data;
        private Node next;
        public Node(){
            next=null;
        }
        public Node(int data){
            this.data = data;
            next=null;
        }
    }
    public Node head;
    public Node tail;
    public int s;

    public Queue(){
        head=null;
        tail=null;
        s=0;
    }

    public boolean empty(){
        if(head==null)
            return true;
        return false;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(tail!=null){
            tail.next=newNode;
        }
        tail=newNode;
        if(head==null){
            head=newNode;
        }
        s++;
    }

    public int front(){
        int data = head.data;
        return data;
    }

    public int size(){
        return s;
    }

    public int remove(){
        int data = head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        s--;
        return data;
    }
}