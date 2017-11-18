/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// package timeframe_gameofguess;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * @author Egezona
 */
public class TimeFrame_GameOfGuess {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Think of a number! Then you will be able to write an interval.");
        Scanner reader = new Scanner(System.in);
        System.out.println("Write the first number of the interval:");
        int start = reader.nextInt();
        System.out.println("Write the last number of the interval:");
        int end = reader.nextInt();
        boolean found = false;
        while(!found){
           System.out.println("[" + start + "," + end +"]");
           int mid = (start+end)/2;
           
           System.out.println("Is it > or < than " + mid + "? Otherwise, please enter = if that's your number! ");
           char symbol = reader.next().charAt(0);
           
           switch(symbol){
               case '<': { 
                            end = mid;
                            break;
                         }
               case '>': { 
                            start = mid;
                            break;
                         }
               case '=': { 
                            System.out.println("Found number: " + mid);
                            found = true;
                            break;
                         }
               default: System.out.println("Invalid symbol");
           }
           
        }       
    }
}
