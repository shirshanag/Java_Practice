import java.util.*;
import java.lang.*;
import java.io.*;

interface StackADT{
    void  push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    }
class Stack implements StackADT{
    private int[] stack;
    private int top;
    private final int cap=100;
    public Stack(){
        stack=new int[cap];
        top=-1;
    }
    public void push(int element){
        stack[++top]=element;
    }
    public int pop(){
        return stack[top--];
    }
    public int peek(){
        return stack[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
class Main{
    public static void main(String[] args){
        StackADT stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Poped element:"+stack.pop());
        System.out.println("Top Element:"+stack.peek());
    }
}
