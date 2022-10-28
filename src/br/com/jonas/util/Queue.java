package br.com.jonas.util;

public class Queue {
    private CircularDoublyLinkedList queue = new CircularDoublyLinkedList();

    public void addInTheQueue(int value){
        queue.addAtBeginning(value);
    }

    public void deleteFromQueue(){
        queue.deleteFromTheEnd();
    }

    public void showQueue(){
        if(queue == null){
            System.out.println("fila foi inciada, porem esta vazia");
        }else{
            queue.showFromTheBeginning();
        }
    }
}
