/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;
/**
 *
 * @author Egezone Haziri
 * @param <T>
 */
public class Queue<T> {
    
    public static class QueueSizeException extends RuntimeException {}
    public static class QueueOverflowException extends RuntimeException {}
    public static class QueueUnderflowException extends RuntimeException {}
    
    private T[]         queueData;
    private int         front;
    private int         size;
    
    public Queue(int queueCapacity) {
    
        if(queueCapacity <= 0)
            throw new QueueSizeException();
        
        queueData = (T[])new Object[queueCapacity];
        front = 0;
        size = 0;
    }
    
    public void push(T value) {
     
        if(size == capacity())
            throw new QueueOverflowException();
        
        int next = (front + size) % capacity();
        queueData[next] = value;
        size++;
    }   
    
    public T pop() {
    
        if(size == 0)
            throw new QueueUnderflowException();
        T result = queueData[front];
        queueData[front] = null;               
        front = (front + 1) % capacity();
        size--;
        return result;
    }
    
    public T first() {
    
        if(size == 0)
            throw new QueueUnderflowException();
        
        return queueData[front];
    }
    
    
    public int capacity() {
    
        return queueData.length;
    }
    
    public void clear() {
    
        front = 0;
        size = 0;
    }
}

