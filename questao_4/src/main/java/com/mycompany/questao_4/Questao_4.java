/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao_4;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */

public class Questao_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String num;
        int numOne;
        
        num = JOptionPane.showInputDialog(null, "Entre com um numero:");
        
        numOne = parseInt(num);
        
        JOptionPane.showMessageDialog(null, "O antecessor:"+(numOne-1)+"\nSucessor:"+(numOne + 1));
    }
}
