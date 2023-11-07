package resolucaotela;

import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int largura = (int) toolkit.getScreenSize().getWidth();
        int altura = (int) toolkit.getScreenSize().getHeight();

        System.out.println("A resolução da tela atual é: " + largura + " x " + altura + " pixels");

    }

}
