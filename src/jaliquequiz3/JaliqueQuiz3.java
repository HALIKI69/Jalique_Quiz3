/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaliquequiz3;

import java.util.Scanner;

public class JaliqueQuiz3 {
  

 public static int MAX = 9;
    private int[] data;
    private int head;
    private int tail;
    
    public JaliqueQuiz3(){
        data = new int [MAX];
        head = 0;
        tail = 0;
                
    }
    private int insertion(int index) throws Exception{
        if(head == MAX){
            throw new Exception("Queue is Empty");
        } else{
            data[tail++] = index;
        }
        return 0;
    }
     
    private void display()throws Exception{
        if(head == tail){
            throw new Exception("Queue is Empty");
        }
        
        System.out.println("------------------------------------");
        System.out.println("\n Your Queue....");
        
        for(int i = head; i < tail ;i++){
            System.out.println(data[i] + "");
        }
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       JaliqueQuiz3 que = new JaliqueQuiz3();
       while(true){
           System.out.println(" 1. Insert \n 2. Display \n");
           int choice = scan.nextInt();
           int index;
           switch(choice){
               case 1:
                   
                    System.out.println("Enter new Node");
                    index = scan.nextInt();
                    que.insertion(index);
                    System.out.println(index + " inserted");
                    break;
               case 2:
                   que.display();
                    break;
                    default:
                        break;
           }
                   
       }
        
    }
     

}
