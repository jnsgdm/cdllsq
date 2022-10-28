package br.com.jonas.menu;

import br.com.jonas.util.CircularDoublyLinkedList;
import br.com.jonas.util.Queue;
import br.com.jonas.util.Stack;

import java.util.Scanner;

public class Menu {

    public void menuLinkedList(CircularDoublyLinkedList list){
        boolean execute = true;
        System.out.println("=-=-=-= Lista Circular Duplamente Ligada =-=-=-=");
        do{
            System.out.println("(1) inserir no inicio ");
            System.out.println("(2) inserir no fim");
            System.out.println("(3) imprimir do inicio");
            System.out.println("(4) imprimir do fim");
            System.out.println("(5) inserir no meio ");
            System.out.println("(6) deletar do inicio ");
            System.out.println("(7) deletar do fim");
            System.out.println("(8) deletar do meio ");
            System.out.println("(9) voltar");
            System.out.println("qual opção executar? ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if(option == 1) {
                System.out.println("Digie um inteiro:");
                int valor = sc.nextInt();
                list.addAtBeginning(valor);
            }else if(option == 2) {
                System.out.println("Digite um inteiro: ");
                int valor = sc.nextInt();
                list.addAtEnd(valor);
            }else if(option == 3){
                list.showFromTheBeginning();
            }else if(option == 4) {
                list.showFromTheEnd();
            }else if(option == 5) {
                System.out.println("digie o valor que deseja inserir");
                int valor = sc.nextInt();
                list.addInTheCenter(valor);
            }else if(option == 6) {
                list.deleteFromTheBeginning();
            }else if(option == 7) {
                list.deleteFromTheEnd();
            }else if(option == 8) {
                System.out.println("digie o valor que deseja excluir:");
                int valor = sc.nextInt();
                list.deleteInTheCenter(valor);
            }else if(option == 9) {
                execute = false;
            }
        }while(execute);
    }

    public void menuStack(Stack stack){
        boolean execute = true;
        System.out.println("=-=-=-= Pilha =-=-=-=");
        do{
            System.out.println("(1) push ");
            System.out.println("(2) pop");
            System.out.println("(3) top");
            System.out.println("(4) imprimir pilha");
            System.out.println("(5) voltar");
            System.out.println("qual opção executar? ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if(option == 1) {
                System.out.println("digite o valo que deseja inserir:");
                int value = sc.nextInt();
                stack.push(value);
            }else if(option == 2) {
                stack.pop();
            }else if(option == 3){
                stack.top();
            }else if(option == 4) {
                stack.showStack();
            }else if(option == 5){
                execute = false;
            }
        }while (execute);
    }

    public void menuQueue(Queue queue){
        boolean execute = true;
        System.out.println("=-=-=-= Fila =-=-=-=");
        do{
            System.out.println("(1) adicionar na fila");
            System.out.println("(2) deletar da fila");
            System.out.println("(3) imprimir fila");
            System.out.println("(4) voltar");
            System.out.println("qual opção executar? ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            if(option == 1) {
                System.out.println("digite o valo que deseja inserir:");
                int value = sc.nextInt();
                queue.addInTheQueue(value);
            }else if(option == 2) {
                queue.deleteFromQueue();
            }else if(option == 3){
                queue.showQueue();
            }else if(option == 4) {
                execute = false;
            }
        }while (execute);
    }
}
