/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Egezone Haziri
 */
public class Main_Stack {
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>(10);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
