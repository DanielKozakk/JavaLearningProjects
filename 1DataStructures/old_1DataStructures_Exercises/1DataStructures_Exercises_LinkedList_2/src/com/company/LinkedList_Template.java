package com.company;

import java.util.Queue;

public class LinkedList_Template <T> {

    private Node head = null;

    protected class Node{

        private T dataToStore;
        private Node next;

        Node(T data, Node nextNode){
            this.dataToStore = data;
            this.next = nextNode;
        }

        public Node getNext (){
            return next;
        }
        public T getData (){
            return dataToStore;
        }
        protected void setNext (Node next){
            this.next = next;
        }
    }

    public int getSize(){

        Node searchedElement = getFirstElement();
        int size = 0;
        while(searchedElement != null){
            size ++;
            searchedElement = searchedElement.getNext();
        }

        return size;

    }

    public void delete(){
        Node lastElement = findLastElement();
        Node searchedElement = head;

        while(!searchedElement.next.equals(lastElement)){
            searchedElement = searchedElement.next;
        }

        searchedElement.setNext(null);
    }

    public void deleteAtHead(){
        head = head.next;
    }
    public void insertAtEnd(T elementToInsert){

        Node nodeToInsert = new Node(elementToInsert, null);

//        System.out.println(nodeToInsert.getData());

        if(head == null){
            head = nodeToInsert;
        } else {
            findLastElement().setNext(nodeToInsert);
        }
    }

    public void insertAtHead(T elementToInsert){

        if (head == null){
            head = new Node(elementToInsert, null);
        } else {
            head = new Node(elementToInsert, head);
        }

    }

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        Node searchedElement = head;



        while  (searchedElement != null){

            stringBuilder.append("[").append(searchedElement.getData()).append("] ");
            searchedElement = searchedElement.getNext();

        }
        return stringBuilder.toString();
    }


    public Node findLastElement(){

        Node searchedElement = head;

        while (searchedElement.getNext() !=null){
            searchedElement = searchedElement.getNext();
        }
        return searchedElement;
    }

    public Node getFirstElement(){
        return head;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public boolean searchThrough(T element){
        T searchedData = null;
        Node searchedObject = head;

        while (searchedObject != null && searchedData == null ){

            if(searchedObject.getData().equals(element)){
                searchedData = element;
            }
            searchedObject = searchedObject.next;

        }
        return searchedData != null;
    }

    public void printLinkedList(){
        Node searchedElement = head;

        while(searchedElement != null){

            System.out.println(searchedElement.getData().toString());
            searchedElement = searchedElement.getNext();
        }

    }

}
