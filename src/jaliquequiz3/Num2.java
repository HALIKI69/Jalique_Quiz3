/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaliquequiz3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Num2 {


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinearQueue {
        Node front;
        Node rear;

        LinearQueue() {
            this.front = null;
            this.rear = null;
        }

        boolean isEmpty() {
            return this.front == null;
        }

        public void enqueue(int data) {
            Node newNode = new Node(data);

            if (this.rear == null) {
                this.front = this.rear = newNode;
                return;
            }

            this.rear.next = newNode;
            this.rear = newNode;
        }

        int dequeue() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Queue is empty");
            }

            int data = this.front.data;
            this.front = this.front.next;

            if (this.front == null) {
                this.rear = null;
            }

            return data;
        }

        int wut() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Queue is empty");
            }

            return this.front.data;
        }
    }

    public static void main(String[] args) throws Exception {
        num2();
    }
    
    
    
    static int MAX = 10;
    private int[] data = new int [MAX];
    private int front  ;
    private int rear;
    
    private void insertBeggining(int index)throws Exception{
       //OVERFLOW
       if((front == 0 && rear == MAX - 1) || (rear + 1 == front)){
           throw new Exception("Queue is Empty");
       }
       
       if (rear == MAX - 1) {
           rear = 0;
       } else if (front == 1){
           front = 0;
       } else {
           data[rear++] = index;
       }
    }
    private void insertEnding(int item) throws Exception{
        if(rear == MAX - 1){
            throw new Exception("que is full");
            
        }
        data[++rear] = item;
    }
     public int deletionBeggining(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Que is empty");
        }
        int temporary = data [ front];
        if(front == rear){
            front = rear - 1;
        } else{
            front++;
        }
        return temporary;
    }
      public int deletionEnding(int item) throws Exception {
        if (rear == MAX-1 ){
            throw new Exception( " Que is empty");
        }
        int temporary = data [rear];
        if(front == rear){
            front = rear = -1;
        }else {
            rear--;
        }
        return temporary;
      }  
    //display
    private void display() throws Exception{
        //overflow
        if(front == -1){
            throw new Exception("Queue is Empty");
        }
        
        
        
        if(rear < front){
            for(int i = front; i <= MAX -1; i++){
                System.out.println(data[i] + "");
            }
            for(int i = 0; i <= rear; i++ ){
                System.out.println(data[i] + "");
            }
        }else {
             for(int i = front; i <= rear; i++ ){
                System.out.println(data[i] + "");
             }
        }
        System.out.println("NULL");
    }
    //deletion
    private int deletion() throws Exception{
        if (front == -1){
            throw new Exception("Queue is Empty");
        }
        
        int temporary = data[front];
        
        if(front == rear){
            front = rear = -1;
        }else if(front == MAX - 1){
            front = 0;
        } else{
            front++;
        }
        
        return temporary;
    }


    public static void num2() throws Exception{
        Scanner scn = new Scanner(System.in);
        
     Num2 list = new Num2();
        
        while (true) {
            System.out.println("[1] INSERT Beginning");
            System.out.println("[2] INSERT Ending");
            System.out.println("[3] DELETE Beggining");
            System.out.println("[4] DELETE Ending");
            System.out.println("[5] DISPLAY");
            int choice = scn.nextInt();
            int index;
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Index");
                    index = scn.nextInt();
                    list.insertBeggining(index);
                    break;
                case 2:
                    System.out.println("Enter Index");
                    index = scn.nextInt();
                    list.insertEnding(index);
                    break;
                  case 3:
                    System.out.println("Enter Index");
                    index = scn.nextInt();
                    list.deletionBeggining(index);
                    break;
                case 4:
                    System.out.println("Enter Index");
                    index = scn.nextInt();
                    list.deletionEnding(index);
                    break;
                case 5:
                    list.display();
            }
            
        }
     

    }

    }

