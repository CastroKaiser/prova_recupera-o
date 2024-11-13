/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_2;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_2 {

    public static void main(String[] args) {
        int anos, meses, dias, resultado;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite quantos anos você tem:");
        anos = ler.nextInt();
        
        System.out.print("Digite quantos meses você tem:");
        meses = ler.nextInt();
        
        System.out.print("Digite quantos dias você tem:");
        dias = ler.nextInt();
        
        resultado = (anos * 365) + (meses * 30) + dias;
        
        System.out.println(anos+" anos,"+meses+" meses, "+dias+" dias = "+ resultado);
    }
}
