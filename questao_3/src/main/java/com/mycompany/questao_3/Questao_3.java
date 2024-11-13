/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_3;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
//Faça um programa de controle de máquina de café, levando em consideração:
//A máquina irá fazer repetidamente a leitura das seguintes opções: 1 - café expresso; 2 - café capuccino; 3 - leite com café; 4 - totalizar vendas;
//• As opções de 1 a 3 realizam pedidos de café, que recebem respectivamente R$ 0,75, R$ 1,00 e R$ 1,25 em moeda;
//• A opção 4 realiza a totalização dos cafés vendidos, finalizando a venda até o momento, imprimindo um relatório com as seguintes informações:
//• quantidade e valor de café expresso vendido;
//• quantidade e valor de café capuccino vendido;
//• quantidade e valor de leite com café vendido;
//• quantidade e valor de todos cafés vendidos;
//Observação:
//• considere que inicialmente as quantidades de cafés vendidos são nulos e que a máquina irá verificar se a opção digitada é válida ou não, repetindo a leitura, até que uma entrada válida seja fornecida.
public class Questao_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean verificador = false;
        int escolha, totalCafe = 0;
        int[] cafes = new int[3];
        float[] valores = new float[3];
        float total = 0;
        
        
        while(verificador == false){
            System.out.print("Digite a sua escolha:\n1 - Cafe expresso\n2 - Cafe capuccino\n3 - Leite com cafe\n4 - totalizar vendas");
            escolha = ler.nextInt();
            
            if (escolha <= 3 && escolha >= 1) {
                cafes[escolha - 1] ++;
                totalCafe ++;
                if (escolha == 1) {
                    valores[0] += 0.75;
                    total += 0.75;
                }else if (escolha == 2) {
                    valores[1] += 1.00;
                    total += 1.00;
                }else {
                    valores[2] += 1.25;
                    total += 1.25;
                }
            }else if (escolha == 4) {
                System.out.println("Cafe Expresso\nQuantidade:"+cafes[0]+" | Valor:"+valores[0]);
                System.out.println("Cafe Capuccino\nQuantidade:"+cafes[1]+" | Valor:"+valores[1]);
                System.out.println("Leite com Cafe\nQuantidade:"+cafes[2]+" | Valor:"+valores[2]);
                System.out.println("Quantidade total cafe vendido:"+totalCafe);
                System.out.println("Valor total cafe vendido:"+total);
                verificador = true;
            } else {
                System.out.println("Opcao invalida, digite outro numero!");
            }
        }
    }
}
