/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Egezone Haziri
 */
public class Main_Queue {
     public static void main(String[] args){
        Queue<Integer> q = new Queue<>(4);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
//        q.clear();
//        q.push(6);
        System.out.println(q.pop());
   

    }
}
