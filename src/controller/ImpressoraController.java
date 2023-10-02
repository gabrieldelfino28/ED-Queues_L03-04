package controller;

import model.Queue;

import java.util.Random;

public class ImpressoraController {
    public ImpressoraController() {
        super();
    }

    public void insereDocumento(Queue<String> fila, String documento) {
        fila.insert(documento);
    }

    Random rnd = new Random();

    public void imprimir(Queue<String> fila) throws Exception {
        String doc = fila.remove();
        String[] console = doc.split(";");
        System.out.println("Iniciando Impressão...");
        Thread.sleep(rnd.nextLong(1000, 2000));
        System.out.println("Arquivo imprimido: [#PC: " + console[0] + " – Arquivo: "+ console[1]+"_Arquivo]");
    }
}
