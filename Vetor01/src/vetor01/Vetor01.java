/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author samuel
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3, 2, 8, 7, 5, 4};
        //System.out.println("Total de casas de N " + n.length);
        //for (int c = 0; c <= 5; c++){
        for (int c = 0; c <= n.length -1; c++){ // aqui serve para iterar com qualquer tamanho de vetor
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
