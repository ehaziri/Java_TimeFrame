/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;
/**
 *
 * @author Egezona
 * @param <E>
 */
public class SinglyLinkedList<E> {
/**
 *  Node stores a reference to an object that is an ELEMENT of the sequence
 *  and a reference to the NEXT node of the list.
*/
    private static class Node<E> {
        private E element;        //reference to the element stored at this node
        private Node<E> next;     //reference to the next node in the list
        
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        
        public E getElement(){  return element; }
        public Node<E> getNext() {  return next; }
        public void setNext(Node<E> n){ next = n; }
    }
/** @head - the first node of the list
 *  @tail - the last node of the list 
 *  @size - the total number of Nodes in the list
 *  they are null if empty
 */
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
         
    public SinglyLinkedList(){}
    
    public int size(){ return size; }
    
    public boolean isEmpty(){ return size == 0; }
        
    public E firstElement(){
        if( isEmpty() )
            return null;
        return head.getElement();
    }
    
    public E lastElement(){
        if( isEmpty() )
            return null;
        return tail.getElement();
    }
    
    public void addFirst(E e){
        head = new Node<>(e, head);
        if(size == 0)
            tail = head;
        size++;
    }
    
    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(size == 0)
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
    
    public E removeFirst(){
        if(size == 0) 
            return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0)
            tail = null;
        return answer;
    }

}
    
