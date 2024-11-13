/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Questao_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float peso;
        
        System.out.print("Insira o nome do lutador:");
        nome = ler.nextLine();
        
        System.out.println("Insira o peso do lutador:");
        peso = ler.nextFloat();
        
        try (FileWriter arquivo = new FileWriter("C:\\Users\\c.nunes\\Desktop\\TABUADA.TXT")) {
            PrintWriter gravar = new PrintWriter(arquivo);
            
            if (peso >= 65) {
                gravar.println("Nome fornecido:"+nome+"\n" +
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria pena");
            } else if (peso <= 72) {
                gravar.println("Nome fornecido:"+nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria leve");
            } else if (peso <= 79) {
                gravar.println("Nome fornecido:" +nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Ligeiro");
            } else if (peso < 86) {
                gravar.println("Nome fornecido:" +nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria meio medio");
            } else if (peso < 93) {
                gravar.println("Nome fornecido:" +nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Medio");
            } else if (peso <= 100) {
                gravar.println("Nome fornecido:" +nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria meio pesado");
            } else {
                gravar.println("Nome fornecido:" +nome+"\n"+
                "\n" +
                "Peso fornecido:"+peso+"\n" +
                "\n" +
                "Saída exibida no TXT: O lutador "+nome+" pesa "+peso+"kg e se enquadra na categoria Pesado");
            }
            arquivo.close();
            gravar.close();
        } catch (IOException e) {
            System.out.println("ERRO:"+e.getMessage());
        }
        
    }
}
