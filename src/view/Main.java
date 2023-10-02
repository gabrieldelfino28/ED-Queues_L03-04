package view;

import controller.ImpressoraController;

import model.Queue;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue<String> filaImpressao = new Queue<>();
        ImpressoraController ic = new ImpressoraController();
        String menu = "";
        do {
            try {
                menu = JOptionPane.showInputDialog("Impressora\n1- Inserir Documentos\n2- Imprimir\n3- Tamanho da Fila\n9- Fim");
                switch (menu) {
                    case "1" -> {
                        int ID = Integer.parseInt(JOptionPane.showInputDialog("Informe o PC_ID"));
                        String nome = JOptionPane.showInputDialog("Informe o nome do documento: ");
                        String arquivo = ID + ";" + nome; //ID_PC;Nome_Arquivo
                        ic.insereDocumento(filaImpressao, arquivo);
                    }

                    case "2" -> ic.imprimir(filaImpressao);
                    case "3" -> System.out.println("Tamanho da fila de impressao: "+filaImpressao.size());
                    case "9" -> System.exit(0);
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }while (true);
    }
}
