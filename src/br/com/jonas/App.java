package br.com.jonas;

import br.com.jonas.menu.Menu;
import br.com.jonas.util.CircularDoublyLinkedList;
import br.com.jonas.util.Queue;
import br.com.jonas.util.Stack;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        Stack stack = new Stack();
        Queue queue = new Queue();
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        boolean inicio = true;
        System.out.println("-=-=-=-=- Estrutura de Dados -=-=-=-=-");
        do {
            System.out.println("Qual estrura de dados deseja usar? ");
            System.out.println("(1) Lista Circular duplamente ligada ");
            System.out.println("(2) Pilha ");
            System.out.println("(3) Fila ");
            System.out.println("(4) Sair ");
            int structure = sc.nextInt();
            if(structure == 1){
                menu.menuLinkedList(list);
            }else if(structure == 2){
                menu.menuStack(stack);
            }else if(structure == 3){
                menu.menuQueue(queue);
            }else if(structure == 4){
                System.out.println("Adeus!");
                inicio = false;
            }
        }while(inicio);
        sc.close();
    }
}

