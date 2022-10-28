package br.com.jonas.util;
import java.util.Scanner;

public class CircularDoublyLinkedList {
    private Node start, end, temp;
    private int length = 0;

    public CircularDoublyLinkedList() {
        this.start = this.end = null;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public void addAtBeginning(int value) {
        Node novo = new Node(value);
        if (start == null) {
            novo.setPrev(novo);
            novo.setNext(novo);
            end = novo;
        } else {
            novo.setNext(start);
            start.setPrev(novo);
            novo.setPrev(end);
            end.setNext(novo);
        }
        start = novo;
        length++;
    }

    public void addAtEnd(int value) {
        Node novo = new Node(value);
        if (start == null) {
            start = novo;
            novo.setNext(novo);
            novo.setPrev(novo);
        } else {
            end.setNext(novo);
            novo.setPrev(end);
            temp = end;
            while (temp != start) {
                temp = temp.getPrev();
            }
            novo.setNext(temp);
            start.setPrev(novo);
        }
        end = novo;
        length++;
    }

    public void showFromTheBeginning() {
        temp = start;
        String lista = "";
        if (start == null) {
            System.out.println("Lista: * lista vazia *");
        } else {
            for (int i = 0; i < length; i++) {
                if (temp == end) {
                    lista = lista + temp.getInfo();
                } else {
                    lista = lista + temp.getInfo() + " -> ";
                }
                temp = temp.getNext();
            }
            System.out.println("Lista: [" + lista + "]");
        }
    }

    public void showFromTheEnd() {
        temp = end;
        String lista = "";
        if (start == null) {
            System.out.println("Lista: * lista vazia *");
        } else {
            for (int i = 0; i < length; i++) {
                if (temp == start) {
                    lista = lista + temp.getInfo();
                } else {
                    lista = lista + temp.getInfo() + " -> ";
                }
                temp = temp.getPrev();
            }
            System.out.println("Lista: [" + lista + "]");
        }
    }

    public void addInTheCenter(int value) {
        if (start == end) {
            System.out.println("A lista possui apenas 1 elemento!");
        } else {
            Scanner sc = new Scanner(System.in);
            showFromTheBeginning();
            System.out.println("Na frente de qual elemento deseja inserir?");

            int position = sc.nextInt();
            temp = start;
            Node novo = new Node(value);
            while (temp.getInfo() != position) {
                if (temp == end) {
                    System.out.println("Não existe nenhum elemento com esse valor!");
                    return;
                }
                temp = temp.getNext();
            }
            if (position == end.getInfo()) { // adicionar a partir do ultimo elemento
                temp.setNext(novo);
                novo.setPrev(temp);
                novo.setNext(start);
                end = novo;
            } else {
                Node nx = temp.getNext(); //proximo elemento ligado
                temp.setNext(novo);
                temp.getNext().setNext(nx);
                novo.setPrev(temp);
                end.setPrev(novo);
            }
            length++;
        }
    }

    public void deleteFromTheBeginning() {
        if (start == null) {
            System.out.println("impossível remover, lista está vazia!");
        } else {
            if (start.getPrev() == start) {
                start = end = null;
            } else {
                if (start.getNext() == end) {
                    end.setPrev(end);
                    end.setNext(end);
                    start = end;
                } else {
                    start = start.getNext();
                    end.setNext(start);
                    start.setPrev(end);
                }
            }
            length--;
        }
    }

    public void deleteFromTheEnd() {
        if (start == null) {
            System.out.println("impossível remover, lista já está vazia!");
        } else {
            if (start.getPrev() == start) {
                end = start = null;
            } else {
                if(end.getPrev() == start){
                    start.setPrev(start);
                    start.setNext(start);
                    end = start;
                }else{
                    temp = start;
                    while (temp.getNext() != end) {
                        temp = temp.getNext();
                    }
                    end = temp;
                    end.setNext(start);
                }
            }
            length--;
        }
    }

    public void deleteInTheCenter(int value) {
        if (start.getInfo() == value) {
            start = start.getNext();
            end.setNext(start);
            start.setPrev(end);
        } else if(end.getInfo() == value){
            end = end.getPrev();
            end.setNext(start);
            start.setPrev(end);
        } else {
            temp = start;
            while (temp.getInfo() != value) {
                if (temp == end) {
                    System.out.println("Não existe nenhum elemento com esse valor!");
                    return;
                }
                temp = temp.getNext();
            }
            temp.getNext().setPrev(temp.getPrev());
            temp.getPrev().setNext(temp.getNext());
        }
        length--;
    }
}
