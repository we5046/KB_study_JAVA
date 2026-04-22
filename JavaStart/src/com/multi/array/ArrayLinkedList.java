package com.multi.array;

public class ArrayLinkedList {
    private int[] data;
    private int[] next;
    private int head;
    private int free;
    private int capacity;

    // 생성자 생성
    public ArrayLinkedList(int size) {
        data = new int[size];
        next = new int[size];
        head = -1;
        free =0;
        capacity = size;

        for(int i =0; i< size-1; i++) {
            next[i] = i+1;
        }
        next[capacity-1] = -1;
    }

    public void add(int item) {
        if(free == -1) {
            System.out.println("List is full");
            return;
        }
        int newIndex = free;
        free = next[free];
        data[newIndex] = item;
        next[newIndex] = -1;

        if(head == -1) {
            head = newIndex;
        } else {
            int current = head;
            while(next[current] != -1) {
                current = next[current];
            }
            next[current] = newIndex;
        }
    }

    public void remove(int item) {
        if(head == -1) {
            System.out.println("List is Empty");
        }
    }
}
