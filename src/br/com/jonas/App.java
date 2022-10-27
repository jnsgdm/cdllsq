package br.com.jonas;

import br.com.jonas.util.CircularDoublyLinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        boolean inicio = true;
        System.out.println("-=-=-=-=- Lista Ligada -=-=-=-=-");
        do {
            System.out.println("Qual estrura de dados deseja usar? ");
            int option = sc.nextInt();

            System.out.println("(1) adicionar no inicio");
            System.out.println("(2) adicionar no fim");
            System.out.println("(3) mostrar do inicio");
            System.out.println("(4) mostrar do final");
            System.out.println("(5) inserir no meio");
            System.out.println("(6) remover no inicio");
            System.out.println("(7) remover no final");
            System.out.println("(8) remover no meio");


            int opcao = sc.nextInt();
            if(opcao == 1) {
                System.out.println("Digie um inteiro:");
                int valor = sc.nextInt();
                list.addAtBeginning(valor);
            }else if(opcao == 2) {
                System.out.println("Digite um inteiro: ");
                int valor = sc.nextInt();
                list.addAtEnd(valor);
            }else if(opcao == 3){
                list.showFromTheBeginning();
            }else if(opcao == 4) {
                list.showFromTheEnd();
            }else if(opcao == 5) {
                System.out.println("digie o valor que deseja inserir");
                int valor = sc.nextInt();
                list.addInTheCenter(valor);
            }else if(opcao == 6) {
                list.deleteFromTheBeginning();
            }else if(opcao == 7) {
                list.deleteFromTheEnd();
            }else if(opcao == 8) {
                System.out.println("digie o valor que deseja excluir:");
                int valor = sc.nextInt();
                list.deleteInTheCenter(valor);
            }else if(opcao == 9) {
                System.out.println("ADEUS!");
                inicio = false;
            }
        }while(inicio);
        sc.close();
    }
}

