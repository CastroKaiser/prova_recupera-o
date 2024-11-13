/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_8 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.print("Digite um numero:");
        num = ler.nextInt();
        try (FileWriter arquivo = new FileWriter("C:\\Users\\c.nunes\\Desktop\\TABUADA.TXT")) {
            PrintWriter gravar = new PrintWriter(arquivo);
            for (int i = 0; i < 11; i++) {
                gravar.println(i+" X "+num+" = "+(i * num)+"\n");
            }
            gravar.close();
            arquivo.close();
        } catch (IOException e) {
            System.out.println("ERRO:"+e.getMessage());
        }
    }
}
