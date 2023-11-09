/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author samuel
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1,n2,r;
        n1 = 14;
        n2 = 8;
        r = (n1 > n2) ? n1+n2 : n1-n2;  // se o resultado for true faça o que está após o ?, se for false faça o que está após o :
        System.out.println(r);
    }
    
}
