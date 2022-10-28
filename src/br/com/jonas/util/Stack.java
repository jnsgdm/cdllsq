package br.com.jonas.util;

public class Stack {
    private CircularDoublyLinkedList stack  = new CircularDoublyLinkedList();

    public void push(int value){
        stack.addAtEnd(value);
    }

    public void pop(){
        stack.deleteFromTheEnd();
    }

    public void top(){
        if(stack == null){
            System.out.println("pilha incializada, porém esta vaiza");
        }else {
            System.out.println("valor ao topo: "+stack.getEnd().getInfo());
        }
    }

    public void showStack(){
        if(stack == null){
            System.out.println("pilha incializada, porém esta vaiza");
        }else {
            stack.showFromTheBeginning();
        }
    }
}
