/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_10;

/**
 *
 * @author c.nunes
 */
public class Questao_10 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;

        a += 3;

        b = a++ + ++b;

        c = b % a;

        System.out.println(a+b+c);
    }
}
