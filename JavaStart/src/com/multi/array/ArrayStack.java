package com.multi.array;

import java.util.Scanner;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    // 스택 생성자
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // 스택에 요소를 추가 (Push 연산)
    public void push(int item) {
        if(isFull()) {
            System.out.println("현재 스택이 가득 찼습니다.");
        } else {
            top++;
            stack[top] = item;
        }
    }

    // 스택에 요소를 제거
    public int pop() {
        if(isEmpty()) {
            System.out.println("현재 스택이 비어있습니다.");
            return -1;
        } else {
            int pop_value = stack[top];
            top--;
            System.out.println(pop_value + " 가 pop되었습니다.");
            return pop_value;
        }
    }

    // 스택의 최상위 요소 확인 (Peek 연산)
    public int peek() {
        System.out.println("현재 스택 top은 " + stack[top] + "입니다.");
        return stack[top];
    }

    // 스택이 비어있는지
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        return false;
    }

    // 스택이 가득찼는지
    public boolean isFull() {
        if(top == capacity -1) {
            return true;
        }
        return false;
    }

    // 스택의 요소를 출력
    public void display() {
        if(isEmpty()) {
            System.out.println("스택이 현재 비어있습니다.");
        } else {
            for(int i = 0; i <= top; i++) {
                System.out.println("Stack[" + i + "] : " + stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        ArrayStack stack = new ArrayStack(size);

        while(true) {
            System.out.println("\nStack Operations: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    int pop_value = stack.pop();
                    System.out.print(pop_value + " was popped");
                    break;
                case 3:
                    int top_value = stack.peek();
                    System.out.println(top_value + " is peek now");
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Plz try again");
            }
        }
    }
}
