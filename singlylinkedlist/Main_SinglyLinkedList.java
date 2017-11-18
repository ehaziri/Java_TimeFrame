/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;
/**
 *
 * @author Egezona
 */
public class Main_SinglyLinkedList {
    public static void main(String[] args){
       SinglyLinkedList<Integer> sll= new SinglyLinkedList<>();
       sll.addFirst(2);
       sll.addFirst(5);
       sll.addLast(4);
       sll.addLast(10);
       sll.removeFirst();
       System.out.println(sll.firstElement());
       System.out.println(sll.lastElement());
    }
 
}
