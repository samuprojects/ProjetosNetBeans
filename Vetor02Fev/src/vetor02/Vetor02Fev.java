/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author samuel
 */
public class Vetor02Fev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
        "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // inclusão da verificação ano bissexto
        //LocalDate dataAtual = LocalDate.of(2004, Month.MARCH, 10); // linha de teste para mudança ano manualmente
        LocalDate dataAtual = LocalDate.now(); // linha que traz o ano atual, comentar caso queira testar com a linha acima
        if (dataAtual.isLeapYear()){ // método de LocalDate que verifica se o ano é bissexto
            tot[1] = 29; // alteração do índice 1 do vetor correspondente ao mês de Fev
        }
        
        for (int c = 0; c < mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " +
                    tot[c] + " dias ao todo.");
        }
    }
    
}
