package com.company.linkedList.template;

import java.util.Queue;

public class LinkedList {

    private Node head = null;

    protected class Node{

        private Object dataToStore;
        private Node next;

        Node(Object data, Node nextNode){
            this.dataToStore = data;
            this.next = nextNode;
        }

        public Node getNext (){
            return next;
        }
        public Object getData (){
            return dataToStore;
        }
        public void setNext (Node next){
            this.next = next;
        }
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
    public void insertAtEnd(Object elementToInsert){

        Node nodeToInsert = new Node(elementToInsert, null);

        if(head == null){
            head = nodeToInsert;
        } else {
            findLastElement().setNext(nodeToInsert);
        }
    }

    public void insertAtHead(Object elementToInsert){

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

    public boolean searchThrough(Object element){
        Object searchedData = null;
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
            System.out.println(searchedElement.getData());
            searchedElement = searchedElement.getNext();
        }

    }

}
