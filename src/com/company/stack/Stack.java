package com.company.stack;

public class Stack {

    private int maxSize;    // size of stack array
    private double[] stackArray;
    private int top;    // top of the stack



    public Stack(int size) {
        this.maxSize = size;    // set a array size
        this.stackArray = new double[maxSize];
        this.top = -1;          // no items.. which stores the index of the item on the top of the stack.
    }

    public void push (double j) {

        // Check whether stack is full
        if (top == maxSize -1){
            System.out.println("Stack is full");
        } else{
            stackArray[++top] = j;  // Increment top
        }

    }

    public double pop(){
        if (top == -1) {
            return -99;
        }else {
            return stackArray[top--];
        }
    }


}
