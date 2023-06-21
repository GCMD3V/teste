public import javax.swing.*;

public class InterfaceGrafica {

    public static void main(String[] args) {

        // Criação da janela principal
        JFrame janela = new JFrame("Minha Janela");
        janela.setSize(400, 300); // define o tamanho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define o comportamento da janela ao ser fechada
        janela.setLayout(new BorderLayout()); // define o layout da janela como BorderLayout

        // Criação dos componentes visuais
        JLabel rotulo = new JLabel("Digite um número:");
        JTextField campoTexto = new JTextField(10);
        JButton botao = new JButton("Calcular");

        // Adição dos componentes visuais à janela
        janela.add(rotulo, BorderLayout.WEST);
        janela.add(campoTexto, BorderLayout.CENTER);
        janela.add(botao, BorderLayout.SOUTH);

        // Registro do evento do botão
        botao.addActionListener(e -> {
            String valor = campoTexto.getText(); // obtém o valor digitado no campo de texto
            int numero = Integer.parseInt(valor); // converte o valor para inteiro
            int resultado = calcularFatorial(numero); // chama o método de cálculo do fatorial
            JOptionPane.showMessageDialog(janela, "O fatorial de " + numero + " é " + resultado); // exibe o resultado em uma janela de diálogo
        });

        // Exibição da janela
        janela.setVisible(true);
    }

    // Método para cálculo do fatorial
    private static int calcularFatorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
 {
    
}
