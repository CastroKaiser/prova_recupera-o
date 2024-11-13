/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_6;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int saida, soma = 0, qtd = 0;
        float media;
        boolean verificador = false;
        
        while (verificador == false) {
            System.out.print("Insira um numero ou 0(zero) para sair:");
            saida = ler.nextInt();
            if (saida == 0) {
                System.out.println("Obrigado por me usar");
                verificador = true;
            }else {
                qtd++;
                soma += saida;
            }
        }
        media = soma/qtd;
        
        System.out.println("Media:"+media+"\nSoma:"+soma+"\nQuantidade:"+qtd);
        
        
    }
}
