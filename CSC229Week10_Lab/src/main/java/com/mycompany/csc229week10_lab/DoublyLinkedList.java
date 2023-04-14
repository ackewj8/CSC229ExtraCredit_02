
package com.mycompany.csc229week10_lab;

/**
 *
 * @author MoaathAlrajab
 */
/*
NOTE: I cloned and moved this file from the DLLists_Stacks_Queues file on GitHub.
I was not sure if we had to clone the Doubly Linked List code or create a doubly
linked list class ourselves.

If cloning the Doubly Linked List code is not permitted, please let me know. I sent
you an email, but I did not get a response from you before the assignment was due.

Thank you for understanding.
*/
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
   }
   
   public int getSize(){ // Get the size of the linked list; this is needed for several functions
       Node s=head;
       int size=0;
       while(s!=null){
           size++;
           s=s.next;
       }
       return size;
   }
   
   // Problem #1
   public int[] toArray(int[] arr){ // Converts a linked list to an array
       Node s=head;
       for(int i=0;i<arr.length;i++){
           arr[i]=s.data;
           s=s.next;
       }
       return arr;
   }
   
   // Problem #2
   public int indexOf(int search){ // Locates the index of an element in a linked list
       int index=-1;
       int counter=0;
       Node s=head;
       while(s!=null){
           if(s.data==search) {
               index=counter;
           }
           counter++;
           s=s.next;
       }
       return index;
   }
   
   // Problem #3
   public int sumOfLastElements(int m){ // Returns the sum of the last m elements of a linked list
       int sum=0;
       Node s=tail;
       for(int i=0;i<m;i++){
           sum=sum+s.data;
           s=s.previous;
       }
       return sum;
   }
}
