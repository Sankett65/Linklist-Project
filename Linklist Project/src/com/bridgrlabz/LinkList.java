package com.bridgrlabz;

import java.util.LinkedList;

public class LinkList {
    Node head = null;
    public boolean isempty(){
        return head==null;
    }


    public void addelement(int data){
        Node newNode = new Node(data,head);
        if (isempty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void printElement(){
        if (isempty()){
            System.out.println("List is Empty");
        }
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
    }

      public void addLastElement(int data) {
        Node newNode = new Node(data,head);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
}
