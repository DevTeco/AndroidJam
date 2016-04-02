# AndroidJam

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecadeiras;

import java.util.Scanner;

/**
 *
 * @author 86012922590
 */
public class TesteCadeiras {

    /**
     * @param args the command line arguments
     */
    static int colunas = 20;
    static private int fileiras = 40;
    static private double res;
    static int coluna_res;
    static int fileira_res;
    static Scanner ler;
    public static void main(String[] args) {
        // TODO code application logic here
         ler = new Scanner(System.in);
        calcular();
        
    }
    
    static void calcular(){
        int cadeira = ler.nextInt();
        
        int aux = (int)(cadeira/colunas);
        if(cadeira != 20){
            coluna_res = aux+1;
            
            fileira_res = cadeira-(colunas*aux);
        }else{
             coluna_res = 20;
            
            fileira_res = 1;
        }
        
        System.out.println("Columa: "+coluna_res+" / Fileira: "+fileira_res);
    }
    
}
