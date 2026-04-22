package com.multi.array;

import java.util.Scanner;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // 큐 생성자
    ArrayQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = -1;
        capacity = size;
        count = 0;
    }
    // 큐에 요소를 추가 enqueue
    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("현재 Queue가 가득 찼습니다.");
            return;
        }

        System.out.println("Queue에 값 " + item + "을 추가합니다.");
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        count++;
    }

    // 큐에서 요소를 제거 dequeue
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("현재 Queue가 비어있습니다.");
            return -1;
        }

        int dequeue_value = queue[front];
        front = (front +1) % capacity;
        count--;
        System.out.println(dequeue_value + "가 빠졌습니다.");
        return dequeue_value;
    }
    // 큐의 앞쪽 요소를 확인 Peek연산
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue가 현재 비어있습니다.");
            return -1;
        }
        return queue[front];
    }
    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return count == 0;
    }
    // 큐가 가득 찼는지 확인
    public boolean isFull() {
        return count == capacity;
    }
    // 큐의 요소를 출력
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue가 비어있습니다.");
        }
        else {
            int i = front;
            while(true){
                System.out.print(queue[i] + " ");
                if(i == rear) return;
                i = (i + 1) % capacity;
            }
        }
    }
    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Queue의 크기를 입력: ");
        int size = sc.nextInt();
        ArrayQueue queue = new ArrayQueue(size);
        while(true) {
            System.out.println("1. Enqueue | 2. Dequeue | 3. Peek | 4. Display | 5. Exit");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Queue에 추가할 값을 작성: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int dequeue_value = queue.dequeue();
                    break;
                case 3:
                    int peek = queue.peek();
                    System.out.println("현재 Queue의 앞: "+ peek);
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            }
        }
    }
}
