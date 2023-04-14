/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229week10_lab;

/**
 *
 * @author willi
 */
public class CSC229Week10_Lab {

    public static void main(String[] args) {
        // DoublyLinkedList setup
        DoublyLinkedList d = new DoublyLinkedList();
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(7);
        Node e = new Node(10);
        Node f = new Node(13);
        d.append(a);
        d.append(b);
        d.append(c);
        d.append(e);
        d.append(f);
        int size=d.getSize();
        int arr[] = new int[size];
        
        System.out.println("Problem #1:");
        d.toArray(arr); // Converts d to an array
        for(int i=0;i<size;i++){
            System.out.println("Index " + i + ": " + arr[i]);
        }
        
        System.out.println("Problem #2:");
        int search1 = 7;
        int search2 = 8;
        int tracker1 = d.indexOf(search1); // indexOf (element found)
        int tracker2 = d.indexOf(search2); // indexOf (element not found)
        if(tracker1==-1){
            System.out.println("Number " + search1 + " was not found.");
        }
        else {
            System.out.println("Index of " + search1 + ": " + tracker1);
        }
        if(tracker2==-1){
            System.out.println("Number " + search2 + " was not found.");
        }
        else {
            System.out.println("Index of " + search2 + ": " + tracker2);
        }
        
        System.out.println("Problem #3:");
        int limit = 2;
        int sumOfLast=d.sumOfLastElements(limit); // Sum of last limit elements of d
        System.out.println("Sum of last " + limit + " elements: " + sumOfLast);
    }
}
