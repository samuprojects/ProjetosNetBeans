/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetonumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class ProjetoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int s = 0;
        int tot = 0;
        int totPar = 0;
        int totImpar = 0;
        int nCem = 0;
        int m;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            tot++;

            if (n >= 100) {
                nCem++;
            }
            if (n % 2 == 0) {
                totPar++;
            } else {
                totImpar++;
            }
        } while (n != 0);
        m = s / (tot - 1); // -1 retira o zero da contagem da média utilizado encerrar a aplicação, apagar em caso de contabilizar o zero na média
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>"
                + "<br>Total de Valores: " + tot
                + "<br>Total de Pares: " + totPar
                + "<br>Total de Ímpares: " + totImpar
                + "<br>Acima de 100: " + nCem
                + "<br>Média dos valores: " + m
                + "</html>",
                "Resultado Final", JOptionPane.WARNING_MESSAGE);
    }

}
