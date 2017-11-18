/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
/**
 *
 * @author Egezone Haziri
 * @param <T>
 */
public class Stack<T> {
    
    public static class StackSizeException extends RuntimeException {}
    public static class StackOverflowException extends RuntimeException {}
    public static class StackUnderflowException extends RuntimeException {}
    
    private T[]         stackData;
    private int         stackPointer;
    
    public Stack(int stackCapacity) {
    
        if(stackCapacity <= 0)
            throw new StackSizeException();
        
        stackData = (T[])new Object[stackCapacity];
        stackPointer = 0;
    }
    
    public void push(T value) {
     
        if(stackPointer == capacity())
            throw new StackOverflowException();
        
        stackData[stackPointer] = value;
        stackPointer++;
    }   
    
    public T pop() {
    
        if(stackPointer == 0)
            throw new StackUnderflowException();
        
        stackPointer--;
        return stackData[stackPointer];
    }
    
    public T peek() {
    
        if(stackPointer == 0)
            throw new StackUnderflowException();
        
        return stackData[stackPointer - 1];
    }
    
    public int size() {
    
        return stackPointer;
    }
    
    public int capacity() {
    
        return stackData.length;
    }
    
    public void clear() {
    
        stackPointer = 0;
    }
}

