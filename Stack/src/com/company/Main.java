package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.push(9);
        st.push(34);
        System.out.println(st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st.pop());
        }
    }
