package com.bridgrlabz;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
//        list.addelement(70);
//        list.addelement(30);
//        list.addelement(56);
//        list.printElement();

        list.addelement(56);
        list.addLastElement(70);
        list.insert(30,1);
        //list.deleteFirst();
        list.deletelast();
        list.printElement();
        list.search(30);




    }
}
